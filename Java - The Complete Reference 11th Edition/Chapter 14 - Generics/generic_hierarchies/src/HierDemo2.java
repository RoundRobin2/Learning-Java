// A non-generic class can be the superclass
// of a generic subclass.

// A non-generic class
class NonGen {
  int num;
  NonGen(int i) {
    num = i;
  }

  int getnum() {
    return num;
  }
}

// A subclass of Gen that defines a second
// type parameter,  called V.
class Gen3<T> extends NonGen {
  T ob; // declare an object of type T

  // Pass the constructor a reference to
  // an abject of type T
  Gen3(T o, int i) {
    super(i);
    ob = o;
  }

  // Return ob.
  T getOb() {
    return ob;
  }
}

// Create an object of type Gen2
public class HierDemo2 {

  public static void main(String[] args) {
    // Create a Gen object for String.
    Gen3<String> w = new Gen3<String>("Hello ", 48);

    System.out.print(w.getOb());
    System.out.println(w.getnum());
  }
}
