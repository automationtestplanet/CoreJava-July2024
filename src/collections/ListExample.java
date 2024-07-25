package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
	
		
		System.out.println("-------------------------------------ArrayList----------------------------");
		
		List list1 = new ArrayList();
		
//		Object obj1 = true;
//		obj1 = 100;
//		obj1 = 'A';
//		obj1 = "String";
		
		System.out.println(list1.add(false));
		list1.add(100);
		list1.add(1000);
		list1.add('A');
		list1.add(10000);
		list1.add(100.05F);
		list1.add(100000L);
		list1.add(100.05E36D);
		list1.add("Java");
		list1.add(new ListExample());
		list1.add(10000);
		list1.add(5, 2000);
		System.out.println(list1.add(false));
		
		System.out.println(list1);	
		System.out.println(list1.size());	
		System.out.println(list1.get(3));
		
//		for(Object eachObject:list1)
//				System.out.println(eachObject);
		
		System.out.println(list1.contains("Java"));
		
		List list2 = list1.subList(4, 8);
		System.out.println(list2);
		
		list2.remove(0);
		list2.remove(100.05F);
		System.out.println(list2);
		
		list1.clear();
		System.out.println(list1);	
		System.out.println(list1.size());
		
		
		System.out.println("-------------------------------------LinkedList----------------------------");
		
		List linkedList1 = new LinkedList();
		
		linkedList1.add(100);
		linkedList1.add(1000);
		linkedList1.add('A');
		linkedList1.add(10000);
		linkedList1.add(100.05F);
		linkedList1.add(100000L);
		linkedList1.add(100.05E36D);
		linkedList1.add("Java");
		linkedList1.add(new ListExample());
		linkedList1.add(10000);
		linkedList1.add(5, 2000);
		
		System.out.println(linkedList1);
		
		

	}

}
