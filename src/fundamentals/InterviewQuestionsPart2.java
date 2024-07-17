package fundamentals;

public class InterviewQuestionsPart2 {

	public static void fibonacciSeries(int num) {
		int a = 0;
		int b = 1;		
		System.out.println(a);		
		for(int i = 1; i<=num ; i++) {
			System.out.println(b);
			int temp = b;
			b = a+b;			
			a = temp;
		}		
	}
	
	public static void main(String[] args) {
		fibonacciSeries(10);

	}
}
