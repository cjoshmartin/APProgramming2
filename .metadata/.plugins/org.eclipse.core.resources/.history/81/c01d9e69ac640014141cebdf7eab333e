import java.util.Scanner;

//project 6-3
public class Fraction {

	private int num,denom;
	public Fraction()
	{
		num= 0;
		denom = 1;
	}
	public Fraction (int n, int d)
	{
		num= n;
		denom = d;
	}
	public int getNum()
	{
		return num;
	}
	
	public int getDenom()
	{
		return denom;
	}
	// the real work
	public Fraction add(Fraction other)
	{
		int newNum,newDenom;
		if (denom == other.denom)
		{
			newNum= num + other.num;
			newDenom= denom;
		}
		else
		{
			newNum = num*other.denom+ other.num * this.denom;
			newDenom = this.denom * other.denom;
		}
		
		return new Fraction();
	}
	
	public Fraction subtract(Fraction other)
	{
		int newNum,newDenom;
		if (denom == other.denom)
		{
			newNum= num - other.num;
			newDenom= denom;
		}
		else
		{
			newNum = num*other.denom - other.num * this.denom;
			newDenom = this.denom * other.denom;
		}
		
		return new Fraction();
	}
	
	public Fraction mulitply(Fraction other)
	{
		int newNum,newDenom;
		if (denom == other.denom)
		{
			newNum= num * other.num;
			newDenom= denom;
		}
		else
		{
			newNum = num*other.num;
			newDenom = this.denom * other.denom;
		}
		
		return new Fraction();
	}
	
	public Fraction divide(Fraction other)
	{
		int newNum,newDenom;
	
		newNum = num*other.denom;
		newDenom = this.denom * other.num;
		
		
		return new Fraction();
	}
	
	public String toString()
	{
		return num +"/" + denom;
	}
	

	 
}// end of project class
