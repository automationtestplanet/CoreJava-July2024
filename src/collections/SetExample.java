package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------HashSet----------------------------");
		
		Set set1 = new HashSet();
		System.out.println(set1.isEmpty());
		
		System.out.println(set1.add(false));
		set1.add(100);
		set1.add(1000);
		set1.add('A');
		set1.add(10000);
		set1.add(100.05F);
		set1.add(100000L);
		set1.add(100.05E36D);
		set1.add("Java");
		set1.add(new SetExample());
		set1.add(1000);
		
		System.out.println(set1);
		
		System.out.println(set1.size());	
//		System.out.println(set1.get(3));  // No index -> no get()
		
//		for(Object eachObject:set1)
//				System.out.println(eachObject);
		
		System.out.println(set1.contains("Java"));
		System.out.println(set1.isEmpty());
		set1.remove("Java");
		System.out.println(set1);
		
		System.out.println("-------------------------------------LinkedHashSet----------------------------");
		Set linkedHasSet = new LinkedHashSet();
		System.out.println(linkedHasSet.add(false));
		linkedHasSet.add(100);
		linkedHasSet.add(1000);
		linkedHasSet.add('A');
		linkedHasSet.add(10000);
		linkedHasSet.add(100.05F);
		linkedHasSet.add(100000L);
		linkedHasSet.add(100.05E36D);
		linkedHasSet.add("Java");
		linkedHasSet.add(new SetExample());
		System.out.println(linkedHasSet.add(1000));
		
		System.out.println(linkedHasSet);
		
		System.out.println("-------------------------------------TreeHashSet----------------------------");
		
		Set treeSet = new TreeSet();
//		treeSet.add(false);
//		treeSet.add(100);
//		treeSet.add('A');
//		treeSet.add("Java");
		
		treeSet.add(90);
		treeSet.add(50);
		treeSet.add(100);
		treeSet.add(40);
		
		System.out.println(treeSet);
		
		Set treeSet2 = new TreeSet();
		
		treeSet2.add('Y');
		treeSet2.add('J');
		treeSet2.add('B');
		treeSet2.add('P');
		System.out.println(treeSet2);
		
		Set treeSet3 = new TreeSet();
		treeSet3.add("Shiva");
		treeSet3.add("Krishna");
		treeSet3.add("Rama");
		
		
		System.out.println(treeSet3);

	}

}
