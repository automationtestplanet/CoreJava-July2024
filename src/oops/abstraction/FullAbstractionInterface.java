package oops.abstraction;

public interface FullAbstractionInterface {

	int a = 100;

	public static final String str = "Hello"; // value should be initialized

	void addition(int a, int b);

	int substraction(int a, int b);

	public static void multiplication(int a, int b) {
		System.out.println(a * b);

	}

	public static void main(String[] args) {
//		FullAbstractionInterface fullABsCls = new FullAbstractionInterface(); // not possible

		System.out.println(a); // static

//		a = 200; // final

		FullAbstractionInterface.multiplication(10, 200);
	}

}
