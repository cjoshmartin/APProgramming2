// Project 8-3

 import java.util.Scanner;
 import java.lang.Math;
 public class Project83 {
	 public static void main(String args[])
	 {
	double aT=0,r,p,n,t,rate= 0.0;
	n = 4.0;	
	Scanner reader = new Scanner(System.in);

	System.out.print("enter the Principal:: ");
	p = reader.nextDouble();
	
	System.out.print("enter the rate:: ");
	r = reader.nextDouble()* Math.pow(10,-2) ;


	System.out.print("enter the how long:: ");
	t = reader.nextDouble() ;
	
	

	

		for (int f= 0;f <= t; f++ )
		{
		
			System.out.printf("Year:: %d | Orginal principal is:: %.2f | Interate earned:: %.1f",(2014+f),aT,(r*f*100));
			System.out.print("%");
			aT = p*Math.pow((1 + (r/n)),(n*f));
			System.out.printf(" | Prinipal earned: $%.2f%n",aT);
		}

	
	
}// end of main

 }// end of Project 8-3