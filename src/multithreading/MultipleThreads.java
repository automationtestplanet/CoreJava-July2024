package multithreading;

public class MultipleThreads {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Class1());
		Thread thread2 = new Thread(new Class1());
		
		thread1.run();
		thread2.run();
//		
//		thread1.start();
//		thread2.start();
		
		Thread thread3 = new Thread(new Class2());
		
//		thread1.run();
//		thread2.run();
//		thread3.run();
		
		thread1.start();
//		thread2.start();
		thread3.start();
	}

}
