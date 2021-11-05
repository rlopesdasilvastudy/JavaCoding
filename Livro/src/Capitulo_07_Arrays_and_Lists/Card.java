package Capitulo_07_Arrays_and_Lists;

public class Card {

	private final String face;
	private final String suit;
	
	// Construtor de card inicializa a face e o naipe dela
	public Card (String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	// retorna a representação String de Carta
	public String toString() {
		return face + " de " + suit;
	}

}

