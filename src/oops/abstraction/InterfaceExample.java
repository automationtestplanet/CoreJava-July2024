package oops.abstraction;

public interface InterfaceExample {
	
	int addition(int a, int b);
	
	
	static int substraction(int a, int b) {
		return a-b;
	}
	
	default int multiplication(int a, int b) {
		return a*b;
	}

}
