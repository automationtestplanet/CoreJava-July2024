package classblock.features;

public class OuterClass {
	
	int a = 100;
	static String str = "Java";
	
	void displayInstance() {
		System.out.println(a);
	}
	
	static void displayStatic() {
		System.out.println(str);
	}
	
	void method1() {
		System.out.println("This is Ouetr Class Method1");
	}
	
	class InnerInstanceClass{
		void method1() {
			System.out.println("Inner Instance Class Method1");
		}
	}
	
	static class InnerStaticClass{
		static void method2() {
			System.out.println("Inner Static Class Method2");
		}
		
		void method3() {
			System.out.println("Inner Static Class Method3");
		}
	}
	
	
	{ // Instance Inner Class without name ->  Anonymous Class
		int b = 100;
		System.out.println(b);
		System.out.println("This is Anonymus block");
	}
	
	static {  // Static Inner class without name -> static block
		String str = "Hello";
		System.out.println(str);
		System.out.println("This is Static block");
	}
	
	public static void main(String[] args) {		
		System.out.println(OuterClass.str);	
		OuterClass.displayStatic();
		
		OuterClass outCls = new OuterClass();
		System.out.println(outCls.a);
		outCls.displayInstance();
		
		OuterClass.InnerInstanceClass innerInsCls= outCls.new InnerInstanceClass();
		innerInsCls.method1();
		
		OuterClass.InnerStaticClass.method2();
		
		OuterClass outCls2 = new OuterClass();
		
		OuterClass outClss3 = new OuterClass() {
			void method1() {
				System.out.println("This is Anonymus Class Method1");
			}
		};
		
		
		outClss3.method1();
	}
	

}
