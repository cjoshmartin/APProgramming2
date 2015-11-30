//© A+ Computer Science  -  www.apluscompsci.com
//Name -Josh Martin
//Date -03/30/2015
//Class - 
//Lab  - Lab 1

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab1
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab1.dat"));

		ArrayList<Word> words = new ArrayList<Word>();
		while(file.hasNext())
		{
			//add in a new Word to words
			words.add(new Word(file.next()));
		}

		for (int i = 0; i < words.size()-1 ; i++)
		{
			int min = i; 
			for(int j= i+1; j < words.size(); j++){
			if((words.get(min)).compareTo(words.get(j)) > 0)
				min =j;
			
			
		
			}// end of inner loop
			
			if (min!= i){
			Word temp = words.get(min);	
			words.set(min,words.get(i));
			words.set(i,temp);
			}// end of sort if
			
		}	//end of outer loop

		//print out words
		for (int j =0; j < words.size(); j++)
		System.out.println(words.get(j));
	}
}