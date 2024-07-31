package exceptions;

public class Calculator {
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int substraction(int a, int b) {
		return a-b;
	}

	public int multiplication(int a, int b) {
		return a*b;
	}

	public int division(int a, int b) {
		try {
			return a/b;
		}catch(ArithmeticException ae) {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.addition(10, 20));
		
		System.out.println(calc.division(100, 20));
		
		System.out.println(calc.division(100, 0));
		
		System.out.println(calc.multiplication(100, 20));
		
		System.out.println(calc.substraction(100, 20));
	}

}
