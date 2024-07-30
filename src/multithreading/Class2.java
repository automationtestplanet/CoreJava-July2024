package multithreading;

public class Class2 implements Runnable{

	public synchronized void run() {
		for(int i =0; i<100; i++) {
			System.out.println("this is Class2");
		}
	}
}
