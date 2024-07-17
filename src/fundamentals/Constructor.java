package fundamentals;

public class Constructor {
	
	boolean bool1;
	byte byte1;
	short short1;
	char char1;
	int int1;
	float float1;
	long long1;
	double double1;
	String str1;
	
	Constructor(){		
		bool1 = true;
		byte1 = 100;
		short1 = 1000;
		char1 = 'A';
		int1 = 10000;
		float1 = 100.05F;
		long1 = 100000L;
		double1 = 100.465E56D;
		str1 = "Hello";
		
	}
	
	Constructor(boolean bool2,int int2, float float2, long long2, double double2, String str2){
		bool1 = bool2;
		int1 = int2;
		float1 = float2;
		long1 = long2; 
		double1 = double2;
		str1 = str2;
	}
	
	
//	Constructor(){
//		a = 100;
//		b = 200;		
//	}
//	
//	Constructor(int a, int b){
//		a = 100;
//		b = 200;		
//	}
	
	void print() {
		System.out.println(bool1);
		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(char1);
		System.out.println(int1);
		System.out.println(float1);
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(str1);
	}
	
	
	public static void main(String[] args) {
		Constructor cons1 = new Constructor();
		Constructor cons2 = new Constructor();
		Constructor cons3 = new Constructor();
		
//		System.out.println(cons1.bool1);
		System.out.println("-------------------Cons1 Memory Data-------------------------------------");
		cons1.str1 = "Java";
		cons1.print();
		cons1.str1 = "Java";
		System.out.println("-------------------Cons2 Memory Data-------------------------------------");
		cons2.print();
		
		cons2.str1 = "Welcome";
		System.out.println(cons2.str1);
		
		System.out.println("-------------------Cons3 Memory Data-------------------------------------");
		cons3.print();
		
		System.out.println("-------------------Cons4 Memory Data-------------------------------------");
		Constructor cons4 = new Constructor(false, 15000, 200.50F, 1500000, 200.567E34D, "Hello Java");
		cons4.print();

	}

}
