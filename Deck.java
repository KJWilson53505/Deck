/**
	This class models an ordinary deck of fifty-two playing cards (indexed from zero).
*/
public class Deck {

	// private instance data;
	private Card[] cards;

	/** This public constructor makes a new deck with the cards in rank order (ace to king)
	by suit, with the suits in Bridge order (spades, hearts, diamonds, clubs). */
	public Deck() {
		this.cards = new Card[52];
		int i = 0;
		for ( int suit = Card.SPADES; suit <= Card.CLUBS; suit++ ) {
			for ( int rank = Card.ACE; rank <= Card.KING; rank++ ) {
				this.cards[i] = new Card(rank,suit);
				i++;
			}
		}
	}

	/** Returns a COPY of the card at the specified index in this deck. */
	public Card cardAt(int index) {
		if ( index < 0 | index > 51 ) {
			throw new IllegalArgumentException();
		} else {
			return new Card( this.cards[index].getRank(),this.cards[index].getSuit() );
		}
	}

	/** Shuffles this deck. */
	public void shuffle() {
		// Replace the next instruction with your code:
        // (int) (Math.random() * however many cards)
        for ( int i = 51; i > 0; i-- ){
            Card cardPosition = cards[i];
            int newPlace = ( int ) ( Math.random() * i );
            //put card in random new place
            //make card same as other card in random place
            cards[i] = cards[newPlace];
            //puts random place card in the orignal card position
            cards[newPlace] = cardPosition;
        }
		//throw new UnsupportedOperationException();
	}

	/** Returns a stringy version of this deck. */
	public String toString() {
		// Replace the next instruction with your code:
        String result = "";
        //just made two for loops that work either way
        //for ( int i = 0; i < this.cards.length; i++ ) {
        for ( int i = this.cards.length - 1; i >= 0; i-- ) {
            //adds on every card to result string
            result += "\n" + Card.toString( cards[i] );
        }
        return result;
		//throw new UnsupportedOperationException();
	}

	/** Test program for this class. */
	public static void main ( String[] args ) {
		// Replace the next instruction with your code:
        Deck listofCards = new Deck();
        System.out.println( listofCards.toString() );
        listofCards.shuffle();
        System.out.println( listofCards.toString() );
		//throw new UnsupportedOperationException();
	}


}
