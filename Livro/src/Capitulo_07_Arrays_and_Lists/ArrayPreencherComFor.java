package Capitulo_07_Arrays_and_Lists;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ArrayPreencherComFor {

	public static void main(String[] args) {
		
		final int ARRAY_SIZE = 10;
		
		
		int array[];
		array= new int [ARRAY_SIZE];
		
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = 2 + 2 * contador;
		}
		
		String output = "Posição\tValor\n";
		
		for (int contador = 0; contador < array.length; contador++) {
			output += contador + "\t" + array[contador] + "\n";
		}
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, "Inicializando array de inteiros", JOptionPane.INFORMATION_MESSAGE); 
		System.exit(0);

	}

}

