//Project 7-2 
import java.util.Random;
import java.util.Scanner;


public class Project72 {

	
	public static void main(String args[])
	 {
	String Guess = "";
	int num;
	Scanner reader = new Scanner(System.in);
	 Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(101);
		
			
		System.out.println(" is the number your think of " + randomInt + " enter -1 if yes, 0 for no"); 
		 num = reader.nextInt();
		
	 Guess += " " + randomInt;
	 while ( num != -1)
	{
		 randomInt = randomGenerator.nextInt(101);
			System.out.println(" is the number your think of " + randomInt ); 
			 num = reader.nextInt();
			 Guess += " " + randomInt;
	}
	
	 System.out.print(" Yes the number is :: " + randomInt );
	 System.out.println(" And I guessed  :: " + Guess );
	 
	 }
	 
}

