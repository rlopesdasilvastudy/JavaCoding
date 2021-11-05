package Capitulo_07_Arrays_and_Lists;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ProbabilidadesValoresRandomArray {

	public static void main(String[] args) {
		
		int face, frequencia[] = new int [7];
		
		for (int jogar = 1; jogar <= 6000; jogar++) {
			face = 1 + (int) (Math.random() * 6);
			++frequencia[face];
		}
		
		String output = "Face\tFrequencia";
		
		for (face = 1; face < frequencia.length; face++) {
			output += "\n" + face + "\t" + frequencia[face];
		}
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, "Jogando Dados 6000 vezes" , JOptionPane.INFORMATION_MESSAGE);

	}

}

