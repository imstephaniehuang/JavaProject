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
public class card implements Comparable <card> {

    //rank = 13 ranks.
    //suit = 花色
    public int suit;
    public int rank;
    
    @Override
    public int compareTo(card o) {
        if (this.rank == (o.rank))
	            return 0;
	     else if ((this.rank) > (o.rank))
	            return 1;
	     else
	           return -1; 
    }
   

}
