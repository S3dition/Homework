/**
 * Dealer Class
 * This class manages the custom sorting for the deck.
 * It begins by setting the first suit (in alphabetical order) and
 * assigns each card by their value (ascending). Once there are no
 * more cards of the same suit, it moves to the next.
 * 
 * @author Stephen
 * @version 05042015.1
 */

import java.util.*;

public class Dealer implements Comparator<Card> {

	/**
	 * Compare Method Override for the stock compare method. This compares the
	 * suits and then the value to properly sort.
	 * 
	 * @param Card
	 * @param Card
	 * @return stringResult
	 */
	@Override
	public int compare(Card card1, Card card2) {
		//There is a bug in java 1.7 that causes the sort contract to break unexpectedly.
		//The solution is to use the legacy sort functionality from java 1.6. Note that
		//This does not use java for comparing but when it is called in Desperado
		//Collections.sort(deck, new Dealer());
		//System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
		// Compare the card suits to make certain they are the same
		int stringResult = (int)card1.gets_Suit().charAt(0) - (int)card1.gets_Suit().charAt(0);
			// if they are the same, return the lesser card within the suit
			if (stringResult > 0) {
				return card1.getRank() - card2.getRank();
			} else if (stringResult < 0) {
				return card1.getRank() - card2.getRank();

			}else{
				return card1.getRank() - card2.getRank();

			}

		}
		return stringResult;
	}
