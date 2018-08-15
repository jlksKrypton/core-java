package database;

/* 
 * 1) import packages
 * 2) load and register data
 * 3) create a connection
 * 4) create a statement
 * 5) execute the query
 * 6) Process the results
 * 7) close
 */


import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class abc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Suhas123.");
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select * from actor;");
		while(rs.next())System.out.println(rs.getString(1)+" "+rs.getString(2));
		st.close();
		con.close();
	}
}
