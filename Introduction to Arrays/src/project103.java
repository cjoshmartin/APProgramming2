import java.util.Scanner;

// not working 
public class project103 {

	public static int mode (int[] a){
		int [] index = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
		String searchNumber;
		int correspondingInput =-1;
		// i don't know what I am doing ?
		searchNumber =...;
		
		for (int i = 0; i < a.length; i++)
		{
			if (searchNumber.equals (index[i]))
				correspondingInput = a[i];
		}
		
		return a;
	}
	
	
	public static void main (String arg[])
	{
		int[] arrayMode = new int[10];
		int modeset = 0;
		 Scanner reader = new Scanner(System.in);
		
		for (int i =0; i < 10; i++)
		 {
			 System.out.println(" enter in a number(#" + (i+1) + ") :: " );
			 arrayMode[i] = reader.nextInt();
		 }// end of for loop
		
		modeset = mode(arrayMode);
		
		System.out.println(" The mode of this set  of numbers is::" + modeset);
	}
	
	
}
