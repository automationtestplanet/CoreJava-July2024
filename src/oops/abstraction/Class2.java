package oops.abstraction;

public class Class2 extends Class1 implements Interface1,Interface2{

	@Override
	public int multiplication(int a, int b) {
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int susbstraction(int a, int b) {
		return a-b;
	}

}
