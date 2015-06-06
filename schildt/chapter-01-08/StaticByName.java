class StaticDemo {
  static int a = 44;
  static int b = 88;

  static void callme() {
    System.out.println("a = " + a);
  }
}

class StaticByName {
  public static void main(String[] args) {
    StaticDemo.callme();
    System.out.println("b = " + StaticDemo.b);
  }
}
