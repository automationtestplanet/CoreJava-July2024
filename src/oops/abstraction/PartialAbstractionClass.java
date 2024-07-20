package oops.abstraction;

abstract class PartialAbstractionClass {

	int a = 100;
	static String str = "Hello";
	
	public PartialAbstractionClass(int a,String str) {
		this.a=a;
		PartialAbstractionClass.str=str;
		
	}
	 public void display() {
		System.out.println(a);
		System.out.println(PartialAbstractionClass.str);
	 }
	public static void subtraction(int a,int b) {
		System.out.println(a-b);
		
	}
	
	abstract public void multiplication(int a,int b);
	
	
	
	public static void main(String[] args) {
		System.out.println(PartialAbstractionClass.str);
		
		PartialAbstractionClass.subtraction(100, 50);
		
		
		//PartialAbstractionClass pac = new PartialAbstractionClass();
	
		
		
		
	}

}
