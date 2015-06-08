class TestClass {
  public static void main(String[] args) {
    Byte myByteObj = 0;
    String myStringObj = "Boo!";

    Class byteClass = myByteObj.getClass();
    Class stringClass = myStringObj.getClass();

    System.out.println(byteClass);
    System.out.println(String.class);
    System.out.println(stringClass.getName());
  }
}