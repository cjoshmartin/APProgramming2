// Example 3.3: attempt to divide a double by zero

public class DivideByFloatingPointZero{

   public static void main(String [] args){

      double i, j = 0.0;
      i = 3.0 / j;
      System.out.println ("The value of i is  " + i);
      System.out.println ("10 / i equals " + 10 / i);
   }
}
