package Capitulo_07_Arrays_and_Lists;

import java.security.SecureRandom;

public class DeckOfCards {
	
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// Construtor preenche o baralho com as cartas
	public DeckOfCards() {
		String[] faces = { "As", "Dois", "Três", "Quatro", "Cinco", "Seis", 
						   "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei" };
		String[] suits = { "Copas" , "Paus", "Oros", "Espada"};
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		// Preenche baralho com Objetos Card
		for (int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count%13], suits[count/13]);
		}
	}
		// Embaralha as cardas com algoritmo de uma passagem
	public void shuffle() {

		//  a próxima chamada para o método dealCard deve começar no deck[0] novamente
		currentCard = 0;

		for (int first = 0; first < deck.length; first++) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}

	public Card dealCard() {
		if (currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}

}


