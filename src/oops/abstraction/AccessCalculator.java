package oops.abstraction;

public class AccessCalculator extends ImplementCalculator{

	public static void main(String[] args) {
		Calculator calc = new AccessCalculator();
		
		System.out.println(calc.addition(10, 20));
		System.out.println(calc.susbstraction(10, 20));
		System.out.println(calc.multiplication(10, 20));
		System.out.println(calc.division(10, 20));
	}

}
