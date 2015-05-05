/**
 * Card Class This class constructs card objects to be placed in a deck. Each
 * card holds it's suit, point value, and rank inside the suit. The only
 * exception to card ordering is the Ace, which is ranked as 1 but holds the
 * point value of 11.
 * 
 * @author Stephen
 * @version 05042015.1
 */

public class Card {

	private String s_Suit;
	private int value;
	private int rank;
	
	/**
	 * Card constructer method. 
	 * Average constructor with nothing special added.
	 * @param suit
	 * @param value
	 * @param rank
	 */
	public Card(String s_Suit, int value, int rank) {
		super();
		this.s_Suit = s_Suit;
		this.value = value;
		this.rank = rank;
	}
	
	/**
	 * gets_suit Method. 
	 * This returns the suit as a string.
	 * @return the suit
	 */
	public String gets_Suit() {
		return s_Suit;
	}
	
	/**
	 * sets_Suit Method.
	 * This sets the suit as a string
	 * @param suit the suit to set
	 */
	public void sets_Suit(String s_Suit) {
		this.s_Suit = s_Suit;
	}
	
	/**
	 * getValue Method
	 * This gets the value as an int
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * setValue Method
	 * This sets the value of the card as an int
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * getRank Method
	 * This returns the rank as an int
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}
	
	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	/**
	 * toString Method
	 * This is the custom toString method that returns the concatenated name of the card.
	 * @return rankToName
	 */
	public String toString(){
		return rankToName(rank) + " of " + s_Suit;
		
	}
	
	/**
	 * rankToName method
	 * This method applies the proper name of the card based on its
	 * initial value. It also applies the proper value of 11 to all
	 * ace cards.
	 * @param rank
	 * @return rankName
	 */
	private String rankToName(int rank){
		String rankName = null;
		switch(rank){
		case 1 : rankName = "Ace"; 
				 value = 11; break;
		case 2 : rankName = "Two"; break;
		case 3 : rankName = "Three"; break;
		case 4 : rankName = "Four"; break;
		case 5 : rankName = "Five"; break;
		case 6 : rankName = "Six"; break;
		case 7 : rankName = "Seven"; break;
		case 8 : rankName = "Eight"; break;
		case 9 : rankName = "Nine"; break;
		case 10 : rankName = "Ten"; break;
		case 11 : rankName = "Jack"; break;
		case 12 : rankName = "Queen"; break;
		case 13 : rankName = "King"; break;
	}
		return rankName;
	}
	
	
}
