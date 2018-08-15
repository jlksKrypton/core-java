package exam;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Application {
	
	static {
		
	}

	public static void main(String[] args) {
		//TODO: create a list of employee (may be five items)
		List<Employee> li=new ArrayList<Employee>(5);
		li.add(new Employee("Suhas","Jaladi",new Address(1111,"J street","davis","CA",95616),new Address(1111,"J street","davis","CA",95616)));
		li.add(new Employee("masood","Habib",new Address(7730,"Hanover","greenbelt","maryland",20770),new Address(7730,"Hanover","greenbelt","maryland",20770)));
		li.add(new Employee("prithvi","o",new Address(1,"o street","p","Ar",1),new Address(1,"o street","p","Ar",1)));
		li.add(new Employee("Shasi","n",new Address(2,"n street","q","NY",2),new Address(2,"n street","q","NY",2)));
		li.add(new Employee("abc","m",new Address(3,"m street","q","NJ",3),new Address(3,"m street","q","NJ",3)));
		
		System.out.println("Sort by last name of the employee");
		//TODO: sort the list using last name of the employee
		Collections.sort(li, (o1, o2) -> (o1.getLastName()).compareTo(o2.getLastName()));
		li.forEach(System.out::println);
		
		System.out.println("\nSort by zip code of the mailing address");
		//TODO: sort the list using the zip code of the mailing address
		Collections.sort(li, (o1, o2) -> (new Integer(o1.getMailingAddress().getZipcode())).compareTo(new Integer(o2.getMailingAddress().getZipcode())));
		li.forEach(System.out::println);
		
		System.out.println("\nemployee(s) by the last name which contain a given string");
		//TODO: find a employee(s) by the last name which contain a given string
		for(Employee e:li)if(e.getLastName().contains("a"))System.out.println(e);
		
		System.out.println("\nunique employee by 1)last name, 2)first name and 3)permanent address");
		//TODO: create a set of employees (may be five items) where unique employee should be defined by their
		//1)last name, 2)first name and 3)permanent address
		Set<Employee> s=new HashSet<Employee>(5);
		for(Employee e:li)s.add(e);
		for(Employee e:s)System.out.println(e);
		
		
		System.out.println("\nremove all of the addresses of all employees");
//		TODO: remove all of the addresses (may be set it to null) of all employees and return them in a list
		for(Employee e:li){e.setPermanentAddress(null);e.setMailingAddress(null);}
		for(Employee e:li)System.out.println(e);
		
		System.out.println("\nremove by iterator");
		Iterator<Employee> ite=s.iterator();
		while(ite.hasNext())
		{
			Employee localEmp=ite.next();
			if(localEmp.getFirstName()=="Suhas")ite.remove();
			System.out.println(s);
		}
				
	}

}