
public class Circle extends Shape {

	private double r;
	
	public Circle()
	{
		super();
		r= 0.0;
		
	}
	public Circle(double x, double y, double z)
	{
		
		super(x,y);
		r= z;
	}
	
	@Override
	public double area() {
		
		return (1/2) *Math.pow(r,2) *Math.PI;
	}

	public double Getr()
	{
		return r;
	}
	@Override
	public void stretchBy(double factor) {
		// TODO Auto-generated method stub
		r = r +factor;
	}

	
	public String toString(){
		return "Circle, r = " + r + " Area = " + area() + super.toString();
	}
}
