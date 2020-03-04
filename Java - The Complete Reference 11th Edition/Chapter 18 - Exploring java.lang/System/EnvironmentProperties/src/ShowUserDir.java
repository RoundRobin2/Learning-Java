import java.io.*;

class ShowUserDir {

	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));

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