import java.util.*;
import java.util.List;
import java.awt.*;


public class Desperado {

	public static void main(String[] args) {
		List<Card> deck = new LinkedList<Card>();
StackDeck(deck);
	}
	
	/**
	 * Stack Deck Method
	 * This populates the list with a full deck of cards (minus the jokers and brand).
	 * @param deck
	 */
	public static void StackDeck(List<Card> deck){
		int value = 1;
		for(int i = 0; i < 14; i++){
			if(value < 10){ value = 10;}
		deck.add(new Card("Hearts", value, value));
		deck.add(new Card("Clubs", value, i + 1));
		deck.add(new Card("Diamonds", value, i + 1));
		deck.add(new Card("Spades", value, i + 1));
		}
		//Unsorted
		System.out.println(deck);
		//Sorted
		Collections.sort(deck, new Dealer());
		System.out.println(deck);
	}

}
