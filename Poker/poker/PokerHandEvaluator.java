package poker;

public class PokerHandEvaluator {

	public static boolean hasPair(Card[] cards) {

		boolean constant = false;

		for (int i = 0; i < cards.length;i++) {
			for (int j = i + 1; j < cards.length ;j++) {
				if (cards[i].getValue() == cards[j].getValue()) {

					constant = true;

				}
			}
		}
		return constant;

	}

	public static boolean hasTwoPair(Card[] cards) {
		//checks if two values are the same

		boolean b = false;

		for (int i = 0; i < cards.length; i++) {

			if (counter(cards, cards[i].getValue()) >= 2 ) {

				for (int j = i + 1; j < cards.length; j++) {

					if (counter(cards, cards[j].getValue()) >= 2 ) {

						if (cards[i].getValue() != cards[j].getValue()) {

							b = true;

						}

					}
				}

			}

		}

		return b;



	}



	//first private count for my hastwopairs
	private static int counter (Card[] cards, int value) {

		int count = 0;

		for (int i = 0; i < cards.length;i++) {
			if ( cards[i].getValue() == value ) {	
				count++;	
			}
		}
		return count;

	}
	//secound private count for my hastostraight

	private static boolean Secound (Card[] cards, int value) {

		for (int i = 0; i < cards.length;i++) {
			if ( cards[i].getValue() == value ) {	
				return true;
			}
		}
		return false;

	}
	// checks if 3 values are equals 
	public static boolean hasThreeOfAKind(Card[] cards) {

		boolean valid = false;

		for (int i = 0; i < cards.length;i++) {
			for (int card = i + 1; card < cards.length;card++) {
				for (int card2 = card + 1; card2 < cards.length; card2++) {
					if (cards[card].getValue() == cards[i].getValue() && cards[card2].getValue() == cards[card].getValue()) {
						valid = true;
					}
				}

			}

		}
		return valid;

	}

	// will use the secound private method only
	public static boolean hasStraight(Card [] cards) {

		for(int i = 0; i < cards.length;i++) {

			if( Secound(cards, cards[i].getValue() + 1) && Secound(cards, cards[i].getValue() + 2) &&
					Secound(cards, cards[i].getValue() + 3) && Secound(cards, cards[i].getValue() + 4) ) {
				return true;
			}

			if( Secound(cards, 1) && Secound(cards, 10) &&
					Secound(cards, 11) && Secound(cards, 12) && Secound(cards,13) ) {
				return true;
			}

		}


		return false;

	}

	public static boolean hasFlush(Card[] cards) {

		int count = 0;

		for (int i = 0; i < cards.length ; i++) {

			if (cards[0].getSuit() == cards[i].getSuit()) {
				count++;
			}
		}
		if (count == 5 ) {
			return true;
		}
		return false;
	}


	public static boolean hasFullHouse(Card[] cards) {

		int count = 0;

		if(hasThreeOfAKind(cards) ) {
			count++;
		}
		if( hasTwoPair(cards)) {
			count++;
		}
		if (count == 2) {
			return true;
		}
		else {
			return false;	
		}

	}
	// check each values
	public static boolean hasFourOfAKind(Card[] cards) {


		boolean valid = false;

		for (int i = 0; i < cards.length;i++) {
			for (int card = i + 1; card < cards.length;card++) {
				for (int card2 = card + 1; card2 < cards.length; card2++) {
					for (int card3 = card2 + 1; card3 < cards.length; card3++) {

						if (cards[card].getValue() == cards[i].getValue() 
								&& cards[card2].getValue() == cards[card].getValue()
								&& cards[card3].getValue() == cards[card2].getValue()) {
							valid = true;
						}

					}
				}

			}


		}
		return valid;




	}

	public static boolean hasStraightFlush(Card[] cards) {

		if (hasStraight(cards) && hasFlush(cards) ) {
			return true;
		}
		return false;

	}
}

