package oops.inheritance;

public class NewCalculator extends Calculator {
	
	public void modDivision(int a, int b) {
		System.out.println(a % b);
	}
	
	void display() {
		System.out.println("Hello this is new Clculator");
	}

	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		calc.addition(10,20);
//		
//		NewCalculator newCalc = new NewCalculator();		
//		newCalc.modDivision(10, 3);
		
		
//		As-a relation -> New Calculator working as a Calculator
		NewCalculator newCalc = new NewCalculator();	
		newCalc.addition(10, 20);
		newCalc.modDivision(10, 3);
		
		
	}

}
