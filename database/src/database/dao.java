package database;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class dao {
	
	Connection con;
	void getCon() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?autoReconnect=true&useSSL=false","root","Suhas123.");
	}
	
	void createTable(String input) throws Exception
	{
		getCon();
		Statement st=con.createStatement();
		st.executeUpdate("CREATE TABLE "+ input + ";");
		st.close();
		con.close();
	}

	void insertVal(String[] args) throws Exception
	{
		getCon();
		Statement st=con.createStatement();
		st.executeUpdate("INSERT INTO "+ args[0] + " VALUES("+"\""+args[1]+"\","+"\""+args[2]+"\","+"\""+args[3]+"\""+");");
		st.close();
		con.close();
	}
	
	void printTable(String args[]) throws Exception
	{
		getCon();
		Statement st=con.createStatement();
		System.out.println("Showing full table :\n");
		ResultSet rs= st.executeQuery("select * from "+args[0]+";");
		while(rs.next())System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		st.close();
		con.close();
	}
	
	void dropTable(String[] args) throws Exception
	{
		getCon();
		Statement st=con.createStatement();
		System.out.println("\n table dropped\n");
		st.executeUpdate("drop table "+ args[0]);
		st.close();
		con.close();
	}
	
	void getVal(String[] args) throws Exception
	{
		getCon();
		Statement st=con.createStatement();
		System.out.println("\n On Executing given query:\n");
		ResultSet rs=st.executeQuery("SELECT * FROM "+ args[0] + " WHERE "+ args[1] + " = "+"\""+args[2]+"\"");
		while(rs.next())System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		st.close();
		con.close();
	}
}