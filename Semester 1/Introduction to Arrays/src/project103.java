<<<<<<< HEAD

//project 10-3
import java.util.Scanner;


public class project103 {

	public static int mode (int[] a){
		int [] nums = new int[a.length];
		

	
		
		
		for (int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
				if (a[j] == a[i])
					nums[i]++;
		}
		int modeIndex = 0;
		for(int i = 0; i < nums.length; i++)
			if(nums[i] > nums[modeIndex])
				modeIndex = i;
		
		return a[modeIndex];
	}
	
=======
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
	
	
>>>>>>> origin/master
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
	
	
<<<<<<< HEAD
}// end of class
=======
}
>>>>>>> origin/master
