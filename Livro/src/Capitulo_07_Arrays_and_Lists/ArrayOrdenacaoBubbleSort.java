package Capitulo_07_Arrays_and_Lists;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ArrayOrdenacaoBubbleSort extends JFrame {

	public ArrayOrdenacaoBubbleSort () {
		
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		int arrayOriginal[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
		
		String output = "Valores na ordem original\n";
		
		for (int contador = 0; contador < arrayOriginal.length; contador ++) {
			output += "   " + arrayOriginal[contador];
		}
		
		OrdenacaoBubbleSort(arrayOriginal);
		
		output += "\nItens ordenados em ordem crescente\n";
		
		for (int contador = 0; contador < arrayOriginal.length; contador++) {
			output += "   " + arrayOriginal[contador];
		}
		outputArea.setText(output);
		
		container.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Ordenação de Array com Bubble Sort");
		
	}
	
	public void OrdenacaoBubbleSort(int arrayCopia[]) {
		
		for (int passagemNoArray = 1; passagemNoArray < arrayCopia.length; passagemNoArray++ ) {
			
			for (int elemento = 0; elemento < arrayCopia.length -1; elemento++) {
				if (arrayCopia[elemento] > arrayCopia[elemento + 1]) {
					TrocarPosicao(arrayCopia, elemento, elemento + 1);
				}
			}
		}
	}
	
	public void TrocarPosicao(int arrayCopia1[], int primeiroElemento, int segundoElemento) {
		
		int guardaValor;
		
		guardaValor = arrayCopia1[primeiroElemento];
		arrayCopia1[primeiroElemento] = arrayCopia1[segundoElemento];
		arrayCopia1[segundoElemento] = guardaValor;
		
	}
	
	public static void main(String[] args) {
		
		new ArrayOrdenacaoBubbleSort();

	}

}

