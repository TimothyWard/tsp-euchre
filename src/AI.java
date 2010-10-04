/**
 * 
 * @author Kyle Kary
 *
 */


/**
 * Imports
 */


public class AI {
	
	
	private card[] hand;
	private card card1, card2, card3; //Card played by player to the AI's left, AI's partner, and AI's right, respectively
	private boolean isTurn = false;
	private char trump; //Trump suit: s=spades, h=hearts, d=diamonds, c=clubs
	private int round; //Which round of the hand it currently is (1,2,3,4,5)
	private int tricks;  //Number of tricks won by the AI and its partner

	/**
	 * The main method. Will probably end up waiting here for its turn, then 
	 * calling other methods to complete its turn.
	 * @param args
	 */
	public static void main(String[] args) {
		
//		while(isTurn==true){
//			if(round==1 && trump != null){
//				orderUp();
//			}
//			else{
//				
//			}
//
//		}

	}
	
	/**
	 * Determines if the AI will order up the suit or pass on the trump suit, 
	 * and acts accordingly. Should only be called once per hand.
	 */
	public void orderUp(){
		
		//if AI has a set amount of trump, order up the card
		//else pass
		
		//if trump is still null, and the trump card has been turned down
			//if the AI has a set amount of one suit, order up that suit
			//if the AI is dealer and cannot pass (stuck), pick suit with the highest total cards
			//else pass
		
		isTurn=false;
	}
	
	/**
	 * Determines the best card to lead and plays it.
	 */
	public void leadCard(){
		
		//if hand contains right bower, play right bower
		//else if hand contains left bower, play left bower
		//else if hand contains off-suit, play highest off-suit
		//else play lowest trump
		isTurn=false;
	}
	
	/**
	 * Determines the best card to follow with and plays it.
	 */
	public void followCard(){
		
		//if hasSuit, check if partner has trick
			//if partnerHasTrick, play lowest same-suit
			//if !partnerHasTrick, play highest same suit
		//if !hasSuit, check if partner has trick
			//if !partnerHasTrick && AI has trump, play lowest trump
			//else play lowest off-suit

		isTurn=false;
	}
	
	/**
	 * Plays the given card.
	 * @param c The card to be played by the AI.
	 */
	public void playCard(card c){
		
	}
	
	/**
	 * Determines if the AI has to follow suit with the lead card.
	 * @return True if the AI has suit, false if it does not.
	 */
	public boolean hasSuit(){
		
	}
	
	/**
	 * Determines if the AI's partner is going to take the trick
	 * @return True if the partner is going to take it, false otherwise
	 */
	public boolean partnerHasTrick(){
		
	}
	
	/**
	 * Finds the lowest card in the AI hand.
	 * @return the lowest card in the AI hand.
	 */
	public card lowestCard(){
		
	}
	
	/**
	 * Finds the lowest trump card in the AI hand.
	 * @return the lowest trump card in the AI hand.
	 */
	public card lowestTrump(){
		
	}
	
	/**
	 * Finds the highest off-suit card in the AI hand.
	 * @return the highest off-suit card in the AI hand.
	 */
	public card highestOffSuit(){
		
	}
	
	
	

}
