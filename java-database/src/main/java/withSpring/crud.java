package withSpring;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

public class crud {
	String query;
	JdbcTemplate jt;
	NamedParameterJdbcTemplate njt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void setNjt(NamedParameterJdbcTemplate njt) {
		this.njt = njt;
	}
	
	public void insert(employee e)
	{
		query="Insert into employees(id,name) values ("+e.getId()+",\""+e.getName()+"\");";
		jt.update(query);
	}

	public Boolean preparedInsert(employee e)
	{
		query="Insert into employees values (?,?)";
		return  jt.execute(query, (PreparedStatement ps) -> {
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				return ps.execute();});
	}
	
	public void namedInsert(employee e)
	{
		query="Insert into employees values (:id,:name)";
		Map<String,Object> m=new HashMap<>();
		m.put("id", e.getId());
		m.put("name", e.getName());
		njt.execute(query, m, (PreparedStatement ps) -> {return ps.execute();});
	}
	
	public void delete(employee e)
	{
		query="delete from employees where employees.id="+e.getId();
		jt.update(query);
	}
	
	public void update(employee e)
	{
		query="update employees set employees.name=\""+e.getName()+"\" where employees.id="+e.getId();
		jt.update(query);
	}
	
	public List<employee> extractAllResultSetExtractor()
	{
		query = "select * from employees";
		return (List<employee>) jt.query(query, (ResultSet rs) -> {
			List<employee> l=new ArrayList<>();
			while(rs.next())
			{
				employee e=new employee(rs.getInt(1),rs.getString(2));
				l.add(e);
			}
			return l;});
	}
	
	public List<employee> extractAllRowMapper()
	{
		query = "select * from employees";
		return  jt.query(query, (ResultSet rs,int rn) -> 
		{return new employee(rs.getInt(1),rs.getString(2));});
	}
	
}
