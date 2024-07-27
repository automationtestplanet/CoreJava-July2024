package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		
		Map<String,String> hashtable = new Hashtable<>();
		hashtable.put("Qualification", "MCA");
		hashtable.put("FirstName", "Raju");
		hashtable.put("LastName", "CH");
//		hashtable.put(null, "30");  // null key is not allowed -> runtime exception
//		hashtable.put("Age", null);  // null value is not allowed -> runtime exception
	}

}
