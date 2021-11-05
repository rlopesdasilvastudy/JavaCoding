package Capitulo_07_Arrays_and_Lists;

import javax.swing.JOptionPane;

public class ArraySomarElementos {

	public static void main(String[] args) {
		
		int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int total = 0;
		
		for (int contador = 0; contador < array.length; contador++) {
			total += array[contador];
		}
		
		JOptionPane.showMessageDialog(null, "Total da soma dos elementos do array " + total, "Soma os elementos de um array", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}

}

