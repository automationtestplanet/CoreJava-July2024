package fundamentals;

public class ArithmaticOperations {
	
	public void addition(int a, int b) {
		System.out.println(a+b); 
	}
	
	public void substraction(int a, int b) {
		System.out.println(a-b);
	}

	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}

	public void division(int a, int b) {
		System.out.println(a/b);
	}
	
	void callArithematicOperations(ArithmaticOperations ao, int a, int b) {
		ao.addition(a, b);
		ao.substraction(a, b);
		ao.multiplication(a, b);
		ao.division(a, b);
	}
	
	ArithmaticOperations getObject(ArithmaticOperations ao) {
		return ao;
	}
	
	ArithmaticOperations getThisObject() {
		return this;
	}
	
	public static void main(String[] args) {
		ArithmaticOperations ao = new ArithmaticOperations();
		ao.callArithematicOperations(ao, 1000, 2000);
		
		ao.getObject(ao).addition(0, 0);
		
		ao.getThisObject().addition(0, 0);
	}

}
