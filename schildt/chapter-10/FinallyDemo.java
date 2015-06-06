class FinallyDemo {
  static void methA() {
    try {
      System.out.println("Inside methA.");
      throw new RuntimeException("demo");
    }
    finally {
      System.out.println("methA's finally.");
    }
  }

  static void methB() {
    try {
      System.out.println("Inside methB.");
      return;
    }
    finally {
      System.out.println("methB's finally.");
    }
  }

  static void methC() {
    try {
      System.out.println("Inside methC.");
    }
    finally {
      System.out.println("methC's finally.");
    }
  }

  public static void main(String args[]) {
    try {
      methA();
    }
    catch(Exception e) {
      System.out.println("Exception caught.");
    }

    methB();
    methC();
  }
}