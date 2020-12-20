
public class DeckOfCardsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		
		for(int index = 0; index < 13; index ++) {
			System.out.printf("%-20s%-20s%-20s%-20s\n",myDeckOfCards.dealCard(),
					myDeckOfCards.dealCard(), myDeckOfCards.dealCard(), myDeckOfCards.dealCard());
		}

	}

}
