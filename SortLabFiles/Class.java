//© A+ Computer Science  -  www.apluscompsci.com
//Name - Josh Martin	
//Date -
//Class - 
//Lab  - Lab 2

import java.util.Scanner;

import static java.lang.System.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name ="";
		studentList = new ArrayList<Student>();
	}
	
	public Class(String names, int stuCount)
	{		
		name =names;
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum,s);
	}
	
	public void sort()
	{
		//Bubble sort 
		for ( int i = 0; i< studentList.size()-1; i++)
			for (int j = 0; j< studentList.size()-1;j++)
				if(studentList.get(j).compareTo(studentList.get(j+1))> 0)
				{
					Comparable temp = studentList.get(j);
					studentList.set(j,studentList.get(j+1));
					studentList.set(j+1,(Student) temp); 
				}
		
	}	
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{	double avg=0;
		int count=0;
		for (int i =0; i < studentList.size();i++){
			avg+=studentList.get(i).getAverage();
			count++;
		}
	   return avg/count;
	}
	
	public double getStudentAverage(int stuNum)
	{
	   return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{	
		for (int i =0; i< studentList.size();i++)
			if(stuName ==studentList.get(i).getName())
				return studentList.get(i).getAverage();
		
	   return -1;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		String temp="";
		for(int i=0; i<studentList.size()-1;i++)
		{
			int min=i;
			for(int j=0; j<studentList.size();j++)
			{
				if(studentList.get(j).compareTo(studentList.get(min))> 0)
				min =j;
			}
		if(min!=i)
			temp =studentList.get(min).getName();
				
		}
		
		return temp;
	}

	public String getStudentWithLowestAverage()
	{ String temp="";
		for(int i=0; i<studentList.size()-1;i++)
		{
			int min=i;
			for(int j=0; j<studentList.size();j++)
			{
				if(studentList.get(j).compareTo(studentList.get(min))< 0)
				min =j;
			}
		if(min!=i)
			temp =studentList.get(min).getName();
				
		}
		
		return temp;
	}
	
	public String getFailureList(double failingGrade)
	{ String str="";
		for (int i= 0; i < studentList.size();i++)
			if (studentList.get(i).getAverage()<= failingGrade)
				str += studentList.get(i).getName() + " ";
		return str;
	}
	
	public String toString()
	{	String str="";
		for (int i =0; i < studentList.size();i++)
			str += studentList.get(i).getName() + " = "+ studentList.get(i).getGrades() +"\n";
		return name +"\n"+str;
	}  	
}// end of class