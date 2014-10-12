import static java.lang.Math.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class project49 {
	public static void main(String [] args) throws FileNotFoundException
	{
		int base,exp =0;
		Scanner reader = new Scanner(new File("textfile.text"));
		
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
	
	}
}
