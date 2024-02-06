/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("five", "clubs", 5);
		Card card2 = new Card("seven", "clover", 7);
		Card card3 = new Card("seven", "clover", 7);
		
		System.out.println(card2.matches(card3));
		System.out.println(card2.toString());
	}
}
