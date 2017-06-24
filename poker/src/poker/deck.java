/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Random;

/**
 *
 * @author stephanie
 */
public class deck {
    
    private final int DECK_SIZE = 52;
    private final int SHUFFLE_EXCHANGES = 2000;
    private final int HAND_SIZE = 5;
    public int restOfDeck = 6;
	
    card[] deck = new card[DECK_SIZE];
    Random r = new Random();
	
	// fill deck with cards
	public void fillDeck()
	{
		int counter = 0;
		for (int suit = 1; suit <= 4; suit++)
		{
			for (int rank = 1; rank <= 13; rank++)
			{
				deck[counter] = new card();
				deck[counter].suit = suit;
				deck[counter].rank = rank;
				counter++;
			}
		}
	}
	
	// shuffle deck
	public void shuffle()
	{
		for (int x = 0; x <= SHUFFLE_EXCHANGES; x++)
		{
			int number1 = r.nextInt(DECK_SIZE);
			int number2 = r.nextInt(DECK_SIZE);
			card temp = deck[number1];
			deck[number1] = deck[number2];
			deck[number2] = temp;
		}
	}
	
	
        // deals 5 cards
	public card[] deal()
	{
		card[] hand = new card[HAND_SIZE];
		for (int deckPosition = 0; deckPosition < 5; deckPosition++)
		{
			hand[deckPosition] = deck[deckPosition];
		}
		return hand;
	}
	
	
        // deals cards for redraw
	public card redeal()
	{
		card nextCard = deck[restOfDeck];
		restOfDeck++;
		return nextCard;
	}
	
	// refreshes deck position to 6 for next hand
	public void refreshDeckPosition()
	{
		restOfDeck = 6;
	}
}
