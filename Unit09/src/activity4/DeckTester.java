package activity4;


/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String [] rank = {"Ace","Two","Three", "Four","Five", "Six","Seven", "Eight","Nine","Ten","Jack","Queen","King"};
		String [] suit = {"Clovers", "Diamonds", "Hearts", "Spades"};
		int [] points= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck test = new Deck(rank, suit, points);
		System.out.println(test);
		test.shuffle();
		System.out.println(test);
		for (int i = 0; i <52; i++) {
			test.deal();
		}
		System.out.println(test);
	}
}
