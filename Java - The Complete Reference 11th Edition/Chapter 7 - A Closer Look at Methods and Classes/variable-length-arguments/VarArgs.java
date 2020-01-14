// Demonstrate variable-length arguments.
class VarArgs {

  // vaTest() now uses a vararg.
  static void vaTest(int ... v) {
    System.out.println("Number of args: " + v.length +
        " Contents: ");

    for (int x : v) {
      System.out.println(x + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    // Notice how vaTest() can be calles with
    // variable number of arguments.

    vaTest(10); // 1 arg
    vaTest(1, 2, 3); // 3 args
    vaTest(); // no args

  }
}
