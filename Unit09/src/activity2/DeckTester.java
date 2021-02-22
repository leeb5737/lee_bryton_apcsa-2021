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
		String [] rank = {"Ace","Two","Three", "Four","Five", "Six","Seven", "Eight","Nine","Ten","Jack","Queen","King"};
		String [] suit = {"Clovers", "Diamonds", "Hearts", "Spades"};
		int [] points= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck test = new Deck(rank,suit,points);
		
		System.out.println("***Original Deck Methods***");
		System.out.println("toString: " +test);
		System.out.println("isEmpty: " +test.isEmpty() );
		System.out.println("size: " + test.size());
		System.out.println("\n");
		
		System.out.println("***Deal a card***");
		System.out.println("deal: " +test.deal());
		System.out.println("\n");
		
		System.out.println("***Deck after 1st Deal***");
		System.out.println("toString: " +test);
		System.out.println("\n");
		
	}
}
