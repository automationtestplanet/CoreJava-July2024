package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GenericCollections {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		
		list1.add(100);
		list1.add("Java");
		list1.add(false);
		
		int int1 = (int) list1.get(0);
		System.out.println(int1);
		
//		int int2 = (int) list1.get(1); // error - no type safety
//		System.out.println(int2);
		
//		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<>();
		list2.add(500);
//		list2.add("Java"); // an not add
		list2.add(200);
		list2.add(100);
		list2.add(400);
		
		System.out.println(list2);
		 
		Map<String,String> map1 = new HashMap<>();
		map1.put("Qualification", "MCA");
		map1.put("FirstName", "Raju");
		map1.put("LastName", "CH");
		
//		map1.put(100, "CH"); // error
//		map1.put("100", 100); // error
//		map1.put('A', "CH"); // error
		
		Set<Map.Entry<String,String>> entres = map1.entrySet();
		
		for(Map.Entry<String, String> eachEntry :entres) {
			System.out.println(eachEntry);
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee());
		empList.add(new Employee());
		empList.add(new Employee());
//		empList.add("Java");  // error

	}

}
