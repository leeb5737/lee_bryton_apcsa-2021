package activity9;
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card> cards;
	//private Card[] card;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		// Arrays
		/*size = ranks.length * suits.length;
		card = new Card[ranks.length * suits.length];
		int value = 0;
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j< suits.length;j++) {
				card[value] = new Card(ranks[i], suits[j], values[i]);
				value++;
			}
		}*/
		
		
		
		cards = new ArrayList<Card>();
		for (int i = 0; i < ranks.length; i++){
			for (String s: suits){
				cards.add(new Card(ranks[i], s, values[i]));
			}
		}
		size = cards.size();
		 
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0) return true;
		else return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		Card transfer;
		//Array List
		for (int i = 0; i < cards.size() ; i++) {
			int rando = (int) (Math.random() * (cards.size()));
			transfer = cards.get(rando);
			cards.set(rando, cards.get(i));
			cards.set(i, transfer);
		}
		size = cards.size();
		
		//Array
		/*
		int rando;
		for (int i = card.length-1; i>=0; i--) {
			rando = (int) (Math.random() * (card.length));
			transfer = card[rando];
			card[rando] = card[i];
			card[i]= transfer;
		}
		size = card.length;*/
		
		
		
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0) return null;
		else {
			size--;
			//Arrays
			//return card[size];
			//ArrayList
			return cards.get(size);
		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		//Arrays
		/*String rtn = "size = " + size + "\nUndealt cards: \n";
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + card[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		rtn = rtn + "\nDealt cards: \n";
		for (int k = card.length - 1; k >= size; k--) {
			rtn = rtn + card[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - card.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;*/
		
		
		
		//Array List
		
		String rtn = "Size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
