package poker;


public class Deck {

	private Card[] cards;

	public Deck() {

		cards = new Card[52];

		int count = 0;

		for ( int j = 0; j <= 3 ; j++ ) {

			for (int k = 1; k <= 13 ;k++ ) {

				cards[count++] = new Card(k, j);
			}
		}


	}

	public Deck(Deck other) {

		//this.cards = other.cards;

		this.cards = new Card[other.cards.length];
		for(int i = 0; i < other.cards.length;i++) {
			cards[i] = other.cards[i];
		}


	}

	public Card getCardAt(int position) {

		return cards[position];

	}

	public int getNumCards() {

		return cards.length;

	}

	public void shuffle() {

		Card[] tophalf; 
		Card[] bottomhalf = new Card[cards.length/2];
		int bottomCount = 0;
		int tcount = 0;
		int bcount = 0;

		//check if length is even or odd
		if ( cards.length % 2 == 0){
			tophalf = new Card[cards.length /2];	
		}
		else {
			tophalf = new Card[(cards.length) / 2 + 1 ];
		}

		//will copy cards to tophalf
		for(int i = 0; i < tophalf.length; i++) {
			tophalf[i] = cards[i];
		}


		for(int i = tophalf.length; i < cards.length; i++) {
			bottomhalf[bottomCount++] = cards[i];
		}


		for (int i = 0; i < cards.length; i++) {

			if (i % 2 == 0) {
				cards[i] = tophalf[tcount++];
			}
			else {
				cards[i] = bottomhalf[bcount++];

			}
		}



	}

	public void cut(int position) {


		for (int i = 0 ; i < position ; i++) {

			Card temp = cards[0];

			for (int j = 0; j < cards.length - 1 ;j++) {

				cards[j] = cards [j + 1];

			}
			cards[cards.length-1] = temp; 

		}

	}



	public Card[] deal(int numCards) {

		Card[] smaller = new Card[cards.length - numCards];

		Card[] deal = new Card[numCards];

		//cards that are going to be dealed
		for (int i = 0; i < numCards;i++) {

			deal[i] = cards[i];
		}

		//creates smaller card array
		for (int j = 0; j < smaller.length; j++) {

			smaller[j] = cards[j + numCards];

		}
		// sets smaller to cards
		cards = smaller;

		return deal;
	}

}
