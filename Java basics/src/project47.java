//Project 4-7

import java.util.Scanner;

import static java.lang.Math.*;
public class project47 {

	public static void main(String [] args)
	{
		int awn =0;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number or -1 to halt::");
		awn = reader.nextInt();
		while (awn !=-1)
		{
			System.out.println("= " + Math.pow(2,awn));
			System.out.println("Enter a number or -1 to halt::");
			awn = reader.nextInt();
		}// end of while loop
		System.out.println("End");
	}// end of main
}// end of class
