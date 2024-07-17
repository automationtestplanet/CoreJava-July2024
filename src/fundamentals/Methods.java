package fundamentals;

public class Methods {

	public static void addition(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void susbstraction(int a, int b) {
		System.out.println(a - b);
	}

	public static void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public static void division(int a, int b) {
		System.out.println(a / b);
	}

	public static void modDivision(int a, int b) {
		System.out.println(a % b);
	}
	
	public static void main(String[] args) {
		addition(100,200);
		addition(1000,2000);		
		susbstraction(200,100);
		multiplication(10,5);
		division(100,3);
		modDivision(100,3);
	}

}
