package hw.oop.cards;

public class DescApp {

	public static void main(String[] args) {

		Deck game = new Deck();
		System.out.println(game);
		
		Card[][] newDeck = game.deal(5, 3);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(newDeck[i][j]+ " ");
			}
			System.out.println();
		}				
	}
}
