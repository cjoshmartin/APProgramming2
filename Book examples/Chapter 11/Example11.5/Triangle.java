// project 11-4
public class Triangle extends AbstractShape {

	private double x1,x2,y1,y2;
		
	public Triangle() {
		super();
		x1=2;
		y1 =2;
		y2=0;
	}

	public Triangle(double xLoc, double yLoc, double x, double y, double a, double b) {
		super(xLoc, yLoc);
		x1 =x;
		y1 =y;
		x2 =a;
		y2=b;
	}

	
	public double area() {
		return 0.5 * Math.abs(getXPos()*y1 -x1 * getYPos()  + x1* y2-x2 * y1 +x2 *getYPos()-getXPos()* y2);
	}


	public double distance(){
	return Math.sqrt((getXPos() - x1)* (getXPos() - x1) + (getYPos() -y1) * (getYPos() -y1));	
		
	}
	

	public double perimeter() {
		
		double side1 = Math.sqrt(Math.pow((x2-x1),2)*Math.pow((y2-y1),2));
		double side2 = Math.sqrt(Math.pow((getXPos()-x2),2)*Math.pow((getYPos()-y2),2));
		double	side3 = Math.sqrt(Math.pow((getXPos()-x1),2)*Math.pow((getYPos()-y1),2));
		
		
		return side1 +side2 + side3;
	}
	
	
	public void draw(TurtleGraphics.Pen p){
		p.move(x1,y1);
		p.move(x2,y2);
		p.move(xPos,yPos);
		
	}
	public void move(double xAmount, double yAmount)
	{
		double changeX =xAmount - xPos;
		double changeY = yAmount - yPos;
		super.move(xAmount,yAmount);
		x1 +=changeX;
		x2 += changeX;
		y2+= changeY;
		y1+= changeY;
	}
	public void stretchBy(double factor) {
		x1 *=factor;
		x2 *=factor;
		y1 *=factor;
		y2 *=factor;
	}

}
