interface NumericFunc {
  int func(int n);
}

class BlockLambdaDemo {
  public static void main(String[] args) {
    NumericFunc factorial = (n) -> {
      int result = 1;

      for (int i = 1; i <= n; i++)
        result = i * result;

      return result;
    };
    System.out.println("Factorial 5 is: " + factorial.func(5));
    System.out.println("Factorial 7 is: " + factorial.func(7));
  }
}