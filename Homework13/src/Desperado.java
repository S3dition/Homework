/**
 * Desperado program
 * 
 * The purpose of this program is to play a version of
 * blackjack utilizing a single deck per round until
 * 4 winning hands are dealt in a single round.
 * 
 * The deck is built in arranged order, shuffled, the
 * queens are revealed, then the cards are dealt in pairs.
 * Any pair that equals 21 counts as a win and is recorded.
 * The deck will be re-shuffled whenever 4 winning hands
 * are not dealt and a new round will begin. Once a
 * winning round has been dealt, some stats are outputted
 * and the deck is then sorted in reverse order. 
 * 
 * Some methods may have C naming conventions, as I'm also
 * working on a heavy C# program and coding habits are hard
 * to break.
 *  
 * @author Stephen
 * @version 05042015.1
 */

import java.util.*;

public class Desperado {

	/**
	 * Main Desperado method Runs through the program and executes assorted
	 * methods. Let's call it the dealer's table.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		ArrayList<Card> deck = new ArrayList<Card>();
		StackDeck(deck);
		DealThemCards(deck);
	}

	/**
	 * Stack Deck Method This populates the list with a full deck of cards
	 * (minus the jokers and brand). The dealer then unpacks the cards and
	 * reveals them in sorted order.
	 * 
	 * @param deck
	 */
	public static void StackDeck(ArrayList<Card> deck) {
		int value = 1;
		for (int i = 0; i < 13; i++) {
			if (value > 10) {
				value = 10;
			}

			// Add a card of value i to each suit to the deck
			deck.add(new Card("Hearts", value, i + 1));
			deck.add(new Card("Clubs", value, i + 1));
			deck.add(new Card("Diamonds", value, i + 1));
			deck.add(new Card("Spades", value, i + 1));
			value++;
		}

		// Pull deck from the package
		Collections.sort(deck, new Dealer());
		System.out.println("Sorted Deck: " + deck);
	}

	/**
	 * DealThemCards method
	 * This method plays the actual game. It shuffles the deck for the first time
	 * and then deals a round of cards. Before the card sets are checked, it finds
	 * the index of the queen of hearts and queen of diamonds, then prints the
	 * indexes.
	 * 
	 * If a round has 4 winning sets, the program ends and reports some generic
	 * statistics, as well as a reverse sorted deck arraylist.
	 * @param deck
	 */
	public static void DealThemCards(ArrayList<Card> deck) {

		int timesDealt = 0;
		int winningHands = 0;
		int totalWinningHands = 0;

		// Print the shuffled Deck
		System.out.println("\nLet's play, boy!");
		Collections.shuffle(deck);
		System.out.println("Shuffling Deck for the first time: " + deck + "\n");

		// Dealer loop
		while (winningHands < 4) {
			winningHands = 0;

			// Find the queen of diamonds and the queen of hearts and print
			// their indexes
			Iterator<Card> itr = deck.iterator();
			for (int i = 0; i < deck.size(); i++) {
				Card currentCard = itr.next();
				if (currentCard.getRank() == 12 && currentCard.gets_Suit() == "Diamonds") {
					System.out.println("The Queen of Diamonds is at index: " + i);
				} else if (currentCard.getRank() == 12 && currentCard.gets_Suit() == "Hearts") {
					System.out.println("The Queen of Diamonds is at index: " + i);
				}
			}

			// Deal cards and look for 4 matches of 21
			Iterator<Card> dealCard = deck.iterator();
			for (int i = 0; i < deck.size(); i += 2) {
				Card firstCard = dealCard.next();
				Card secondCard = dealCard.next();
				timesDealt++;

				//if the value of the two cards = 21, the card pair is a winner. Alert the media
				if (firstCard.getValue() + secondCard.getValue() == 21) {
					winningHands++;
					totalWinningHands++;
					System.out.println("[WINNING HAND!: " + firstCard + " and " + secondCard + "]");
				}

			}

			if (winningHands < 4) {
				// If we don't get 4 or more winning hands, reshuffle the deck
				// and try again.
				System.out.println("Better luck next time, boy!\n");
				Collections.shuffle(deck);
			}

		}
		// On winning, the hands are shown and the deck is reprinting in reverse
		// sorted order
		System.out.println("\nYou cheatin' on me boy?");
		System.out.println("Hands Dealt: " + timesDealt + " || " + "Total Winning Hands: " + totalWinningHands);
		Collections.sort(deck, new Dealer());
		Collections.reverse(deck);
		System.out.println("Sort from the bottom of the deck: " + deck);
	}

}
