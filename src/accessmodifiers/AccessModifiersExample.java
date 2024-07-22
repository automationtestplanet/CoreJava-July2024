package accessmodifiers;

public class AccessModifiersExample {

	private int a = 100;
	String str = "Hello";
	protected long long1 = 19847397934L;
	public char ch = 'A';

	public int addition(int a, int b) {
		return a + b;
	}

	protected int susbstraction(int a, int b) {
		return a - b;
	}

	int multiplication(int a, int b) {
		return a * b;
	}

	private int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		AccessModifiersExample acccEx = new AccessModifiersExample();
		acccEx.addition(10, 20); // public
		acccEx.susbstraction(30, 3); // protected
		acccEx.multiplication(10, 5); // default
		acccEx.division(10,3); // Private
	}

}
