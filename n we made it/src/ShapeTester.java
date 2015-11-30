
public class ShapeTester{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c= new Circle();
		Circle c2 = new Circle(1,2, 3);
		System.out.println(c);
		System.out.println(c.area());
		System.out.println(c.stretchBy(4));
		
		System.out.println(c2);
		System.out.println(c2.area());
		System.out.println(c2.stretchBy(4));
		
		Rectangle r = new Rectangle();
		System.out.println(r);
		System.out.println(r.stretchBy(3));
		System.out.println(r.area());
		Cylinder cy = new Cylinder();
		System.out.println(cy);
		System.out.println(cy.area());
		System.out.println(cy.stretchBy(4));
		
		
	}

}
