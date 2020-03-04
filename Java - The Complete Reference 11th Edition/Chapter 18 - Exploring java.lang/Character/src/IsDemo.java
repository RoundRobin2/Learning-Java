// Demonstrate several is... methods.
import java.io.*;

class IsDemo {

	public static void main(String[] args) {

		char a[] = {'a', 'b', '5', '?', 'A', ' '};

		for (int i = 0; i < a.length; i++) {
			if (Character.isDigit(a[i]))
				System.out.println(a[i] + " is a digit.");
			if (Character.isLetter(a[i]))
				System.out.println(a[i] + " is a letter.");
			if (Character.isWhitespace(a[i]))
				System.out.println(a[i] + " is whitespace.");
			if (Character.isUpperCase(a[i]))
				System.out.println(a[i] + " is uppercase.");
			if (Character.isLowerCase(a[i]))
				System.out.println(a[i] + " is lowercase.");
			if (Character.isBmpCodePoint(a[i]))
				System.out.println(a[i] + " isBmpCodePoint.");
			if (Character.isHighSurrogate(a[i]))
				System.out.println(a[i] + " isHighSurrogate.");
			if (Character.isLowSurrogate(a[i]))
				System.out.println(a[i] + " isLowSurrogate.");
		}
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