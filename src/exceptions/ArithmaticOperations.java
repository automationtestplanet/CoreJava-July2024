package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArithmaticOperations {
	
	void getDataFromFile() throws FileNotFoundException {
		try {
			new FileInputStream(new File("filepath"));
		}catch(FileNotFoundException fne) {
			
		}		
		new FileInputStream(new File("filepath"));
	}
	
	void getDataFromFile2() throws Exception {
		try {
			new FileInputStream(new File("filepath"));
		}catch(FileNotFoundException fne) {
			
		}		
		new FileInputStream(new File("filepath"));
	}

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		
		System.out.println("1st Program Execution Started");
		try {
			System.out.println(a/b);  // 100/0 -> infinity -> error // Execution stops at this point	
//			ArithmeticException ae = new ArithmeticException();
		}catch(ArithmeticException ae) {
//			System.out.println(a/1);
			
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			System.out.println(ae.getCause());			
		}
		
		System.out.println("1st Program Execution Ended");
		
		System.out.println("2nd Program Execution Started");
		System.out.println(a+b); 		
		System.out.println("2nd Program Execution Ended");
		
//		c int  = 200; // syntax error
//		int d = 500;
//		byte b1 = d;

	}

}
