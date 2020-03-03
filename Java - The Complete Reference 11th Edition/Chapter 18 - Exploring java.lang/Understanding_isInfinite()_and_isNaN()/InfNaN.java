// Demonstrate isInfinite() and isNaN()
class InfNaN {

	public static void main(String[] args) {

		Double d1 = Double.valueOf(10.5);
		Double d2 = Double.valueOf(0/0.);

		System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
		System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());

		System.out.println(Integer.TYPE);
	}
}