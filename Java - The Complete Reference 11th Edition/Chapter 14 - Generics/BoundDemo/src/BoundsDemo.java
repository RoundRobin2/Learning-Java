// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number.
class Stats<T extends Number> {
  T[] nums; // array of Number or subclass

  // Pass the constructor a reference to
  // an array of type Number or subclass.
  Stats(T[] o) {
    nums = o;
  }

  // Return type double in all cases.
  double average() {
    double sum = 0.0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i].doubleValue();
    }

    return sum / nums.length;
  }

  // This won't work!
  // Determine if two averages are the same.
  boolean sameAvg(Stats<?> ob) {
    if (average() == ob.average()) {
      return true;
    }
    return false;
  }
}

// Demonstate Stats.
public class BoundsDemo {

  public static void main(String[] args) {
    Integer inums[] = { 1, 2, 3, 4, 5 };
    Stats<Integer> iob = new Stats<Integer>(inums);
    double v = iob.average();
    System.out.println("iob average is " + v);

    Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
    Stats<Double> dob = new Stats<Double>(dnums);
    double w = dob.average();
    System.out.println("dob average is " + w);

    if (iob.sameAvg(dob)) {
      System.out.println("Average are the same.");
    } else {
      System.out.println("Averages differ.");
    }
    // This won't compile because String is not a
    // subclass of Number.
    // String strs[] = { "1", "2", "3", "4", "5" };
    // Stats<String> strob = new Stats<String>(strs);

    // double x = strob.average();
    // System.out.printn("strob averge is " + v);
  }
}
