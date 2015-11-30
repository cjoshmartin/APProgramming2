import TurtleGraphics.Pen;

// Notice the use of the word "abstract" in the class header.
// This class implements the Shape interface.
// We don't need to say that the class extends Object as that is the default.
import java.awt.Color;

abstract public class AbstractShape implements Shape {

   // Here we declare variables common to all subclasses.
   
   protected double xPos;
   protected double yPos;
   
   // snowman 
	    private int height;
	    private int width;
	    private int xSpeed;
		private int ySpeed;
		private Color color;

	


   

   // Even though this class is never instantiated, it needs constructors
   // to initialize its variables.
   
   public AbstractShape (){
      xPos = 0;
      yPos = 0;
   }
   
   public AbstractShape (double xLoc, double yLoc){
      xPos = xLoc;
      yPos = yLoc;
   }
   
   public AbstractShape(int x, int y, int w, int h){
	   xPos = x;
	   yPos = y;
	   width = w;
	   color = Color.WHITE;
	   xSpeed = 0;
	   ySpeed= 1;	   
   }
   
   public AbstractShape(int x, int y, int w, int h, Color col)
   {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = col;
		xSpeed = 0;
		ySpeed= 1;
   }
   
   public AbstractShape(int x, int y, int w, int h, Color col, int xSpd, int ySpd)
   {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = col;
		xSpeed = xSpd;
		ySpeed= ySpd;
   }  

   
   // There is no code for the next two methods; therefore, they are abstract
   // and terminate with a semicolon. All subclasses must define these methods.
   
   abstract public double area();
  //Abstract shape
   abstract public double perimeter();
   
   abstract public void draw (Pen p);
   
   // These next three methods will never be changed in a subclass; therefore,
   // they are declared final, meaning they cannot be overridden.
   public final double getXPos(){
      return xPos;
   }
   
   public final double getYPos(){
      return yPos;
   }
   
   //Snowman.java
   public int getHeight()
   {
   	return height;
   }
   public int getWidth()
   {	
   	return width;
   }
   
   public Color getColor()
   {
   	return color;
   }
   public int getXSpeed()
   {
   	return xSpeed;
   }
   public int getYSpeed()
   {
   	return ySpeed;
   }

   

   public void setXSpeed( int a)
   {
   	xSpeed = a;
   }
   
   public void setYSpeed(int a)
   {
   	ySpeed = a;
   }
   
   public void setXPos( int a)
   {
   	xPos = a;
   }
   
   public void setYPos( int a)
   {
   	yPos = a;
   }
   


   
   
   //Abstract shape.java
   public  void move (double xLoc, double yLoc){
      xPos = xLoc;
      yPos = yLoc;
   }
   
   // Another abstract method to be defined in subclasses.

   abstract public void stretchBy (double factor);
   
   // Subclasses will override this method.
   // Notice that the method calls area(). More will be said about
   // this later.

   public String toString(){
      String str = "(X,Y) Position: (" + xPos + "," + yPos + ")\n"
                 + "Area: " + area();
      return str;
   }

}


