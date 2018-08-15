import java.lang.String;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class string {

	public static void main(String[] args) {
		
		String[] names= {"suhas","masood", "prithvi","shasi"};
		String name="Suhas";
		String doop=new String("Suhas");
		String marks ="boy";
		System.out.println(name.equals(names[0]));
		System.out.println(names[0].compareTo(name));
		System.out.println(names[0].compareToIgnoreCase(name));
		System.out.println(Arrays.toString(names[1].split("o")));
		System.out.println(names[0].contains(Character.toString(name.charAt(1))));
		System.out.println(names[0].contains("A".toLowerCase()));
		for(String a:names)System.out.print(a.length());
		System.out.println(names[1].replaceAll("o","a"));
		System.out.println(names[1].replace('o','a'));
		System.out.println(names[1].replace("o","a"));
		System.out.println(names[1].replaceFirst("o","a"));
		System.out.println(name.format(Locale.US,"hello %s", 10+"2"));
		System.out.println(names[1].subSequence(0, 2));
		System.out.println(names[1].substring(0, 2));
		System.out.println(names[1]+" "+name);
		System.out.println(names[1].concat(name));
		System.out.println(name.equals(doop));
		System.out.println(name==doop);
		doop=doop.intern();
		System.out.println(name==doop);
		printOpposite("man");

		//...................regex Patterns..................
		
		Pattern p =Pattern.compile("[Ss]\\w...");
		Matcher matcher =p.matcher("Suhas helloma Sajfbkaj aksvkabckj");
		while(matcher.find())System.out.println("found "+matcher.group() +" start at "+matcher.start()+" end at "+matcher.end());
		String temp="hello wats'up people here's our prize!";
		String gmail="krishnasuhas9@gmail.com.com.com";
		System.out.println("regex result : "+matcher.matches());
		System.out.println("regex easy result : "+name.matches("\\w+"));
		System.out.println("regex number result : "+gmail.matches("\\w+[1-9]@\\w+(.\\w+)\\1\\1"));
		String announ="hello<><Chirala$Good@@@#morning! Suhas came to chirala";
		System.out.println(Arrays.toString(announ.split("\\W+")));
		System.out.println(matcher.replaceAll("***"));
		
	}
	
	static void printOpposite(String a)
	{
		switch(a)
		{
			case "boy":
				System.out.println("girl");
				break;
			case "girl":
				System.out.println("boy");
				break;
			case "women":
				System.out.println("man");
				break;
			case "man":
				System.out.println("women");
				break;
			default:
				System.out.println("Unknown");
		}
	}
	
	
	
}