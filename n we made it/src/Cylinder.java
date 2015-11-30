
public class Cylinder extends Circle {

	private double h,r; 
	public Cylinder() {
		super();
		h=0.0;
		
		
	}
	public Cylinder(double x, double y, double hi,double r )
	{
		super(x,y, r);
		h =hi;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (2 *Math.PI *Getr() *h) + (2* Math.PI * Math.pow(Getr(),2));
	}

	public double volume(){
		return Math.PI * Math.pow(Getr(),2) * h;
	}
	@Override
	public void stretchBy(double factor) {
		 r+= factor;
		 h+= factor;
		
	}

	public String toString(){
		
		return " Cylinder " + super.toString() + " h: " + h + " Area: " + area() + "Volume: " + volume() ;
	}
}
