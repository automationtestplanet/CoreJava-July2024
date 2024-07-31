package functional.interfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class AccessFunctionalInterface { // implements FunctionalInterface1 {

//	@Override
//	public void addition(int a, int b) {
//		System.out.println(a+b);
//	}
//
//	public static void main(String[] args) {
//		FunctionalInterface1 accFunInf = new AccessFunctionalInterface();
//		accFunInf.addition(10, 20);
//	}
	
	
	public static void main(String[] args) {
		FunctionalInterface1 funInf1 = new FunctionalInterface1() {			
			@Override
			public void addition(int a, int b) {
				System.out.println(a+b);
			}
		};
		
		funInf1.addition(10, 20);
		
		FunctionalInterface1 funInf2 = (a,b)->{System.out.println(a+b);};  // Method without name -> lambda expression 
		funInf2.addition(100, 200);
		
		FunctionalInterface1 funInf3 = (a,b)->System.out.println(a+b);  // Method without name -> lambda expression 
		funInf3.addition(1000, 2000);
		
		FunctionalInterface2 funInf4 = (a,b)->{return a-b;};
		System.out.println(funInf4.substraction(300, 75));
		
		FunctionalInterface2 funInf5 = (a,b)->a-b;
		System.out.println(funInf5.substraction(300, 175));
		
		
		FunctionalInterface3 funInf6 = (a)->System.out.println(a);
		funInf6.printNumber(100);
		
		FunctionalInterface3 funInf7 = a->System.out.println(a);
		funInf7.printNumber(200);
		
		
//		Function<Integer, String> fun1 = new Function<Integer, String>() {
//			@Override
//			public String apply(Integer a) {
//				return null;
//			}
//		};
	}

}
