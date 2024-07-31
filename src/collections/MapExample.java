package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------HashMap----------------------------");
		Map hashMap1 = new HashMap();
		
		hashMap1.put("FirstName", "Raju");
		hashMap1.put("LastName", "CH");
		
		System.out.println(hashMap1.get("FirstName"));
		System.out.println(hashMap1.get("LastName"));
		
		hashMap1.put(100, "Hundred");
		System.out.println(hashMap1.get(100));
		hashMap1.put("Thousand", 1000);
		System.out.println(hashMap1.get("Thousand"));
		hashMap1.put('A', "a");
		hashMap1.put('B', 'b');
		System.out.println(hashMap1.get('A'));
		hashMap1.put(null, "Null Value");
		System.out.println(hashMap1.get(null));
		
		hashMap1.put("Null Value", null);
		
		System.out.println(hashMap1.get("Null Value"));
		
		System.out.println(hashMap1);
		
		System.out.println("-------------------------------------LinkedHashMap----------------------------");
		Map linkedHashMap1 = new LinkedHashMap();
		
		linkedHashMap1.put("FirstName", "Raju");
		linkedHashMap1.put("LastName", "CH");
		
		System.out.println(linkedHashMap1.get("FirstName"));
		System.out.println(linkedHashMap1.get("LastName"));
		
		linkedHashMap1.put(100, "Hundred");
		System.out.println(linkedHashMap1.get(100));
		linkedHashMap1.put("Thousand", 1000);
		System.out.println(linkedHashMap1.get("Thousand"));
		linkedHashMap1.put('A', "a");
		linkedHashMap1.put('B', 'b');
		System.out.println(linkedHashMap1.get('A'));
		
		System.out.println(linkedHashMap1);
		
		Set<Map.Entry> entrySet1 = linkedHashMap1.entrySet();
		
		for(Map.Entry eachEntry : entrySet1) {
				System.out.println(eachEntry);				
		}
		
		System.out.println("-------------------------------------TreeMapMap----------------------------");
		Map treeMap1 = new TreeMap();
		treeMap1.put("Qualification", "MCA");
		treeMap1.put("FirstName", "Raju");
		treeMap1.put("LastName", "CH");
		System.out.println(treeMap1);
		
	}

}

