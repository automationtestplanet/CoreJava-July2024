package accessmodifiers;

public class AccessData {

	public static void main(String[] args) {
		AccessModifiersExample acccEx = new AccessModifiersExample();
		
		acccEx.addition(10, 20);   // public
		acccEx.susbstraction(30, 3); // protected
		acccEx.multiplication(10, 5); // default
//		acccEx.division(10,3); // Private method can not access outside the class

	}

}
