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

public class Grades
{
	private ArrayList<Grade> grades;
	
	public Grades()
	{
		grades= new ArrayList<Grade>();
	}
	
	public Grades(String gradeList)
	{	
		// finds - and adds one soo it can find the second space
		int oldSpace = gradeList.indexOf("-") + 1;
		String[] temp = gradeList.substring(oldSpace+ 1).split(" ");
		// gets how many items are in the array list
		int len = gradeList.charAt(0);
		grades= new ArrayList<Grade>(len);
		
		for (int i =0; i < temp.length; i++)
		{
		  double temp2 =Double.parseDouble(temp[i]);	
		grades.add(new Grade(temp2));
	
		
		}
			
	}
	// do I put the same thing as above?
	public void setGrades(String gradeList)
	{	String[] temp =gradeList.split(" ");
		for (int i = 0; i < grades.size();i++)
			grades.set(i,new Grade(Double.parseDouble(temp[i])));
		
	}
	
	public void setGrade(int spot, double grade)
	{
		grades.get(spot).setGrade(grade);
	}
	
	public double getSum()
	{ double sum =0;
		for (int i= 0; i<grades.size();i++)
			sum+=grades.get(i).getNum();
	
		
		return sum;
	}
	
	public double getLowGrade()
	{
		
		double lowest=0;
		//selection sort to find the lowest number in the list
		for ( int i = 0; i< grades.size()-1;i++)
		{
			int min =i;
			for(int j=i+1; j < grades.size(); j++)
			{
				if(grades.get(j).getNum() < grades.get(min).getNum())
					min=j;
					
			}// end of outer
			
			if (min!= i)
				lowest = grades.get(min).getNum();
			
		}//end of outer loop
		
		return lowest;
	}
	
	public double getHighGrade()
	{
		double lowest=0;
		//selection sort to find the Highest number in the list
		for ( int i = 0; i< grades.size()-1;i++)
		{
			int min =i;
			for(int j=i+1; j < grades.size(); j++)
			{
				if(grades.get(j).getNum() > grades.get(min).getNum())
					min=j;
					
			}// end of outer
			
			if (min!= i)
				lowest = grades.get(min).getNum();
			
		}//end of outer loop
		
		return lowest;
	}
	public void removeValue()
	{ int find =0;
		for(int i =0; i< grades.size();i++)
			if (grades.get(i).getNum()== getLowGrade())
				find= i;
		grades.remove(find);
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		
		
		for (int i =0; i<grades.size(); i++)
			output += grades.get(i).toString() + " ";
		return output;
	}	
}// end of class