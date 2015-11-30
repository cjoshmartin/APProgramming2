//Project 14-5

import java.util.*;

public class War {
	
	public static void main(String[] args){
	
	//how do I divide the deck into 2 decks to make two players
		
	List<Card> player1Unplay = new ArrayList<Card>();
	List<Card> player2Unplay = new ArrayList<Card>();
	List<Card> war1 = new ArrayList<Card>();
	List<Card> war2 = new ArrayList<Card>();
	List<Card> winPile1 = new ArrayList<Card>();
	List<Card> winPile2 = new ArrayList<Card>();
	
	
	Deck deck = new Deck();
	deck.shuffle();
		//making a deck cards currently being played
			
	 for (int i = 0; i < deck.size()/2; i++) 

	{ 
		 player2Unplay.add(deck.deal());
		 player1Unplay.add(deck.deal());
	}
	
	
	int war=0, i =0;
	
	 while(!player1Unplay.isEmpty() && !player2Unplay.isEmpty())

	 {
	
	 war1.add(player1Unplay.remove(i));
	 war2.add(player2Unplay.remove(i));
	 
	System.out.print("\n" + "Player1 has put down " + war1 +"\n" + "Player2 has put down " + war2 +"\n" );
	
	if (war1.get(war).compareTo(war2.get(war)) > 0)
	{
		for (int j = war; j >= 0; j--) 

		{ 

			winPile1.add(war1.remove(j));

			winPile1.add(war2.remove(j));

		}
	}
	 
	else if (war1.get(war).compareTo(war2.get(war)) < 0) 

	{ 

	for (int k = war; k >= 0; k--) 

	{ 
		winPile2.add(war1.remove(k));

		winPile2.add(war2.remove(k));
	} 

	war = 0; 

	}
	else 

	{ 

	i++; 

	war++;

	}
	
	 }// end of loop
	
	// winner!
	if (winPile1.size() >winPile2.size())
		System.out.println("Player 1 wins");
		
	else if  (winPile1.size() <winPile2.size())
		System.out.println("Player two wins");	
	
	
	
	}// end of the main
}
