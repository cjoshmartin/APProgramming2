// project 10-2
import java.util.Scanner;

public class Project102 {

	public static double arraydoubles(double[] a)
	{ double sum = 0, aver = 0;
		int count = 0;
		
		for (int i =0; i < a.length;i++ )
		{
			sum += a[i];
			count++;
		}
		
		aver = sum /count;
		return aver;
	}// end of double
	
	 public static void main(String args[])
	 {
		 
		 double[] numbers = new double[10];
		 double num = 0; 
		 double aver = 0;
		 Scanner reader = new Scanner(System.in);
		 
		 for (int i =0; i < 10; i++)
		 {
			 System.out.println(" enter in a number(#" + (i+1) + ") :: " );
			 numbers[i] = reader.nextDouble();
		 }// end of for loop
		 
		 aver = arraydoubles(numbers);
		 System.out.print(" the avarage is:: " + aver + "\n ");
		 for ( int y = 0; y < numbers.length; y++)
		 {
			 if (numbers[y] > aver)
				 System.out.print(" "+ numbers[y]);
		 }
		 
	 }// end of main
	
}// end of class project 10-2
