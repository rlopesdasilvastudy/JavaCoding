package Capitulo_06_Metodos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Pesquisa40Alunos {

	public static void main(String[] args) {
		
		// Array com a nota fornecida pelo resultado da pesquisa
		int respostas[] = {1, 2, 6, 4, 8, 5, 9, 7, 8, 10,
						  1, 6, 3, 8, 6, 10, 3, 8, 2, 7,
						  6, 5, 7, 6, 8, 6, 7, 5, 6, 6,
						  5, 6, 7, 5, 6, 4, 8, 6, 8, 10 } ;
		
		// Iniciando o array que irá acumular a quantidade, usando 11 posições para 
		// evitar o uso da posição 0 e simplificar o programa
		int frequencia[] = new int[11];
		
		/* para cada resposta, seleciona o valor de um elemento
		 * do array respostas e usa aquele valor como subscrito do
		 * array frequencia para determinar o elemento a incrementar
		 */
		for (int pergunta = 0; pergunta < respostas.length; pergunta++) {
			++frequencia[respostas[pergunta]];
		}
		
		String output = "Taxa\tFrequencia\n";
		
		// Acrescentar frequencia a saída da String
		for (int taxa = 1; taxa < frequencia.length; taxa++) {
			output += taxa + "\t" + frequencia[taxa] + "\n";
		}
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, "Pesquisa com Notas", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}

}

