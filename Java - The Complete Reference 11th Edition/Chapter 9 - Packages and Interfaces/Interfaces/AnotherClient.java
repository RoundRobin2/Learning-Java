// Another implementation of Callback.
package Interfaces;

class AnotherClient implements Callback {
  // Implement Callback's interface
  public void callback(int p) {
    System.out.println("Another version of callback");
    System.out.println("p squared is " + (p * p));
  }
}
