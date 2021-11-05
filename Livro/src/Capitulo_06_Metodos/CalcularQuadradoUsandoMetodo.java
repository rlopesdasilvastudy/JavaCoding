package Capitulo_06_Metodos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CalcularQuadradoUsandoMetodo {

	public static int square (int y) {
		return y * y;
	}
	
	public static void main(String[] args) {
		
		int result;
		// int valorInformado;
		// String input; 
		String output = "";
		
		/*
		input = JOptionPane.showInputDialog("Informe o valor para calcular o quadrado");
		valorInformado = Integer.parseInt(input);
			result = square(valorInformado);
		JOptionPane.showMessageDialog(null, "resultado: " + result, "Calcula Quadrado" ,
									  JOptionPane.INFORMATION_MESSAGE);
		*/
		
		JTextArea outputArea = new JTextArea();
		for (int counter = 1; counter <=10; counter++) {
			result = square(counter);
			output += "A quadrado de " + counter + " é " + result + "\n";
		}
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, output, "Quadrado", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}
}

