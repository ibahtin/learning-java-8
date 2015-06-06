class StringSwitch {
  public static void main(String[] args) {
    String str = "Two";
    switch(str) {
      case "One":
        System.out.println("One");
        break;
      case "Two":
        System.out.println("Two");
        break;
      case "Three":
        System.out.println("Three");
        break;
      default:
        System.out.println("No match.");
        break;
    }
  }
}