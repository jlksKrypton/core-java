package patterns.creational.singleton;

public class Enum {

	public static void main(String[] args) {	
		oneenumobj a=oneenumobj.Instance;
		a.i=5;
		System.out.println(a.i);
		oneenumobj b=oneenumobj.Instance;
		b.i=6;
		System.out.println(a.i);
	}
}

enum oneenumobj
{
	Instance;
	static int i;
	public static int  getval()
	{
		return i;
	}
}
