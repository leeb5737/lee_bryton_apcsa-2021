package activity2;
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
		Deck test = new Deck(new String[] {"Two", "Four", "Six", "Eight"}, new String[] {"Diamonds", "Clubs"}, new int[] {2, 4, 6, 8});
		System.out.println(test);
	}
}
