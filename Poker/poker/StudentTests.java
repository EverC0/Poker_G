package poker;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentTests {

	


	@Test 
	public void haspiar() {
		
		//true
		Card card1 = new Card (1,1);
		Card card2 = new Card (1,1);
		Card card3 = new Card (7,3);
		Card card4 = new Card (3,1);
		Card card5 = new Card (4,2);
		
		//false
		Card card6 = new Card (10,1);
		Card card7 = new Card (2,2);
		Card card8 = new Card (6,1);
		Card card9 = new Card (8,2);
		Card card10 = new Card(5,1);


		
Card[] cardarray = {card1, card2, card3, card4,card5};


Card[] cardarray1 = {card6, card7, card8, card9, card10};

//System.out.println( PokerHandEvaluator.hasPair(cardarray1));


assertTrue(PokerHandEvaluator.hasPair(cardarray));

assertFalse(PokerHandEvaluator.hasPair(cardarray1));

assertEquals(PokerHandEvaluator.hasPair(cardarray1) , false);

	}
	@Test 
	public void hastwopair() {
		
		//true
		Card c1 = new Card (1,1);
		Card c2 = new Card (1,1);
		Card c3 = new Card (7,3);
		Card c4 = new Card (4,1);
		Card c5 = new Card (7,2);
		
		//false
		Card c6 = new Card (10,1);
		Card c7 = new Card (10,2);
		Card c8 = new Card (10,1);
		Card c9 = new Card (10,2);
		Card c0 = new Card(5,1);


		
Card[] cardarray = {c1, c2, c3, c4,c5};

Card[] cardarray1 = {c6, c7, c8, c9, c0};
//assertTrue(1==1);

assertTrue(PokerHandEvaluator.hasTwoPair(cardarray));

assertFalse(PokerHandEvaluator.hasTwoPair(cardarray1));

//System.out.println(  PokerHandEvaluator.hasTwoPair(cardarray1)    );

	}  @Test 
	public void hasThreeOfAKind() {
		
		//true
		Card c1 = new Card (1,1);
		Card c2 = new Card (3,1);
		Card c3 = new Card (3,3);
		Card c4 = new Card (3,1);
		Card c5 = new Card (7,2);
	

		
		//false
		Card c7 = new Card (2,2);
		Card c8 = new Card (8,1);
		Card c9 = new Card (8,2);
		Card c10 = new Card(5,1);
		Card c11 = new Card(7,1);



		
Card[] cardarray = {c1, c2, c3, c4,c5};

Card[] cardarray1 = { c7, c8, c9, c10,c11};


assertTrue(PokerHandEvaluator.hasThreeOfAKind(cardarray));

assertFalse(PokerHandEvaluator.hasThreeOfAKind(cardarray1));

	}  @Test 
	public void hasStraight() {
		
		//true
		Card c1 = new Card (1,1);
		Card c2 = new Card (2,1);
		Card c3 = new Card (3,3);
		Card c4 = new Card (4,1);
		Card c5 = new Card (5,2);
	
		
		Card[] straight = {c1, c2, c3, c4,c5};

		
		
		assertTrue(PokerHandEvaluator.hasStraight(straight));
		
		Card c7 = new Card (13,1);
		Card c8 = new Card (1,0);
		Card c9 = new Card (2,1);
		Card c10 = new Card (3,2);
		Card c11 = new Card (4,3);
	
		
		Card[] straight1 = {c7, c8, c9, c10,c11};
		
		//System.out.println( PokerHandEvaluator.hasStraight(straight1));

		assertFalse(PokerHandEvaluator.hasStraight(straight1));



	} 
	
  @Test 
public void hasFlush() {
	
	//true
	Card c1 = new Card (1,1);
	Card c2 = new Card (2,1);
	Card c3 = new Card (3,1);
	Card c4 = new Card (4,1);
	Card c5 = new Card (5,1);

	
	Card[] straight = {c1, c2, c3, c4,c5};

	
	
	assertTrue(PokerHandEvaluator.hasFlush(straight));
	
	Card c7 = new Card (13,1);
	Card c8 = new Card (1,0);
	Card c9 = new Card (2,3);
	Card c10 = new Card (3,1);
	Card c11 = new Card (4,2);

	
	Card[] straight1 = {c7, c8, c9, c10,c11};
	
	//System.out.println( PokerHandEvaluator.hasStraight(straight1));

	assertFalse(PokerHandEvaluator.hasFlush(straight1));


}
	@Test 
	public void hasFullHouse() {
		
		//true
		Card c1 = new Card (7,2);
		Card c2 = new Card (7,2);
		Card c3 = new Card (10,3);
		Card c4 = new Card (7,1);
		Card c5 = new Card (10,1);
	
		Card[] straight = {c1, c2, c3, c4,c5};
		
		
	//System.out.println(PokerHandEvaluator.hasFullHouse(straight));
	//System.out.println(PokerHandEvaluator.hasTwoPair(straight));
	System.out.println(PokerHandEvaluator.hasFullHouse(straight));


	 assertTrue(PokerHandEvaluator.hasFullHouse(straight));
		

//FALSE
Card c6 = new Card (7,1);
Card c7 = new Card (12,2);
Card c8 = new Card (12,3);
Card c9 = new Card (7,1);
Card c10 = new Card (11,2);

Card[] straight3 = {c6, c7, c8, c9, c10};

//System.out.println(PokerHandEvaluator.hasFullHouse(straight3));

 assertFalse(PokerHandEvaluator.hasFullHouse(straight3));

	 
	 
	}
	@Test 
	public void hasFourofakind() {
		//true
				Card c1 = new Card (1,1);
				Card c2 = new Card (1,1);
				Card c3 = new Card (1,3);
				Card c4 = new Card (1,1);
				Card c5 = new Card (7,2);
				
				//false
				Card c6 = new Card (10,1);
				Card c7 = new Card (2,2);
				Card c8 = new Card (6,1);
				Card c9 = new Card (8,2);
				Card c0 = new Card(5,1);


				
		Card[] cardarray = {c1, c2, c3, c4,c5};

		Card[] cardarray1 = {c6, c7, c8, c9, c0};


		assertTrue(PokerHandEvaluator.hasFourOfAKind(cardarray));

		assertFalse(PokerHandEvaluator.hasFourOfAKind(cardarray1));
		

	}
	@Test 
	public void hasStraightFlush() {
		Card c1 = new Card (10,1);
		Card c2 = new Card (11,1);
		Card c3 = new Card (12,1);
		Card c4 = new Card (13,1);
		Card c5 = new Card (1,1);
		
		//false
		Card c6 = new Card (10,1);
		Card c7 = new Card (2,2);
		Card c8 = new Card (6,1);
		Card c9 = new Card (8,2);
		Card c0 = new Card(5,1);


		
Card[] cardarray = {c1, c2, c3, c4,c5};

Card[] cardarray1 = {c6, c7, c8, c9, c0};


assertTrue(PokerHandEvaluator.hasStraightFlush(cardarray));

assertFalse(PokerHandEvaluator.hasStraightFlush(cardarray1));
		

	}


}