package checking;

public class classInitializer {
	
	static
	{
		System.out.println("Class Initialzer: Static Initialzer"); 
	}
	
	public classInitializer() {
		System.out.println("Class Initialzer: Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Subclass.Static_Final : "+ Subclass.Static_Final);
		System.out.println("Subclass.Static_Final : "+ Subclass.Static_Final2);
		new Subclass();
	}
}
