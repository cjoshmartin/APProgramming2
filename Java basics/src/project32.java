//project 3-2
import java.util.Scanner;


public class project32 {
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
	double radius, diameter,circumfernce, surfacearea,volume;	
		System.out.print("enter the radius of the sphere::");
		radius = reader.nextInt();
		
		diameter = 2* radius;
		circumfernce = 2* radius * Math.PI;
		surfacearea = 4 * Math.PI * (radius * radius); 
		volume = (4/3) * Math.PI * (radius * radius * radius);
		System.out.println("The diameter is " + diameter);
		System.out.println("The circumfernce is " + circumfernce);
		System.out.println("The surface area is " + surfacearea);
		System.out.println("The volume is " + volume);
		
	}

}
