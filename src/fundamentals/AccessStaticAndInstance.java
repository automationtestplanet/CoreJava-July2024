package fundamentals;

public class AccessStaticAndInstance {

	public static void main(String[] args) {
		
		System.out.println(Class1.b);
		Class1.staticPrint();
		System.out.println(Class1.str2);
		System.out.println("---------------------------");
		
//		int val1 = new Class1("Hello", "Java").a;
//		new Class1("Hello", "Java").print();
//		new Class1("Hello", "Java").staticPrint();
		
		Class1 cls1 = new Class1("Hello", "Java");
		
		int val1 = cls1.a;
		
		System.out.println(cls1.a);
		System.out.println(Class1.b);
		System.out.println(cls1.str1);
		System.out.println(Class1.str2);
		cls1.print();
		Class1.staticPrint();
		cls1.printGlobalData();
		
		Class1 cls2 = new Class1("Hello", "World");
		
		cls2.printGlobalData();
		
	}

}
