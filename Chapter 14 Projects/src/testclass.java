//project 13-1
public class testclass {
	
		  String name, tuname;

		    public testclass(String personName) {
		            name = personName;
		    }

		    public void greet(String yourName) {
		    	tuname= yourName;
		            
		    }
		    public String toString(){
		     return String.format("Hi %s, my name is %s", name, tuname);
		    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testclass g1 = new testclass("josh");
		g1.greet("martin");
		System.out.print(g1);
		
		
	}

}
