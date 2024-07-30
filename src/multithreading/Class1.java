package multithreading;

public class Class1 extends Thread {

	public synchronized void run() {
		for(int i =0; i<100; i++) {
			System.out.println("this is Class1");
		}
	}
}
