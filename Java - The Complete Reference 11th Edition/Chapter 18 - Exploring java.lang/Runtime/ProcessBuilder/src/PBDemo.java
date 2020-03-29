import java.io.*;

class PBDemo {

	public static void main(String[] args) {

		try {
			ProcessBuilder proc = new ProcessBuilder("Notepad", "testfile");
			proc.start();
		} catch (Exception e) {
			System.out.println("Error executing Notepad.");
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