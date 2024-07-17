package fundamentals;

public class LoopingStatements {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x 9 = " + (i * 9));
		}
		System.out.println("----------------------------------");
		int i = 1;
		while (i <= 10) {

			System.out.println(i + " x 8 = " + (i * 8));
			i++;
		}

		System.out.println("----------------------------------");

		i = 10;

		while (i < 10) {
			System.out.println(i + " x 8 = " + (i * 8));
			i++;
		}

		do {
			System.out.println(i + " x 8 = " + (i * 8));
		} while (i < 10);

	}

}
