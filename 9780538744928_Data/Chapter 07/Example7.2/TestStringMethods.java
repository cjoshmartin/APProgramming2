// Example 7.2: Test the methods indexOf and substring

public class TestStringMethods{

   public static void main(String[] args){
      String str = "Hi there!";

      // Search for the position of the first space
      int endPosition = str.indexOf(' ');

      // If there is no space, use the whole string     
      if (endPosition == -1)                       
         endPosition = str.length();

      // Extract the first word
      String word = str.substring(0, endPosition);

      // Output the results
      System.out.println(endPosition);   // Prints 2
      System.out.println(word);          // Prints "Hi"
   }
}
