package fundamentals;

public class TyesOfVarables {
	
	static int a = 100;
	static int b = 200;
	
	int e = 400;
	int f = 500;
	
	public static void addition() {
//		System.out.println(c); local variables of other method can not be accessed in another method
		System.out.println(a + b);
	}
	
	public static void susbstraction() {
		System.out.println(a - b);
	}

	public static void multiplication() {
		System.out.println(a * b);
	}

	public static void division() {
		System.out.println(a / b);
//		System.out.println(d); // All Method parameters are Local variables, can not be accessed in another method
	}

	public static void modDivision(int d) {
		System.out.println(d);
		System.out.println(a % b);
	}

	public static void main(String[] args) {
		int c = 300;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		addition();
		susbstraction();
		multiplication();
		division();
		modDivision(100);
	}

}
