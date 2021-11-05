package Capitulo_07_Arrays_and_Lists;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ArrayBidimensionalSimples extends JFrame {

	JTextArea outputArea; 
	
	public ArrayBidimensionalSimples() {
		
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		int array1[][] = { { 1, 2, 3 }, {4, 5, 6} };
		int array2[][] = { {1, 2}, {3}, {4, 5, 6} };
		
		outputArea.append("Valores no array 1 por linha são: \n");
		buildOutput(array1);
		
		outputArea.append("\n Valores no array 2 por linha são: \n");
		buildOutput(array2);
		
		container.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void buildOutput(int array[][]) {
		
		for (int linha = 0; linha < array.length; linha++) {
			for (int coluna = 0; coluna < array[linha].length; coluna++) {
				outputArea.append(array[linha][coluna] + "   ");
			}
		outputArea.append("\n");	
		}
	}
	
	public static void main(String[] args) {
		
		new ArrayBidimensionalSimples();

	}

}

