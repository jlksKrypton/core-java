package interview;

import java.io.*;
import java.util.*;

public class randvals {

	public static void main(String[] args) {
		
		int num=10;
		Random rn=new Random();
		Map<Integer, Integer> a= new HashMap<Integer,Integer>((int)(num*1.25));
		List<Integer> li=new ArrayList<Integer>();
		Map<Integer, Integer> b= new HashMap<Integer,Integer>((int)(num*1.25));
		Set<Integer> s;
		
		//insertion rand vals into hashMap
		
		for(int i=0;i<num;i++)
		{
			int r=rn.nextInt(num);
			int r2=rn.nextInt(num);
			if(a.containsKey(r))a.put(r, a.get(r)+1);
			else a.put(r,1);
			if(b.containsKey(r))b.put(r, b.get(r)+1);
			else b.put(r2,1);
		}
		System.out.println("\nprint all in a:");
		a.keySet().forEach(System.out::println);
		System.out.println("\nprint all in b:");
		b.keySet().forEach(System.out::println);
		
		
		int nondup=0;
		//printing how many unique values 
		for(int p:a.keySet())
			{
				if(a.get(p)==1)nondup++;
				else li.add(a.get(p));
			}
		System.out.println("\nnumber of unique values :"+nondup);
		
		//printing doop's
		System.out.println("doop values :");
		for(int p:li)System.out.print(p+" ");
		
		
		//union of two 2 lists
		s=new HashSet<Integer>(b.keySet());
		for(int p:a.keySet())s.add(p);
		System.out.println("\n union values :");
		for(int m:s)System.out.print(m+" ");
		
		
		//intersection
		List<Integer> inte=new ArrayList<>();
		for(int m:a.keySet())if(b.containsKey(m))inte.add(m);
		
		
		
		System.out.println("\n intersection values :");
		inte.forEach(System.out::println);
		
		
	}
}
