// Demonstrate a method reference to an instance method.

// a functional interface for sting operations.
interface StringFunc {
  String func(String n);
}

// Now, this class defines an instance method called strReverse().
class MyStringOps {
  String strReverse(String str) {
    StringBuilder result = new StringBuilder();
    int i;

    for (i = str.length() - 1; i >= 0; i--) {
      result.append(str.charAt(i));
    }

    return result.toString();
  }
}

public class MethodRefDemo2 {

  // This method has a functional interface as the type of
  // its first parameter. Thus, is can be passed any instance
  // of that interface, including method references.
  static String stringOp(StringFunc sf, String s) {
    return sf.func(s);
  }

  public static void main(String[] args) {
    String inStr = "Lambda add power to Java";
    String outStr;

    // Create a MyStringOps object.
    MyStringOps strOps = new MyStringOps();

    // Now, a method reference to the instance method strReverse
    // is passed to stringOp().
    outStr = stringOp(strOps::strReverse, inStr);

    System.out.println("Original string: " + inStr);
    System.out.println("String reversed: " + outStr);
  }
}
