//© A+ Computer Science  -  www.apluscompsci.com
//Name - Josh Martin	
//Date - 03/19/2015	
//Class - Ap Computer Science
//Lab  - Recursion Lab 2


import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{ 
		int count =0;  
		
		if (num % 2 == 1 )
			count ++;
		
		if( num > 0)
			return countOddDigits(num/10) + count;
		
		return count;
	}
}