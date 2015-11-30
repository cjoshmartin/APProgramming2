/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("Ace" ,"spades", 1 );
		Card c2 = new Card("Queen" ,"hearts", 5 );
		Card c3 = new Card("King" ,"diamonds ", 10);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
}
