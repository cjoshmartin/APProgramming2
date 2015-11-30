//© A+ Computer Science  -  www.apluscompsci.com
//Name - Josh martin	
//Date -
//Class - 
//Lab  - Lab 2

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Comparable;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;
	
	//add in constructors
	public Student()
	{
		myName ="";
	}
	public Student(String a, String b){
		myName =a;
		myGrades = new Grades(b);
	}
	
	
	//add in set methods



	//add in get methods as shown in StudentTester
	public String getName()
	{
		return myName;
	}
	public Grades getGrades()
	{
		return myGrades;
	}
	
	
	public  double getSum(){
		return myGrades.getSum();
	}
	public double getAverage(){
		
		return getSum()/myGrades.getNumGrades();
	}

	public double getAverageAfterDroppingLow(){
		myGrades.removeValue();
		
		return getSum()/myGrades.getNumGrades();
	}

	public double getLowGrade(){
		
		return myGrades.getLowGrade();
	}
	public double getHighGrade(){
		
		return myGrades.getHighGrade();
	}
	
	public int compareTo(Student other)
	{
	//method compareTo will compare this Student to the other student
	
	if (getAverage()> other.getAverage())
		return 10;
	
	
	//method equals will compare this Student to the other student
	if (getAverage()== other.getAverage())
		return 0;
	
	
	return -10;
	}
	
	
	//add in the toString
	public String toString()
	{
		return myName + " = " + myGrades;
	}
}// end of class