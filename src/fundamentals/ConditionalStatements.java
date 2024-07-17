package fundamentals;

public class ConditionalStatements {
	
	
	public static void arithematicOperation(int a, int b, String operationName) {
		
		switch (operationName) {
		case "Addition":
			System.out.println(a+b);
			break;
		case "Substraction":
			System.out.println(a-b);
			break;
		case "Multiplication":
			System.out.println(a*b);
			break;
		case "Division":
			System.out.println(a/b);
			break;
		case "ModDivision":
			System.out.println(a%b);
			break;

		default:
			System.out.println("No Operation found");
			break;
		}
		
	}

	public static void main(String[] args) {
		int a = 100;

		int b = 0;

		if(b > 0) {
			System.out.println(a / b);
		}else {
			System.out.println(a/1);
		}
		
		b = 200;
		
		
		arithematicOperation(a,b,"Multiplication");

	}

}
