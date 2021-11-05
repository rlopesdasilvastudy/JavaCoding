package Capitulo_07_Arrays_and_Lists;

import java.util.ArrayList;

public class ArrayListCollectionDinamico {

	public static void main(String[] args) {
		
		// cria um novo ArrayList de strings com uma capacidade inicial de 10
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("vermelho"); // anexa um item a lista
		items.add(0, "amarelo"); // insere "amarelo" no indice 0
		
		// Cabeçalho
		System.out.print("Exibir conteúdo de listas com loop controlado: ");
		
		// Exibe as cores na lista
		for (int i = 0; i < items.size(); i++) {
			System.out.printf(" %s", items.get(i));
		}
		
		// Exibe as cores usando for each no método display
		display(items, "%nExibe conteúdo da lista usando FOR EACH");
		
		items.add("verde"); // adiciona verde ao fim da lista
		items.add("amarelo"); // adiciona amarelo ao fim da lista
		display(items, "List com dois novos elementos: ");
		
		items.remove("amarelo"); // remove o primeiro amarelo
		display(items, "Remove o primeiro item amarelo: ");
		
		items.remove(1); // remove o item no indice 1
		display(items, "Remove o segundo elemento da lista (verde) ");
		
		// Verifica se um valor esta na lista
		System.out.printf("\"vermelho\" está %sna lista%n", items.contains("vermelho") ? "" : "não ");
		
		// Exibe o número de elementos na lista
		System.out.printf("Tamanho da Lista atual: %s%n", items.size());
	}
	
	// Exibe elementos do array no console
	public static void display(ArrayList<String> items, String header) {
		
		System.out.printf(header); // exibe o cabeçalho
		
		// Exibe cada elemento em items
		for (String item: items) {
			System.out.printf(" %s", item);
		}
		System.out.println();
	}

}

