package generics;


public class genMethod {
	
	public static <T> T genMthd(T a,T b)
	{
		return a+b;
	}
	
	public static void main(String args[])
	{
		String a=new String("Suhas");
		String b=new String(" Hasi");
		System.out.println(genMethod.<String>genMthd(a,b));
		System.out.println(genMethod.<Integer>genMthd(1,2));
	}

}
