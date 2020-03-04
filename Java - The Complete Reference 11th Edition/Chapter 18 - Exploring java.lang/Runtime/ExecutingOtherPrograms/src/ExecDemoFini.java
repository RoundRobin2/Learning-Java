// Wait until gedit is terminated.
import java.io.*;

class ExecDemoFini {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		Process p = null;

		try {
			p = r.exec("gedit");
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error executing gedit.");
		}
		System.out.println("gedit returned " + p.exitValue());

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