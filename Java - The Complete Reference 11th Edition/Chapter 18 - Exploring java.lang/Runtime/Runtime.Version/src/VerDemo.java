// Demonstrate Runtime.Version release counters
import java.io.*;

class VerDemo {

	public static void main(String[] args) {

		Runtime.Version ver = Runtime.version();

		// Display individual counters.
		System.out.println("Feature release counter: " + ver.feature());
		System.out.println("Interim release counter: " + ver.interim());
		System.out.println("Update release counter: " + ver.update());
		System.out.println("Patch release counter: " + ver.patch());

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