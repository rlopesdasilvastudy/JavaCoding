package Capitulo_06_Metodos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class HistogramaSimples {

	public static void main(String[] args) {
		
		int array[] = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};
		String output = "Elemento\tValor\tHistograma";
		
		for (int contador = 0; contador < array.length; contador++) {
			output += "\n" + contador + "\t" + array[contador] + "\t";
			
			for (int asterisco = 0; asterisco < array[contador]; asterisco++) {
				output += "*";
			}
		}

		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, "Histograma", JOptionPane.INFORMATION_MESSAGE);
	}

}

