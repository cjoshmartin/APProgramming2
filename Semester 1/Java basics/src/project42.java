//Project 4-2

import java.util.Scanner;
import static java.lang.Math.*;
public class project42 {
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		double a,b,c =0;
		System.out.println("enter the length of the hypotenuse ::");
		c = reader.nextDouble();
		System.out.println("enter the length of the A::");
		a = reader.nextDouble();
		System.out.println("enter the length of the B::");
		b = reader.nextDouble();
		
		if ((pow(a, 2)+ pow(b, 2)) == pow(c, 2))
			System.out.println("The triangle is a right triangle");
		else
			System.out.println("The triangle is NOT a right triangle");
		
		
	}//end of public
	

}// end of class
