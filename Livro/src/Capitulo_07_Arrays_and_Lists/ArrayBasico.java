package Capitulo_07_Arrays_and_Lists;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ArrayBasico {

	public static void main(String[] args) {
		
		/*
		// Declarar array
		int array[];
		// Criar objeto array com 10 posições
		array =  new int[10];
		*/
		
		// Array declarado e inicializado automaticamente por conter elementos
		int array[] = {00, 10, 20, 30, 40, 50, 60, 70, 80, 90};
		
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

