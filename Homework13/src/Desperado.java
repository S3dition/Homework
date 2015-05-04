import java.util.*;
import java.util.List;
import java.awt.*;


public class Desperado {

	public static void main(String[] args) {
		List<Card> deck = new LinkedList<Card>();

	}
	
	public static void StackDeck(List<Card> deck){
		for(int i = 1; i < 14; i++)
		deck.add(new Card("Hearts", 0, 0, 'h'));
		deck.add(new Card("Diamonds", 0, 0, 'd'));
		deck.add(new Card("Clubs", 0, 0, 'c'));
		deck.add(new Card("Spades", 0, 0, 's'));
	}

}
