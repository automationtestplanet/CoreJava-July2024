package fundamentals;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringClasses {

	public static void main(String[] args) {
		// Sting is Immutable -> we can not change the value of String;
		System.out.println("-------------------Mutable variables----------------------");
		int a = 100;
		System.out.println(a);
		a++;
		System.out.println(a);
		System.out.println("-------------------String Immutable variables----------------------");

		String str = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str);
		str3 = str.concat(" Java");
//		str = str.replace("H", "");
		str2 = str.replaceAll("[A-Za-z]", "1");
		str.toUpperCase();
		System.out.println(str);

		// If weant to makethe String as mutable string, we have two classes ->
		// StringBuilder, StringBuffer

		System.out.println("-------------------String Mutable variables --- StringBuilder----------------------");

		StringBuilder strBuilder = new StringBuilder("Hello");
		System.out.println(strBuilder);
		strBuilder.append(" Java");
		System.out.println(strBuilder);
		strBuilder.reverse();
		System.out.println(strBuilder);

		System.out.println("-------------------String Mutable variables --- StringBuffer----------------------");

		StringBuffer strBuffer = new StringBuffer("Java");
		System.out.println(strBuffer);
		strBuffer.append(" World");
		System.out.println(strBuffer);
		strBuffer.reverse();
		System.out.println(strBuffer);
		
		System.out.println("-------------------String Mutable variables --- StringTokenizer----------------------");
//		
//		String newStr = "Hello This is Java";
//		String[] strArr = newStr.split(" ");
		
		StringTokenizer strToken = new StringTokenizer("Hello This is Java"," ");
		
		while(strToken.hasMoreTokens()) {
			String eachStr = strToken.nextToken();
			System.out.println(eachStr);
		}
	}

}
