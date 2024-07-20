package oops.abstraction;

public class AccessInterface implements FullAbstractionInterface {

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);

	}

	@Override
	public int susbstraction(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		FullAbstractionInterface fullabsinterface  = new AccessInterface();
		fullabsinterface.addition(100,200);
		
		System.out.println(fullabsinterface.susbstraction(20, 10));

	}

}
