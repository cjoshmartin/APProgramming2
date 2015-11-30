
public class project74 {

	private String grade;
	 
	public static String getLetterGrade(int a){
		 String output="";
		 int count =0;
		 while (a != -1){
		if (a <= 59)
			output += " " + "F";
		else if (a <= 61)
			output += " " +"D-";
		else if (a <= 65)
			output += " " +"D";
		else if (a <= 69)
			output += " " +"D+";
		else if (a <= 71)
			output += " " +"C-";
		else if (a <= 75)
			output += " " +"C";
		else if (a <= 79)
			output += " " +"C+";
		else if (a <= 81)
			output += " " +"B-";
		else if (a <= 85)
			output += " " +"B";
		else if (a <= 89)
			output += " " +"B+";
		else if (a <= 91)
			output += " " +"A-";
		else if (a <= 95)
			output += " " +"A";
		else if (a <= 100)
			output += " " +"A+";
		
			count= count + 1;
		 }// end of while
		 // make a string that finds the max of scores
		 // same for min
		  //i keep this in one method?
		 return output;
	}//end of Get letter Grade
}// end of class
