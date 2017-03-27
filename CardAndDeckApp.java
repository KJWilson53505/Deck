/**
	This program illustrates the use of some of the material in classes Card and Deck.
*/
public class CardAndDeckApp {

	public static void main ( String[] args ) {
		Deck deck = new Deck();
		System.out.println ( deck.toString() );
		System.out.println ( deck.toString() );
		deck.shuffle();
	}

}
