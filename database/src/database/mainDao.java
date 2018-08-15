package database;

public class mainDao
{
	public static void main(String[] args) throws Exception 
	{	
		dao d=new dao();
		d.createTable("student (roll varchar(5), name varchar(25),dept varchar(10))");
		d.insertVal(new String[] {"student(roll, name,dept)","1a","Suhas","CSE"});
		d.insertVal(new String[] {"student (roll, name,dept)","2a","Masood","CHEM"});
		d.insertVal(new String[] {"student (roll, name,dept)","3a","prithvi","ECE"});
		d.insertVal(new String[] {"student (roll, name,dept)","4a","Shasi","CSE"});
		d.insertVal(new String[] {"student (roll, name,dept)","5a","abc","CSE"});
		d.insertVal(new String[] {"student (roll, name,dept)","6a","mno","CSE"});
		d.insertVal(new String[] {"student (roll, name,dept)","7a","pqr","CHEM"});
		d.printTable(new String[] {"student"});
		d.getVal(new String[] {"student","dept","CSE"});
		d.dropTable(new String[] {"student"});
	}
}