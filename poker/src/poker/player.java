/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author stephanie
 */
public class player {
        public card[] draw(deck Deck)
	{
		card[] hand = Deck.deal();
		return hand;
	}
	
	// switches card for a new card
	public card redraw(int counter, deck Deck)
	{
		card card = Deck.redeal();
		return card;
	}

}
