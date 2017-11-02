package cw04.oop.com.cards;

public class Cards {
	
	private static final int DIAMOND = 0; 
	private static final int SPADES  = DIAMOND + 1;
	private static final int HEARTS  = DIAMOND + 2;
	private static final int CLUBS   = DIAMOND + 3;
	
	private static final int TWO   = 0;
	private static final int THREE = TWO + 1;
	private static final int FOUR  = TWO + 2;
	private static final int FIVE  = TWO + 3;
	private static final int SIX   = TWO + 4;
	private static final int SEVEN = TWO + 5;
	private static final int EIGHT = TWO + 6;
	private static final int NINE  = TWO + 7;
	private static final int TEN   = TWO + 8;
	private static final int JACK  = TWO +  9;
	private static final int QUEEN = TWO +  10;
	private static final int KING  = TWO + 11;
	private static final int ACE   = TWO + 12;
	
	private final int suite; // 0..3
	private final int rank; // 0..12
	
	public Cards(int suite, int rank) {
		this.suite = suite;
		this.rank = rank;
	}
	
	
	
}
