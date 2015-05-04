
public class Card {

	private String suit;
	private int value;
	private int rank;
	/**
	 * @param suit
	 * @param value
	 * @param rank
	 */
	public Card(String suit, int value, int rank) {
		super();
		this.suit = suit;
		this.value = value;
		this.rank = rank;
	}
	/**
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}
	/**
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
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
	
	public String toString(){
		return rankToName(rank) + " of " + suit;
		
	}
	
	private String rankToName(int rank){
		String rankName = null;
		switch(rank){
		case 1 : rankName = "Ace"; break;
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
