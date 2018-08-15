import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class hashequals {

	public static void main(String[] args) {
	
		HashSet<course> hs=new HashSet<course>();
		List<course> li=new ArrayList<course>();
		course c1=new course(1,"a");
		course c2=new course(2,"b");
		course c3=new course(3,"c");
		course c4=new course(1,"a");
		course c5=new course(2,"b");
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		hs.add(c5);
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(c4);
		li.add(c5);
		System.out.println("Hash Set:" );
		for(course c: hs)System.out.println(c.getId());
		System.out.println("array list:" );
		for(course l: li)System.out.println(l.getId());
		System.out.println("hashCode():" );
		for(course l: li)System.out.println(l.hashCode());
		System.out.println("default hashCode():" );
		for(course l: li)System.out.println(l.hashCode2());
	}
}
