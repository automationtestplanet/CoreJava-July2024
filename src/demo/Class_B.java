package demo;

public class Class_B extends Class_A{

	public Class_B() {
		System.out.println("Kalyan");
	}
	
	void display() {
		System.out.println("Class_B");
	}
	
	public static void main(String[] args) {
		Class_A clsA =new Class_A();
		Class_B clsB = new Class_B();
		
		clsA = clsB;
		
		
		clsA.display();
		clsB.display();
		
		clsB = (Class_B) clsA;
		
	}

}
