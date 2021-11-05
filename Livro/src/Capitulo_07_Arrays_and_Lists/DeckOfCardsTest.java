package Capitulo_07_Arrays_and_Lists;

public class DeckOfCardsTest {
	
	public static void main (String[] args) {
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		
		// Imprimir antes de embaralhar
		for (int i =1; i <= 52; i++) {
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			if (i % 4 == 0)
				System.out.println();
		}
		
		System.out.println();
		// coloca as cartas em ordem aleatória
		myDeckOfCards.shuffle();
		
		for (int i =1; i <= 52; i++) {
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			if (i % 4 == 0)
				System.out.println();
		}
	}
}

