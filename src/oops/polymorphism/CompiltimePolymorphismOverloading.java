package oops.polymorphism;

public class CompiltimePolymorphismOverloading {

	int a = 100;
	int b = 200;

	public void addition() {
		System.out.println(a + b);
	}

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void addition(int a, long b) {
		System.out.println(a + b);
	}
	
	public void addition(String a, String b) {
		System.out.println(a + b);
	}
	
	public void addition(char a, char b) {
		System.out.println(a + b);
	}

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void addition(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
	
	public void addition(int ...a) {
		int sum = 0;
		for(int eachVal : a)
			sum+=eachVal;
		System.out.println(sum);
	}
	
	public void addition(int a[], String str[]) {
		int sum = 0;
		for(int eachNum:a)
			sum+=eachNum;
		
		String str2 = "";
		for(String eachStr:str)
			str2+=eachStr;
		
		System.out.println(sum+str2);
		
	}

	public static void main(String[] args) {
		
		CompiltimePolymorphismOverloading overloading = new CompiltimePolymorphismOverloading();		
		overloading.addition();
		overloading.addition(10,20);
		overloading.addition(1000, 2000000);
		overloading.addition(100,200,300);
		overloading.addition(1000,2000,3000,4000);
		overloading.addition(1000,2000,3000,4000,5000);
		overloading.addition(1000,2000,3000,4000,5000,6000);
		overloading.addition(1000,2000,3000,4000,5000,6000,7000);
		overloading.addition(1000,2000,3000,4000,5000,6000,7000,8000);	
		
		int a[] = {1,2,3,4,5,6};
		String s[] = {"Hello","Java"};
		overloading.addition(a,s);

	}

}

