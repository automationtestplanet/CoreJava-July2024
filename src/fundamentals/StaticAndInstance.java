package fundamentals;

public class StaticAndInstance {

	int a = 100;	
	static int b = 200;
	
	void print() {
		System.out.println(a);
		System.out.println(b);		
	}
	
	
	static void print2() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		StaticAndInstance statIns1 = new StaticAndInstance();
		StaticAndInstance statIns2 = new StaticAndInstance();
		StaticAndInstance statIns3 = new StaticAndInstance();
		
//		System.out.println(statIns1.a);
//		System.out.println(statIns1.b);	
		System.out.println("-----------------------Static and Instance 1 memory-------------------------");	
		statIns1.print();	
		statIns1.a = 300;
		statIns1.b = 400;
		
		statIns1.print();
		
		System.out.println("-----------------------Static and Instance 2 memory-------------------------");
		statIns2.print();	
		
		System.out.println("-----------------------Static and Instance 3 memory-------------------------");
		statIns3.print();	
		
//		statIns1.b = 400;
//		statIns1.print2();
//		b = 400;
//		print2();
		
		StaticAndInstance.b = 500;
		System.out.println(StaticAndInstance.b);
		StaticAndInstance.print2();
		
		
	}

}
