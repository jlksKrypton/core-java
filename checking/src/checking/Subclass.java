package checking;

public class Subclass extends Superclass{
	
	static final int Static_Final = 47;
	static final int Static_Final2 = (int)Math.random()*5;
	static 
	{
		System.out.println("Sub class: static initializer");
	}
	
	Subclass()
	{
		System.out.println("Sub class: Constructor");
	}

}
