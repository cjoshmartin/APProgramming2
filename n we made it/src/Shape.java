public abstract class Shape
{
	private double xPos;
	private double yPos;

	public Shape ()
	{
		xPos = 0;
		yPos = 0;
	}

	public Shape(double x, double y)
	{
		xPos = x;
		yPos = y;
	}

	public abstract double area();
	
	public abstract void stretchBy (double factor);
	
	public double getXPos()
	{
		return xPos;
	}
	
	public double getYPos()
	{
		return yPos;
	}
	
	public void moveTo(double xLoc, double yLoc)
	{
		xPos = xLoc;
		yPos = yLoc;
	}
	
	public String toString()
	{
		String str = "(X, Y) Position: (" + xPos + "," + yPos + ")\n";
		return str;
	}
}