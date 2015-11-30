// Case Study 10.1: TestScoresView class

import java.util.Scanner;

public class TestScoresView{

   private TestScoresModel model;

   public TestScoresView(TestScoresModel m){
      model = m;
      run();
   }

   // Menu-driven command loop
   private void run(){
      while (true){
         System.out.println("Number of students: " + model.size());
         System.out.println("Index of current student: " +
                            model.currentPosition());
         displayMenu();
         int command = getCommand("Enter a number [1-11]: ", 1, 11);
         if (command == 11)
            break;
         runCommand(command);
      }
   }

   private void displayMenu(){
   System.out.println("MAIN MENU \n"
   		+ "1.Display the current student \n"
   		+ "2.Display the class average \n"
   		+ "3. Display the Students with the highest grade \n"
   		+ "4.Display all students \n"
   		+ "5. Edit the current student \n"
   		+ "6. Add a new student \n"
   		+ "7.Move to the first student \n"
   		+ "8.Move to the last student \n"
   		+ "9.Move to the next student \n"
   		+ "10.Move to the previous student \n"
   		+ "11. Quit the program " );
   // Exercise: List the menu options
   }

   // Prompts the user for a command number and runs until
   // the user enters a valid command number
   // Parameters: prompt is the string to display
   //             low is the smallest command number
   //             high is the largest command number
   // Returns: a valid command number
   private int getCommand(String prompt, int low, int high){
     // Exercise: recover from all input errors
      Scanner reader = new Scanner(System.in);
      System.out.print(prompt);
      int input = reader.nextInt()
      while( input < low || input > high)
      {
    	  System.out.print(prompt);
      int input = reader.nextInt();
      }
      
      return input;
   }

   // Selects a command to run based on a command number,
   // runs the command, and asks the user to continue by
   // pressing the Enter key
   private void runCommand(int command){
   // Exercise   
	   Scanner read = new Scanner(System.in);
	   if (command == 1)
		   model.currentStudent();
	   else if (command == 2)
		   model.getClassAverage();
	   else if (command == 3)
		   model.getHighScore();
	   else if (command == 4)
		   model.toString();
	   else if (command == 5)
		   edit();
	  else if (command == 6)
		  add();
	   else if (command == 7)
		   model.first();
	   else if (command == 8)
		   model.last();
	   else if (command == 9)
		   model.next();
	   else if (command == 10)
		   model.previous();
   }
   private void add()
   {
	   int[] scores[i] =reader.nextInt();
	   Scanner reader new Scanner(system.in);
	   
	   
	   System.out.println("Enter The student's name");
	   String name = reader.next();
	   for (int i=0; i<scores.length; i++)
	   {
	   System.out.println("Enter the Student's scores");
	   scores[i] = reader.nextInt();
	   }
	   Student s = new Student(name, scores);
	   model.add(s);
	   
   }
   
   private void edit(){
	   
	  
	   Scanner reader = new Scanner(System.in);
	   
	   Student s = model.currentStudent();
	   System.out.print("Menu \n"
	   		+ "1. Change Test Scores\n"
	   		+ "2. Change name")
	   int opt=reader.nextint();
		   if (opt== 1){
			   System.out.println("Which test would you like to change?");
			   int test = reader.nextInt();
			   System.out.println("Enter the score");
			   int score = reader.nextInt();
			   s.setScores(test-1, score);
		   }
		   else if (opt == 2 )
		   {
			   System.out.print("enter the student's name"); 
			   String name = reader.next();
			   s.setName(name);
		   }
   }
   
}// end of testScores

