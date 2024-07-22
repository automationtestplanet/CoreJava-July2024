package accessmodifiers2;

import calculator.AccessCalculator;
import calculator.Calculator;

public class UseCalculator {

	public static void main(String[] args) {
//		ImplementCalculator implCalc = new ImplementCalculator();
		
		Calculator accessClac = new AccessCalculator();
		
		System.out.println(accessClac.addition(10, 20));
		System.out.println(accessClac.susbstraction(30, 3));

	}

}
