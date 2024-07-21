package oops.abstraction;


abstract public class PartialAbstractionClass {
	
		int a = 100;
		
		static String str ="Java"; 
		
		
		public PartialAbstractionClass(int a, String str){
			this.a = a;
			PartialAbstractionClass.str = str;
		}
	
		public void addition(int a, int b) { // method with logic/body, non-abstract method, Concrete method, implemented method
			System.out.println(a+b);
		}
		
		public static void multiplication(int a, int b) {
			System.out.println(a*b);
		}
		
		public void displayGlobal() {
			System.out.println(this.a);
			System.out.println(PartialAbstractionClass.str);
		}
		
		abstract public void substraction(int a, int b); // method without logic/body, abstract method, non-concrete method, unimplemented method
		
		
//		abstract public static void division(int a, int b); // not possible  
		
		public static void main(String[] args) {
			System.out.println(PartialAbstractionClass.str);
			PartialAbstractionClass.multiplication(10, 20);
			
//			PartialAbstractionClass partialAbsCls = new PartialAbstractionClass(); // we can not create a object for Abstract class
			
		}


}
