//© A+ Computer Science  -  www.apluscompsci.com
//Name -Josh Martin
//Date -
//Class -
//Lab  - Lab 3

import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
		int index =word.indexOf("chicken");
		if(index != -1)
		{
			if(index == 0)
				word= word.substring(7);
			else
				word = word.substring(0,index )+ word.substring(index+7);		
			return 1 + countChickens(word);
		}
		return 0;
	}
}