package autoBoxing;

public class autoBoxing {

	public static void main(String[] args) {
		
		int i=new Integer(1);
		Integer I = (int)11;
		pass(i);
		pass(I);
	}
	
	static void pass(Integer I)
	{
		System.out.println("Integer");
	}
}
