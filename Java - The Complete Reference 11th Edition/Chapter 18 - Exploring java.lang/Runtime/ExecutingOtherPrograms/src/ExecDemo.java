// Demonstrate exec().
import java.io.*;

class ExecDemo {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		Process p = null;

		try {
			p = r.exec("gedit");
		} catch (Exception e) {
			System.out.println("Error executing gedit.");
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