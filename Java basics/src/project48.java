import java.util.Scanner;

import static java.lang.Math.*;
public class project48 {

	public static void main(String [] args)
	{
		int base,exp =0;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the base ::");
		base = reader.nextInt();
		System.out.println("Enter the exponent or -1 to halt::");
		exp = reader.nextInt();
		while (exp !=-1)
		{
			System.out.println("= " + Math.pow(base,exp));
			System.out.println("Enter the base or -1 to halt::");
			base = reader.nextInt();
			System.out.println("Enter the exponent or -1 to halt::");
			exp = reader.nextInt();
		}// end of while loop
		System.out.println("End");
	}// end of main
}// end of class
