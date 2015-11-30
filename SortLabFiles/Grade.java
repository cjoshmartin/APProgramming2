//© A+ Computer Science  -  www.apluscompsci.com
//Name -Josh Martin		
//Date -
//Class - 
//Lab  - Lab 2

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

//define the Grade class
public class Grade{



	//add in a instance variable of type double named grade
	double grade;
	
	
	//constructors - default and initialization
	public Grade()
	{
		grade = 0.0;
		
	}
	
	public Grade(double a)
	{
		grade = a;
	}
	
	//method setGrade sets the grade
	public void setGrade(double a)
	{
		grade = a;
	}
	
	
	//method getNum returns the grade
	public double getNum()
	{
		return grade;
	}
	
	
	//method getLetterGrade returns a String A, B, C, D, or F
	public String getLetterGrade()
	{
		
		if (grade >=89.5)
			return "A";
		if (grade >= 79.5)
			return "B";
		if (grade >= 69.5)
			return "C";
		if (grade >= 59.5)
			return "D";
		
		return "F";
	}
	
	
	//method toString returns grade and the letter grade
	public String toString()
	{
		return grade + " - " + getLetterGrade();
	}

}