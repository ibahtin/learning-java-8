/*
  Demonstrate the if.
  
  Call this file "IfSample.java".
*/
class ifSample {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x is less than y");

        x = x * 2;
        if(x == y) System.out.println("x now is equal to y");

        x = x * 2;
        if(x > y) System.out.println("x now is more than y");

        // this won't display anything
        if(x == y) System.out.println("you won't see this");
    }
}
