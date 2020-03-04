// Demonstrate toDegrees() and toRadians().
import java.io.*;

class Angles {

	public static void main(String[] args) {

		double theta = 120.0;

		System.out.println(theta + " degrees is " + Math.toRadians(theta) + " radians.");

		theta = 1.312;
		System.out.println(theta + " radians is " + Math.toDegrees(theta) + " degrees.");

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