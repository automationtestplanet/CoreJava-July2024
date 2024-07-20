package oops.abstraction;

public interface FullAbstractionInterface {
	
	int a =10;
	public static final String str = "Java";
	
	void  addition(int a,int b);
	int susbstraction(int a,int b);
	
	public static void multiplication(int a,int b) {
		System.out.println(a*b);
		
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		//a=300;
		FullAbstractionInterface.multiplication(10, 2);
	}

}
