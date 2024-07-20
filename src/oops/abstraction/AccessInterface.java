package oops.abstraction;

public class AccessInterface implements FullAbstractionInterface{
	

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public int substraction(int a, int b) {		
		return a-b;
	}
	
	public static void main(String[] args) {
		
		FullAbstractionInterface fullAbsInteface= new AccessInterface();
		
		fullAbsInteface.addition(10, 20);
		
		System.out.println(fullAbsInteface.substraction(30, 20));
	}

	

}
