//Project 3-3
import java.util.Scanner;


public class project33 {
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		double mass, kinetic, velocity ;
		
		
		System.out.println("Please Leave Out All Units: \n \n Enter the mass of the object ( in kiograms)");
		mass = reader.nextDouble();
		
		System.out.print("Enter the velocity of the object ( in m/sec)");
		velocity = reader.nextDouble();
		 
		kinetic = (1/2) * (velocity * velocity) * mass;
		
		
		 System.out.println("the kinetic energy of the object is " + kinetic);

		
	}// end of main
	
	
}// end of class
