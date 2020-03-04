// Timing program execution.
import java.io.*;

class Elapsed {

	public static void main(String[] args) {

		long start, end;

		System.out.println("Timing a for loop from 0 to 100,000,000");

		// time a for loop from 0 to 100,000,000

		start = System.nanoTime(); // get start time

		for (long i = 0; i < 100000000L; i++) ;

		end = System.nanoTime(); // get end time

		System.out.println("Elapsed time: " + (end-start));

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