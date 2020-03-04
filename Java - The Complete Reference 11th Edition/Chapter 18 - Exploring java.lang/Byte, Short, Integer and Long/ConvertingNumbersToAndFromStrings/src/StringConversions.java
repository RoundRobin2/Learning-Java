/*
	Convert an integer into binary, hexadecimal,
	and octal.
*/

import java.io.*;

class StringConversions {

	public static void main(String[] args) {

		int num = 19648;
		System.out.println(num + " in binary: " + Integer.toBinaryString(num));

		System.out.println(num + " in octal: " + Integer.toOctalString(num));

		System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));

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