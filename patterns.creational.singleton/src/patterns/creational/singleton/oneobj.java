package patterns.creational.singleton;

public class oneobj {

	private static oneobj obj;
	
	private oneobj()
	{
		System.out.println("object created");
	}
	public static oneobj getobj() 
	{
		obj=new oneobj();
		return obj;
	}
}
