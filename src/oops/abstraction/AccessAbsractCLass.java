package oops.abstraction;

public class AccessAbsractCLass extends PartialAbstractionClass{

	int a = 100;
	
	static String str ="Java"; 
	
	public AccessAbsractCLass(int a, String str){
		super(a,str);
	}
	
	public static void displayParentClassMemebers1() {
//		System.out.println(this.a);
//		System.out.println(this.str);
//		System.out.println(super.a);
//		System.out.println(super.str);
	}
	
	public void displayParentClassMemebers2() {
		System.out.println(this.a);
		System.out.println(this.str);
		System.out.println(super.a);
		System.out.println(super.str);
	}
	
	
	@Override
	public void substraction(int a, int b) {
		System.out.println(a-b);		
	}
	
	public static void main(String[] args) {
		
		AccessAbsractCLass accessAbsCls = new AccessAbsractCLass(100, "Hello");
		
//		accessAbsCls.addition(10, 20);
//		accessAbsCls.multiplication(10, 20);
//		accessAbsCls.substraction(20, 30);
//		
//		PartialAbstractionClass partialAbsCls = accessAbsCls;
//		
//		partialAbsCls.addition(10, 20);
//		partialAbsCls.multiplication(10, 20);
//		partialAbsCls.substraction(20, 30);
		
		PartialAbstractionClass partialAbsCls = new AccessAbsractCLass(200, "Hello Java");
		partialAbsCls.addition(10, 20);
		partialAbsCls.multiplication(10, 20);
		partialAbsCls.substraction(20, 30);
		partialAbsCls.displayGlobal();

	}

	

}
