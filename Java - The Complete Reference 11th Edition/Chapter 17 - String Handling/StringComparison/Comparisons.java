class Comparisons {
	public static void main(String[] args) {
		// regionMatches()
		System.out.println("Foobar".regionMatches(3, "bar", 0, 3));
		// startsWith() and endsWith
		System.out.println("Foobar".endsWith("bar"));
		System.out.println("Foobar".startsWith("Foo"));
		System.out.println("Foobar".startsWith("bar", 3));
	}
}