package fundamentals;

public class TypesOfMethods {
	
	public static void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void addition() {
		System.out.println(100);
	}
	
	public static int substraction(int a, int b) {
		return a-b;
	}
	
	public static int substraction() {
		return 100;
	}	

	public static void main(String[] args) {
		
		addition(100,200);
		
		addition();
		
		int result = substraction(200, 300);
		System.out.println(substraction(200, 300));
		
		int result2 = substraction();
		System.out.println(substraction());
		
//		short result3 = substraction(50000, 49000); //1000
		
		
	}

}
