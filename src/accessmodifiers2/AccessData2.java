package accessmodifiers2;

import accessmodifiers.AccessModifiersExample;

public class AccessData2 extends AccessModifiersExample{

	public static void main(String[] args) {
		AccessData2 acccEx = new AccessData2();
		
		acccEx.addition(10, 20);   // public
		acccEx.susbstraction(30, 3); // protected
//		acccEx.multiplication(10, 5); // default method can not access outside the class
//		acccEx.division(10,3); // Private method can not access outside the class
	}

}
