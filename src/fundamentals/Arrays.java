package fundamentals;

public class Arrays {
	
	int a = 100;
	String str = "Hello";

	public static void main(String[] args) {
		
		
		int[] intArr1 = {100,200,300,400};
		
		int intArr2[] = {100,200,300,400};
		
//		int[] intArr3 = {100,200,300,400, 100.5F,"Hello"};
		
		int a = 100;
		
		System.out.println(a);
		
		System.out.println(intArr1.length);
		
//		System.out.println(intArr1[0]);
//		System.out.println(intArr1[1]);
//		System.out.println(intArr1[2]);
//		System.out.println(intArr1[3]);
		
		for(int i =0; i<intArr1.length;i++) {
			System.out.println(intArr1[i]);
		}
		
		
		for(int eachumber:intArr1) {
			System.out.println(eachumber);
		}
		
		
		int b;
		
		b = 100;
		
		String[] strArr1 = new String[3];
		
		strArr1[0] = "Apple";
		strArr1[1] = "Banana";
		strArr1[2] = "Carrot";
		
		for(String eachStr:strArr1) {
			System.out.println(eachStr);
		}
		
		
		
		int[] intArr3 = {10,20,30};
		
		int[][] intArr4 = {{10,20,30},{100,200,300},{1000,2000,3000}};
		
		
		for(int[] eachArray:intArr4) {
			for(int eachValue:eachArray) {
				System.out.print(eachValue+" ");
			}
			
			System.out.println();
		}
		
		
		for(int i =0; i<5;i++) {
			for(int j =0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =5; i>0;i--) {
			for(int j =0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Object[] objArr = {false, 100, 1000, 'A', 100000, 100.05F, 10000000000L, 100.987E34D, "Hello"};
		
		for(Object eachObject:objArr)
			System.out.println(eachObject);
		
		
//		var varArr[] = {100,200};

	}

}
