package fundamentals;

public class InstanceMethodsAndVariables {
	
	int a = 100;
	int b = 200;
	static int c = 300;
	
	public void displayAllGlobalData() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void displayStaticData() {
//		System.out.println(a); // Instance data can not access 
//		System.out.println(b); // Instance data can not access 
		System.out.println(c);
	}

	
	public static void main(String[] args) {
//		System.out.println(a); // Instance data can not access 
//		System.out.println(b); // Instance data can not access 
		System.out.println(c);
		
//		displayAllGlobalData();

	}

}
