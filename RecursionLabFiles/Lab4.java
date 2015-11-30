//© A+ Computer Science  -  www.apluscompsci.com
//Name - Josh Martin
//Date -
//Class -
//Lab  -Lab 4

import static java.lang.System.*;

public class Lab4
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter counter  = new AtCounter();
		
		counter.countAts(5,0);
		//test the code
		
		out.println(counter.getAtCount());
		
	}
}