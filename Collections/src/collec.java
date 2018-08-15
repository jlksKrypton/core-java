import java.util.Collections;
import java.lang.String;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Queue;
import java.util.PriorityQueue;

import java.util.Deque;
import java.util.ArrayDeque;


import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;



public class collec {
	
	public static void main(String args[])
	{
		System.out.println("\n................................................Initializations.................................................");
		
		String[] arr= {"Suhas", "Masood", "Prithvi", "Shasi", "Selvin"};
		String[] arr2= {"temp1", "temp2", "temp3"};
		
		System.out.println("Defualt Array is \t "+Arrays.toString(arr));
		
		List<String> a_list=new ArrayList(Arrays.asList(arr));
		List<String> l_list=new LinkedList(Arrays.asList(arr));
		System.out.println("LinkedList is \t "+l_list);
		
		Queue<String> p_queue=new PriorityQueue(a_list);
		System.out.println("PriorityQueue is \t "+p_queue);
		
		Deque<String> a_deque=new ArrayDeque(a_list);
		System.out.println("ArrayDeque is \t "+a_deque);
		
		Set<String> h_set=new HashSet(Arrays.asList(arr));
		System.out.println("HashSet is \t "+h_set);
		Set<String> lh_set=new LinkedHashSet(Arrays.asList(arr));
		System.out.println("LinkedHashSet is \t "+lh_set);
		Set<String> t_set=new TreeSet(Arrays.asList(arr));
		System.out.println("TreeSet is \t "+t_set);
		
		Map<String,String> h_map=new HashMap<String,String>();
		for(String a:arr)h_map.put(a, a);
		System.out.println("HashMap is \t "+h_map);
		Map<String,String> lh_map=new LinkedHashMap<String,String>();
		for(String a:arr)lh_map.put(a, a);
		System.out.println("LinkedHashMap is \t "+lh_map);
		Map<String,String> t_map=new TreeMap<String,String>();
		for(String a:arr)t_map.put(a, a);
		System.out.println("TreeMap is \t "+t_map);
		
		System.out.println("\n................................................Array List Operations.................................................");
		
		System.out.println("\nArrayList is \t "+a_list);
		a_list.addAll(3,Arrays.asList(arr2));				//appending list of elements
		System.out.println("\nArrayList is \t "+a_list);
		List b_list=new ArrayList(a_list);
		Collections.sort(b_list);
		System.out.println("\nnew ArrayList is \t "+b_list);
		b_list.clear();		
		System.out.println("\nnew ArrayList is \t "+b_list);
		System.out.println("\n contains ArrayList is \t "+a_list.contains("suhas"));
		System.out.println("\n index of ArrayList is \t "+a_list.indexOf("suhas"));
		System.out.println("\n get ArrayList is \t "+a_list.get(0));
		System.out.println("\n is empty ArrayList is \t "+a_list.isEmpty());
		System.out.println("\n is removeall ArrayList is \t "+a_list.removeAll(Arrays.asList(arr2)));
		System.out.println("\n size of ArrayList is \t "+a_list.size());
		System.out.println("\n set ArrayList is \t "+a_list.set(0,"hello"));
		System.out.println("\n sublist ArrayList is \t "+a_list.subList(0,2));
		Iterator iter=a_list.iterator();
		while(iter.hasNext())System.out.print(iter.next());
		
		
		System.out.println("\n................................................Linked List Operations.................................................");
		
		System.out.println("\nLinkedList is \t "+l_list);
		l_list.addAll(3,Arrays.asList(arr2));				//appending list of elements
		System.out.println("\nLinkedList is \t "+l_list);
		b_list=new LinkedList(l_list);
		System.out.println("\n contains LinkedList is \t "+l_list.contains("suhas"));
		System.out.println("\n index of LinkedList is \t "+l_list.indexOf("suhas"));
		System.out.println("\n get LinkedList is \t "+l_list.get(0));
		System.out.println("\n is empty LinkedList is \t "+l_list.isEmpty());
		System.out.println("\n is removeall LinkedList is \t "+l_list.removeAll(Arrays.asList(arr2)));
		System.out.println("\n size of LinkedList is \t "+l_list.size());
		System.out.println("\n set LinkedList is \t "+l_list.set(0,"hello"));
		System.out.println("\n sublist LinkedList is \t "+l_list.subList(0,2));
		iter=l_list.iterator();
		while(iter.hasNext())System.out.print(iter.next());
		
		
		System.out.println("\n................................................Priority Queue Operations.................................................");
		
		System.out.println("\nPriorityQueue is \t "+p_queue);
		p_queue.addAll(Arrays.asList(arr2));				//appending list of elements
		System.out.println("\nPriorityQueue is \t "+p_queue);
		System.out.println("\n contains PriorityQueue is \t "+p_queue.contains("suhas"));
		System.out.println("\n offer of PriorityQueue is \t "+p_queue.offer("temp100"));
		System.out.println("\n peek PriorityQueue is \t "+p_queue.peek());
		System.out.println("\n is poll PriorityQueue is \t "+p_queue.poll());
		System.out.println("\n is remove PriorityQueue is \t "+p_queue.remove("temp100"));
		System.out.println("\n size of PriorityQueue is \t "+p_queue.size());
		iter=p_queue.iterator();
		while(iter.hasNext())System.out.print(iter.next());
		
		
		System.out.println("\n................................................Array Deque Operations.................................................");
		
		System.out.println("\nArrayDeque is \t "+a_deque);
		a_deque.addAll(Arrays.asList(arr2));				//appending list of elements
		System.out.println("\nArrayDeque is \t "+a_deque);
		System.out.println("\n contains ArrayDeque is \t "+a_deque.contains("suhas"));
		System.out.println("\n offer of ArrayDeque is \t "+a_deque.offer("temp100"));
		System.out.println("\n peek ArrayDeque is \t "+a_deque.peek());
		System.out.println("\n is poll ArrayDeque is \t "+a_deque.poll());
		System.out.println("\n is remove ArrayDeque is \t "+a_deque.remove("temp100"));
		System.out.println("\n size of ArrayDeque is \t "+a_deque.size());
		iter=a_deque.iterator();
		while(iter.hasNext())System.out.print(iter.next());
		
		
System.out.println("\n................................................Hash set Operations.................................................");
		
System.out.println("\nHashSet is \t "+h_set);
h_set.addAll(Arrays.asList(arr2));				//appending list of elements
System.out.println("\nHashSet is \t "+h_set);
System.out.println("\n contains HashSet is \t "+h_set.contains("suhas"));
System.out.println("\n is empty HashSet is \t "+h_set.isEmpty());
System.out.println("\n is removeall HashSet is \t "+h_set.removeAll(Arrays.asList(arr2)));
System.out.println("\n size of HashSet is \t "+h_set.size());
iter=h_set.iterator();
while(iter.hasNext())System.out.print(iter.next());
		
		System.out.println("\n................................................Linked Hash Set Operations.................................................");
		
		System.out.println("\nLinkedHashSet is \t "+lh_set);
		h_set.addAll(Arrays.asList(arr2));				//appending list of elements
		System.out.println("\nLinkedHashSet is \t "+lh_set);
		System.out.println("\n contains LinkedHashSet is \t "+lh_set.contains("suhas"));
		System.out.println("\n is empty LinkedHashSet is \t "+lh_set.isEmpty());
		System.out.println("\n is removeall LinkedHashSet is \t "+lh_set.removeAll(Arrays.asList(arr2)));
		System.out.println("\n size of LinkedHashSet is \t "+lh_set.size());
		iter=lh_set.iterator();
		while(iter.hasNext())System.out.print(iter.next());
		
		
		System.out.println("\n................................................Tree Set Operations.................................................");
		
		System.out.println("\nTreeSet is \t "+t_set);
		t_set.addAll(Arrays.asList(arr2));				//appending list of elements
		System.out.println("\nTreeSet is \t "+t_set);
		System.out.println("\n contains TreeSet is \t "+t_set.contains("suhas"));
		System.out.println("\n is empty TreeSet is \t "+t_set.isEmpty());
		System.out.println("\n is removeall TreeSet is \t "+t_set.removeAll(Arrays.asList(arr2)));
		System.out.println("\n size of TreeSet is \t "+t_set.size());
		iter=t_set.iterator();
		while(iter.hasNext())System.out.print(iter.next());
		
		System.out.println("\n................................................Hash Map Operations.................................................");
		
		System.out.println("\nHashMap is \t "+h_map);
		System.out.println("\nHashMap is \t "+h_map);
		System.out.println("\n containskey LinkedHashMap is \t "+lh_map.containsKey("suhas"));
		System.out.println("\n containsvalue LinkedHashMap is \t "+lh_map.containsValue("suhas"));
		System.out.println("\n is empty HashMap is \t "+h_map.isEmpty());
		System.out.println("\n is removeall TreeMapis \t "+t_map.put("temp","temp"));
		System.out.println("\n size of HashMap is \t "+h_map.size());
		for (Map.Entry<String,String> entry : lh_map.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
				
				System.out.println("\n................................................Linked Hash Map Operations.................................................");
				
				System.out.println("\nLinkedHashMap is \t "+lh_map);
				System.out.println("\nLinkedHashMap is \t "+lh_map);
				System.out.println("\n containskey LinkedHashMap is \t "+lh_map.containsKey("suhas"));
				System.out.println("\n containsvalue LinkedHashMap is \t "+lh_map.containsValue("suhas"));
				System.out.println("\n is empty LinkedHashMap is \t "+lh_map.isEmpty());
				System.out.println("\n is removeall TreeMapis \t "+t_map.put("temp","temp"));
				System.out.println("\n size of LinkedHashMap is \t "+lh_map.size());
				
				System.out.println("\n................................................Tree Map Operations.................................................");
				
				System.out.println("\nTreeMapis \t "+t_map);
				System.out.println("\nTreeMapis \t "+t_map);
				System.out.println("\n containskey LinkedHashMap is \t "+lh_map.containsKey("suhas"));
				System.out.println("\n containsvalue LinkedHashMap is \t "+lh_map.containsValue("suhas"));
				System.out.println("\n is empty TreeMapis \t "+t_map.isEmpty());
				System.out.println("\n is removeall TreeMapis \t "+t_map.put("temp","temp"));
				System.out.println("\n size of TreeMapis \t "+t_map.size());
		
	}
}