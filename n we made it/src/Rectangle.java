
public class Rectangle extends Shape {

	private double l, w;
	
	public Rectangle()
	{
		super();
	
	}
	public Rectangle(double x,double y, double lengh, double width)
	{
		
		super(x,y);
		l=lengh;
		w = width;
	}
	
	@Override
	public double area() {
		
		return l * w;
	}

	@Override
	public void stretchBy(double factor) {
		// TODO Auto-generated method stub
		l = l + factor;
		w = w + factor;
		
	}
	public void flipDimensions(){
		double temp =l ;
		l =w ;
		w =temp;
		
	}
 public String toString()
 {
	 return "Recatangle, Length = " + l + "Width = " + w + " Area = " + area() + super.toString();
 }
}
