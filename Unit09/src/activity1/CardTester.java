package activity1;
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
		Card c1 = new Card("Ace", "Hearts", 1);
		System.out.println(c1);
		System.out.println("Suit: " + c1.suit());
		System.out.println("Rank: " + c1.rank());
		System.out.println("Points: " + c1.pointValue());
		Card c2 = new Card("Seven", "Diamonds", 7);
		System.out.println(c2);
		System.out.println("Suit: " + c2.suit());
		System.out.println("Rank: " + c2.rank());
		System.out.println("Points: " + c2.pointValue());
		Card c3 = new Card("Five", "Spades", 6);
		System.out.println(c3);
		System.out.println("Suit: " + c3.suit());
		System.out.println("Rank: " + c3.rank());
		System.out.println("Points: " + c3.pointValue());
		
		System.out.println("Matches (c3 and c3): " + c3.matches(c3));
		System.out.println("Not Matches (c2 and c3): " + c2.matches(c3));
	}
}
