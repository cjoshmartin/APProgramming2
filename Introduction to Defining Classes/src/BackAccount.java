//project 6-5
import java.util.Scanner;
// am i doing this right
public class BackAccount {

	private String  name;
	private double balance;
	private Scanner file = new Scanner(System.in);
	
	public BackAccount (String a, double b ){
		name = a;
		balance = b;
		System.out.println("Okay " + a + " would you like make a deposit or withdrawal? ( d or w)");
		whichone(file.next());
	}
	public void whichone(String a){
		if (a== "d")
			deposit();
		else{
			
			withdrawal();
		}
	}
	
	public void deposit() {
		double adding;
		System.out.println("How much would you like to add? ");
		adding = file.nextDouble();
		balance = balance + adding;
	}
	
	public void withdrawal() {
		double subtract;
		System.out.println("How much would you like to add? ");
		subtract = file.nextDouble();
		balance = balance - subtract;
	}
	public String getName() { return name;}
	public double getBalance() {return balance; }
	
public String toString( ) { return getName() + " " + getBalance();}

}// end of class
