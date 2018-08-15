package withOutSpring;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "suhas123");
		System.out.println("connection Succesfull");
		
		Statement st= con.createStatement();
//		st.executeUpdate("CREATE TABLE student (roll varchar(5), name varchar(25),dept varchar(10));");
//		st.executeUpdate("INSERT INTO student VALUES(\"1a\",\"Suhas\",\"CSE\");");
//		st.executeUpdate("INSERT INTO student VALUES(\"2b\",\"abc\",\"CSE\");");
//		st.executeUpdate("INSERT INTO student VALUES(\"3c\",\"pqr\",\"CSE\");");
//		st.executeUpdate("INSERT INTO student VALUES(\"4d\",\"def\",\"MECH\");");
//		st.executeUpdate("INSERT INTO student VALUES(\"5e\",\"uvw\",\"ECE\");");
//		st.executeUpdate("INSERT INTO student VALUES(\"6f\",\"mno\",\"ECE\");");
//		ResultSet rs= st.executeQuery("select * from student;");
//		while(rs.next())System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		
		CallableStatement cst =con.prepareCall("{call insertr (?,?,?)}");
		cst.setString(1, "7g");
		cst.setString(2, "a");
		cst.setString(3, "b");
		cst.execute();
		
		System.out.println("after :");
		ResultSet rs= st.executeQuery("select * from student;");
		while(rs.next())System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		
		con.close();
	}
}
