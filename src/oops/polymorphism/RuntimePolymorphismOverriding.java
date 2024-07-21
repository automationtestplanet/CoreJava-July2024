package oops.polymorphism;

public class RuntimePolymorphismOverriding extends Calculator {

	@Override
	public int addition(int a, int b) {
		return super.addition(a,b)+5;
	}

	public int modDivision(int a, int b) {
		return a % b;
	}
	
	public int addition(int a, int b, int c) {
		return this.addition(a,b)+c;
	}
	
	static public int multiplication(int a, int b) {
		return a*b+10;
	}

	public static void main(String[] args) {
		RuntimePolymorphismOverriding overriding = new RuntimePolymorphismOverriding();
		System.out.println(overriding.addition(10, 20));
		System.out.println(overriding.addition(10, 20,30));
		System.out.println(overriding.modDivision(20, 3));
		System.out.println(overriding.susbstraction(100, 70)); // compiler-bottom to top approach

		Calculator calc = overriding; // upcasting (Implicit Conversion)

		System.out.println(calc.addition(10, 20)); // overriding
		System.out.println(calc.susbstraction(10, 20));
		System.out.println(Calculator.multiplication(10, 20));
		System.out.println(calc.division(10, 20));
//		calc.modDivision(20,2);   // we can not access child class methods with parent class reference

		overriding = (RuntimePolymorphismOverriding) calc; // downcasting (Explicit Conversion)
		
		System.out.println(RuntimePolymorphismOverriding.multiplication(10, 20)); // 210
		System.out.println(Calculator.multiplication(10, 20));  // 200 // can not override
	}

}
