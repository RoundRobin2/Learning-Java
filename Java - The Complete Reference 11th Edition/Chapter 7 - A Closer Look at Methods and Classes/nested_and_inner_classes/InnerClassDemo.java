/*
 * Demonstrate an inner class.
 *class Outer {
 *  int outer_x = 100;
 *
 *  void test() {
 *    Inner inner = new Inner();
 *    inner.display();
 *  }
 *
 *   this is an inner class
 *  class Inner {
 *    int y = 10;  y is local to Inner
 *
 *    void display() {
 *      System.out.println("display: outer_x = " + outer_x);
 *    }
 *  }
 *
 *  void showy() {
 *    System.out.println(y); // error, y not known here!
 *  }
 *}
 *
 */
// Define an inner class within a for loop.
class Outer {
  int outer_x = 100;

  void test() {
    for(int i = 0; i < 10; i++) {
      class Inner {
        void display() {
          System.out.println("display: outer_x = " + outer_x);
        }
      }
      Inner inner = new Inner();
      inner.display();
    }
  }
}

/**
 * InnerClassDemo
 */
public class InnerClassDemo {
  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.test();
  }
}
