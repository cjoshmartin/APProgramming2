// project 10-1

import java.util.Scanner;
import java.util.Arrays;

public class project101 {

	 public static void main(String args[])
	 {
		 int[] evenList  = new int[10];
		 int [] oddList  = new int[10];
		 int[] negativeList = new int[10];
		 int num, even = 0,odd = 0,neg = 0;
		 String evenstr = null , oddstr = null, negivtive = null; 
		 Scanner reader = new Scanner(System.in);
		 
		 for (int i =0; i < 10; i++)
		 {
			 System.out.println(" enter in a number(#" + (i+1) + ") :: " );
			 num = reader.nextInt();
			 
			 if (num % 2 ==0)
			 {
				 evenList[even] = num;
			 	even++;
			 }
			 else if (num % 2 ==1)
			 {
				 oddList[odd] = num;
				 odd++;
			 }
			 else if ( num <0)
			 {
				 negativeList[neg] = num;
				neg++;
			 }
			 
		 }// end of for loop
		 
		 
		 for (int y= 0; y < evenList.length;y++)
		 {
			 if (evenList[y] > 0)
				 evenstr = evenList[y] +" ";
			 if (oddList[y] > 0)
				 oddstr = oddList[y] +" ";
			 if (negativeList[y] > 0)
				 negivtive = negativeList[y] +" ";
			 
		 }// end of loop number 2
			 
		 System.out.print(" Even numbers are:: " + evenstr + " \n Odd numbers are:: " + oddstr + "\n The negitves are:: " + negivtive);
		 
	 }// end of main
}// end of project 10-1 class
