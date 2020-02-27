// Using concatenation to prevent long lines.
class ConCat {

	public static void main(String[] args) {

		String longStr = "This could have been " +
			"a very long line that would have " +
			"wrapped around. But string concatenation " +
			"prevents this.";

		System.out.println(longStr);

		int age = 9;
		String s = "He is " + age + " years old.";
		System.out.println(s);

		String s2 = "four: " + 2 + 2;
		System.out.println(s2);

		String s3 = "four: " + (2 + 2);
		System.out.println(s3);
	}
}