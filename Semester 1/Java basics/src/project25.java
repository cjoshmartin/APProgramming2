//Project 2-5
import java.util.Scanner ;


public class project25 {
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		double mass, momentum, velocity ;
		
		
		System.out.print("Please Leave Out All Units: \n Enter the mass of the object ( in kiograms)");
		mass = reader.nextDouble();
		
		System.out.print("Enter the velocity of the object ( in m/sec)");
		velocity = reader.nextDouble();
		 
		momentum = velocity * mass;
		
		 String strI = Double.toString(momentum);
		 System.out.println("the momentum of the object is " + strI);

		
	}// end of main
	
	
}// end of class
