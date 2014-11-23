//help 
 import java.util.Scanner;

public class project73 {
	
	Scanner reader = new Scanner(System.in);
	String output= "";
	 
	System.out.println("enter Your Grade");
	int grade = reader.nextInt();
	
	if (grade >= 59)
		output = "F";
	else if (grade >= 61)
		output ="D-";
	else if (grade >= 65)
		output ="D";
	else if (grade >= 69)
		output ="D+";
	else if (grade >= 71)
		output ="C-";
	else if (grade >= 75)
		output ="C";
	else if (grade >= 79)
		output ="C+";
	else if (grade >= 81)
		output ="B-";
	else if (grade >= 85)
		output ="B";
	else if (grade >= 89)
		output ="B+";
	else if (grade >= 91)
		output ="A-";
	else if (grade >= 95)
		output ="A";
	else if (grade >= 100)
		output ="A+";
	System.out.println(output);
}
