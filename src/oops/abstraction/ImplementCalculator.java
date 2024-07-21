package oops.abstraction;

public class ImplementCalculator implements Calculator {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int susbstraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;

	}

	@Override
	public int division(int a, int b) {

		return a / b;

	}

}
