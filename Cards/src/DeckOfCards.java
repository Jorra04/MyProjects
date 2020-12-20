import java.util.*;

public class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private final int NUMBER_OF_CARDS = 52;
	private Random randomNumbers;
	
	public DeckOfCards() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Jack", "Queen", "King"};
		
		String[] suits = {"Hearts", "Diamonds", "Spade", "Clubs"};
		
		this.deck = new Card[NUMBER_OF_CARDS];
		this.currentCard = 0;
		this.randomNumbers = new Random();
		
		for(int count = 0; count < deck.length; count ++) {
			deck[count] = new Card(faces[count % 13], suits[count/ 13]);
		}
	}
	
	public void  shuffle() {
		this.currentCard = 0;
		
		for(int first = 0; first < deck.length; first ++) {
			int second = this.randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public Card dealCard() {
		if(this.currentCard < this.deck.length) {
			return this.deck[currentCard++];
		}
		else {
			return null;
		}
	}
	
}
