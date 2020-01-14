package defaultInterfaceMethods;

public interface MyIF {
  // This is a "normal" interface method declaration.
  // Id does NOT define a default implementation.
  int getNumber();

  // This is a default method. Notice that it provides
  // a default implementation.
  default String getString() {
    return "Default String";
  }
}

