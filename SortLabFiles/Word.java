//© A+ Computer Science  -  www.apluscompsci.com
//Name - Josh Martin 
//Date - 03/30
//Class - 
//Lab  - Lab 1

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;
	
	//constructors
	
	public Word()
	{
		word = "";
	}
	public Word(String a)
	{
		word =a;
	}
	
	
	
	//compareTo

	public int compareTo(Word other)
	{
		int dif = word.length() - other.word.length();
		if (dif == 0)
			return word.compareToIgnoreCase(other.word);
		
		return dif;
	}
	
	
	//toString
	
	public String toString()
	{
		return word;
		
	}
	
	

	
}