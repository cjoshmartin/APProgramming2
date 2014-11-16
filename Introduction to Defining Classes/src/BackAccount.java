//project 6-5

// am i doing this right
public class BackAccount {

	private String  name;
	private double balance;

	
	public BackAccount (String a, double b ){
		name = a;
		balance = b;
	}

	public void deposit(double adding) {
		balance = balance + adding;
	}
	
	public void withdrawal(double subtract) {
		balance = balance - subtract;
	}
	public String getName() { return name;}
	public double getBalance() {return balance; }
	
	public String toString( ) { return getName() + " " + getBalance();}

}// end of class
