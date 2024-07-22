package oops.abstraction;

public class AccessInterfaceExample implements InterfaceExample{

	
	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	
	static int substraction(int a, int b) {
		return a-b;
	}
	
//	
//	@Override          // default methods an not override
//	int multiplication(int a, int b) {
//		return a*b;
//	}
	
	public static void main(String[] args) {
		AccessInterfaceExample accInf = new AccessInterfaceExample();

		System.out.println(accInf.multiplication(10, 20));
	}


}
