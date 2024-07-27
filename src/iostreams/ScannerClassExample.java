package iostreams;

import java.util.Scanner;

public class ScannerClassExample {
	
	static void addition(int a, float b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		
		System.out.println("Enter A value: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Boolean value: ");
		boolean bool = sc.nextBoolean();
		
		
		System.out.println("Enter F1 value: ");
		float f1 = sc.nextFloat();
		
		System.out.println(name);
		
		System.out.println(a+f1);
		
		addition(a,f1);
		
		System.out.println(bool);

	}

}
