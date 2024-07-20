package oops.abstraction;

public class AccessAbstractClass extends PartialAbstractionClass {

	public AccessAbstractClass(int a, String str) {
		super(a, str);
	}
	@Override
	public void multiplication(int a, int b) {
	System.out.println(a*b);

	}
	public static void main(String[] args) {
	/*	AccessAbstractClass accessabstract = new AccessAbstractClass();
		accessabstract.multiplication(10, 20);
		accessabstract.subtraction(20, 10);
		
		PartialAbstractionClass partialabstract = accessabstract;
		partialabstract.multiplication(10, 20);
		partialabstract.subtraction(30, 10);*/
		
		PartialAbstractionClass partialAbstraction = new AccessAbstractClass(200,"java");
		partialAbstraction.multiplication(10, 10);
		partialAbstraction.subtraction(30, 10);
		partialAbstraction.display();
		
	}

}
