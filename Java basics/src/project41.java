//Project 4-1

import java.util.Scanner;
public class project41 {
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int numone,whole, remind, numtwo  =0;
		System.out.println("Please enter the first number::");
		numone = reader.nextInt();
		System.out.println("Please enter the second number::");
		numtwo = reader.nextInt();

	if ( numone > numtwo)
	{
		whole = numone / numtwo ;
		remind = numone % numtwo ;
		
		System.out.println("The Anwsers is ::" + whole +" r" + remind);
		
	}// end of if
	else if ( numone < numtwo)
	{
		whole = numtwo / numone ;
		remind = numtwo % numone;
		System.out.println("The Anwsers is ::" + whole +" r" + remind);
	}// end of else if
	
	}// end of main
}// end of project
