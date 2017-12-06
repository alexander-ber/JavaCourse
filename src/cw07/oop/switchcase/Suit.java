package cw07.oop.switchcase;

public enum Suit {
	
	HEARTS("H"),
	CLUBS("C"),
	DIAMONDS("D"),
	SPADES("S");
	
	private String representation;

	private Suit(String representation) {
		this.representation = representation;
	}
	
	public String toString() {
		return this.representation;
	}
	
	//Method static - can be runned from class declaration
	public static Suit getByRepresentation(String rep) {
		//.values() - Static method of global enum,
		Suit[] allConstants = Suit.values(); 
		for (Suit suit : allConstants) {
			if (suit.representation.equals(rep)) {
				return suit;
			}
		}
		return null;
	}

}
