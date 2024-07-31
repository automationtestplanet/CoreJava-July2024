package functional.interfaces;

public class MethodReferencesExample {
	
	void modDivision(int a, int b) {
		System.out.println(a%b);
	}
	
	static int mulplication(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		
		MethodReferencesExample methodRef = new MethodReferencesExample();
//		methodRef.modDivision(10, 3);
		
		FunctionalInterface1 funInf1 = methodRef::modDivision;		
		funInf1.addition(10,3);
		
//		MethodReferencesExample.mulplication(10, 20);
		
		FunctionalInterface2 funInf2 = MethodReferencesExample::mulplication;
		System.out.println(funInf2.substraction(10, 20));
		
	}

}
