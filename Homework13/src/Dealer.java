import java.util.*;


public class Dealer implements Comparator<Card> {

	@Override
	public int compare(Card card1, Card card2) {
		// TODO Auto-generated method stub
		return card1.getRank() - card2.getRank();
	}

}
