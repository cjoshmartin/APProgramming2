//project 4 ( critical thinking)

import java.util.Scanner;

import static java.lang.Math.*;

public class Project4 {

	public static void main(String [] args)
	{
		double booksale= 0.0;
		double totalmark = 0.0;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("enter the price of the book::" );
		double bookPri = reader.nextDouble();
		double markup = bookPri*.10;
		 totalmark = totalmark + markup;
		
		System.out.println("The markup is::" + " $" + markup );
		
		System.out.println("The whole sale price is::" + " $" + (bookPri - markup));
		
		 booksale = booksale + bookPri;
		 
		 System.out.println("enter the price of the book or -1 to halt::" );
			 bookPri = reader.nextDouble();
		
		while (bookPri != -1.0)
		{	
			System.out.println("enter the price of the book::" );
			 bookPri = reader.nextDouble();
			 markup = bookPri*.10;
			 totalmark = totalmark + markup;
			
			System.out.println("The markup is::" + " $" + markup );
			
			System.out.println("The whole sale price is::" + " $" + (bookPri - markup));
			
			 booksale = booksale + bookPri;
			 
			 System.out.println("enter the price of the book or -1 to halt::" );
				 bookPri = reader.nextDouble();
			
			
		}
		System.out.println("The Total  cost is is::" + " $" + booksale);
		System.out.println("The Total markup is is::" + " $" + totalmark);
		
	}// end of main
}// end of project 4
