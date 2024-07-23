package classblock.features;

abstract public class AbstractClassExample {

	abstract void addition(int a, int b);
	
	abstract void substraction(int a, int b);
	
	void multiplication(int a, int b) {
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args) {
		
		AbstractClassExample absls = new AbstractClassExample(){
			int a = 100;
			
			int b = 200;
			
			@Override
			void addition(int a, int b) {
				System.out.println(this.a+this.b);
				
			}

			@Override
			void substraction(int a, int b) {
				System.out.println(this.a-this.b);				
			}				
		};
		
		absls.addition(10, 20);
		absls.substraction(10, 20);
		absls.multiplication(10, 20);	
		
	}

}
