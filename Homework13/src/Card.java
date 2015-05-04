
public class Card {

	private String s_Suit;
	private char c_Suit;
	private int value;
	private int rank;
	/**
	 * @param suit
	 * @param value
	 * @param rank
	 */
	public Card(String s_Suit, int value, int rank, char c_Suit) {
		super();
		this.s_Suit = s_Suit;
		this.value = value;
		this.rank = rank;
		this.c_Suit = c_Suit;
	}
	/**
	 * @return the suit
	 */
	public String gets_Suit() {
		return s_Suit;
	}
	/**
	 * @param suit the suit to set
	 */
	public void sets_Suit(String s_Suit) {
		this.s_Suit = s_Suit;
	}
	/**
	 * @return the c_Suit
	 */
	public char getC_Suit() {
		return c_Suit;
	}
	/**
	 * @param c_Suit the c_Suit to set
	 */
	public void setC_Suit(char c_Suit) {
		this.c_Suit = c_Suit;
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
	
}
