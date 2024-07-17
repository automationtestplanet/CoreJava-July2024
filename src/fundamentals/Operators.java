package fundamentals;

public class Operators {

	public static void main(String[] args) {
		System.out.println("---------------------Arithematic Operators-----------------");
		int a = 100;
		int b = 200;

		System.out.println(a + b);

		System.out.println(10 / 3);
		System.out.println(10 % 3);

		System.out.println("---------------------Assignment Operators-----------------");
		int c = 100;
		System.out.println(c);
		c += 5;
		System.out.println(c);
		c -= 10;
		System.out.println(c);
		c *= 5;
		System.out.println(c);

		c /= 5;
		System.out.println(c);

		c %= 3;
		System.out.println(c);

		System.out.println("---------------------Increment and Decrement Operators-----------------");
		int d = 10;

		System.out.println(d);
		System.out.println(d++);
		System.out.println(d);
		System.out.println(++d);
		System.out.println(d--);
		System.out.println(d);
		System.out.println(--d);

		System.out.println("---------------------Comparasion Operators-----------------");

		int e = 100;
		int f = 200;

		System.out.println(e > f);
		System.out.println(e < f);
		System.out.println(e >= f);
		System.out.println(e <= f);
		System.out.println(e == f);
		System.out.println(e != f);

		boolean bool2 = e > f;

		System.out.println("---------------------Logical Operators-----------------");

		System.out.println(e > f && e < f); // F && T -> F
		System.out.println(e > f || e < f); // F || T -> T

		System.out.println(e > f || e == f); // F && F -> F
		System.out.println(e > f || e == f); // F || F -> F
		System.out.println(!(e > f || e == f)); // Not F -> T
		System.out.println(e > f && e < f || e == f && e != f); // F T -> F || F -> F && T -> F

		System.out.println("---------------------Ternary Operator-----------------");

		int g = 100;
		int h = 200;

		System.out.println(g > h ? g : h);
		System.out.println(g > h ? true : false);
		System.out.println(g > h ? "G is Greater than H" : "H is Greater than G");

	}

}
