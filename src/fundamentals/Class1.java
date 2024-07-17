package fundamentals;

public class Class1 {

	int a = 100;

	static int b = 200;

	String str1;

	static String str2;
	Class1(String str1, String str2) {
		this.str1 = str1; // this keyword represents current object
		Class1.str2 = str2;
//		int a1 = 100;

//		a1 = a1;

//		this.a1;
	}

	void print() {
		System.out.println(this.a);
	}

	static void staticPrint() {
//		System.out.println(this.a); // not allowed
		System.out.println(Class1.b);
	}

	void printGlobalData() {
		System.out.println(this.str1);
		System.out.println(Class1.str2);
	}

	final int c = 300;

	final static String str3 = "Java";

	void finalParameters(final int a) {
		final int b = 200;
//		 b= 400;		 // final can not change 
//		 a = 100;
		
//		this.c = 500;
//		Class1.str3 = "Hello";
		
	}

}
