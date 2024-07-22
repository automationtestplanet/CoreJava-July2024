package accessmodifiers2;

import accessmodifiers.AccessModifiersExample;


public class AccessData {

	public static void main(String[] args) {
		AccessModifiersExample acccEx = new AccessModifiersExample();
		
		acccEx.addition(10, 20);   // public
//		acccEx.susbstraction(30, 3); // protected method can not access outside the class
//		acccEx.multiplication(10, 5); // default method can not access outside the class
//		acccEx.division(10,3); // Private method can not access outside the class
		
//		ClassExample clsEx = new ClassExample();   // Can not access out side of the package

	}

}
