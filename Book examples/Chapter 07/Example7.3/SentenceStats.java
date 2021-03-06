// Example 7.3: Count the words and compute the average
// word length in a sentence

//project 7-8
import java.util.Scanner;

public class SentenceStats{

   public static void main(String[] args){

      Scanner reader = new Scanner(System.in);

      while (true){
         System.out.print("Enter a sentence: ");
         String input = reader.nextLine();
        
         if (input.equals(""))
            break;

         int wordCount = 0;
         int sentenceLength = 0;
         int beginPosition = 0;
         int endPosition = input.indexOf(' ');
         while (endPosition != -1){
 
            
            if (endPosition > beginPosition){
               wordCount++;
               String word = input.substring(beginPosition, endPosition);
               sentenceLength += word.length();
            }

          
            beginPosition = endPosition + 1;
            endPosition = input.indexOf(' ', beginPosition);
            
         }

         
         if (beginPosition < input.length()){
            wordCount++;
            String word = input.substring(beginPosition, input.length());
            sentenceLength += word.length();
         }

      
         if (wordCount > 0){
            System.out.println("Number of Words: " + wordCount);
            System.out.println("length of sentence: " + sentenceLength);
            System.out.println("Average word length: " +  sentenceLength / wordCount);
         }
      }
   }
}// end of class
