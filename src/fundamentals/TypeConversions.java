package fundamentals;

import java.lang.*;

public class TypeConversions {

	public static void main(String[] args) {
		
		byte byte1 = 100;
		
		short short1 = byte1; // Implicit Conversion
		
		byte1 = (byte)short1; // Explicit conversion
		
		short short2 = 250;
		
		byte byte2 = (byte)short2;
		
		System.out.println(byte2);
		
		int int1 = 100000;
		System.out.println(int1);
		
		float float1 = int1;
		
		System.out.println(float1);
		
		float float2 = 100.567F;
		int1 = (int) float2;
		System.out.println(int1);
		
		
		char ch  = 'a';
		
		byte1 = (byte)ch;
		
		System.out.println(byte1);
		
		byte1 = 70;
		
		ch = (char)byte1;
		
		System.out.println(ch);
		
		
		String str = "1000";
		System.out.println(str);
		
//		int a = (int)str; // Wrapper classes
		
		int b = 1000;
//		String str2 = (String)b;

	}

}
