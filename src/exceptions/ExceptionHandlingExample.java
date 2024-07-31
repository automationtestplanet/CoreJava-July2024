package exceptions;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		String str = "Hello";
		int[] arr = { 10, 20, 30 };
		
		System.out.println("------------------------------------------------------");
		
		try {
			System.out.println(a / b); // When ever we get any error at particular line in try block, the remaining statements in the try block will not be executed
			System.out.println(str.charAt(6)); // not executed
			System.out.println(arr[5]);  // not executed
		} catch (ArithmeticException ae) {
			System.out.println(a / 1);
		}
		
		System.out.println("------------------------------------------------------");
		b = 2;
		try {
			System.out.println(a / b); // executed
			System.out.println(str.charAt(6)); // error
			System.out.println(arr[5]);
		} catch (ArithmeticException ae) {
			System.out.println(a / 1);
		} catch (StringIndexOutOfBoundsException ae) {
			System.out.println(str.charAt(str.length()-1));
		}
		
		System.out.println("------------------------------------------------------");
		
		try {
			System.out.println(a / b); // executed
			System.out.println(str.charAt(3)); // error
			System.out.println(arr[5]);
		} catch (ArithmeticException ae) {
			System.out.println(a / 1);
		} catch (StringIndexOutOfBoundsException ae) {
			System.out.println(str.charAt(str.length()-1));
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(arr[arr.length-1]);
		}
		
		System.out.println("------------------------------------------------------");
		b = 2;
		int strIndex = 3;		
		int arrIndex = 5;
		try {
			System.out.println(a / b); // executed
			System.out.println(str.charAt(strIndex)); // error
			System.out.println(arr[arrIndex]);
		} catch (ArithmeticException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.println("------------------------------------------------------");
		b = 2;
		strIndex = 3;		
		arrIndex = 6;
		
		try {
			System.out.println(a / b); // executed
			System.out.println(str.charAt(strIndex)); // error
			System.out.println(arr[arrIndex]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		

		

		

	}

}
