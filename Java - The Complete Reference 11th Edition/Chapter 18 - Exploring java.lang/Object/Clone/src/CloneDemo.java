// Demonstrate the clone() method

import java.io.*;

class TestClone implements Cloneable {
	int a;
	double b;

	// This method calls Object's clone().
	TestClone cloneTest() {
		try {
			// call clone in Object.
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}
}


class CloneDemo {

	public static void main(String[] args) {

		TestClone x1 = new TestClone();
		TestClone x2;

		x1.a = 10;
		x1.b = 20.98;

		x2 = x1.cloneTest(); // clone x1

		System.out.println("x1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);

		// Keep terminal open
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\npress Enter to continue.");
		try {
			String input = br.readLine();
		} catch (Exception e) {
			System.out.println("Oops!");
		}
	}
}