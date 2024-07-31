package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CursorsExample {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(false);
		list1.add(100);
		list1.add(1000);
		list1.add('A');
		list1.add(10000);
		list1.add("");
		list1.add(100000L);
		list1.add(100.05E36D);
		list1.add("Java");
		list1.add(new ListExample());
		list1.add(10000);
		list1.add(5, 2000);
		list1.add(false);
		
		System.out.println("-----------------------------Iterator Cursor-------------------------------");
		Iterator itr1 = list1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next()); 
		}
		
		
		System.out.println("-----------------------------ListIterator Cursor-------------------------------");
		
		ListIterator listItr = list1.listIterator();
		
		if(listItr.hasNext()) {
			System.out.println(listItr.next()); 
		}
		
		if(listItr.hasNext()) {
			System.out.println(listItr.next()); 
		}
		
		if(listItr.hasPrevious()) {
			System.out.println(listItr.previous()); 
		}		
		
		if(listItr.hasPrevious()) {
			System.out.println(listItr.previous()); 
		}
		
		

	}

}
