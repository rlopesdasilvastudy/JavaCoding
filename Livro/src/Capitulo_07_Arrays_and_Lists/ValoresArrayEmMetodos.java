package Capitulo_07_Arrays_and_Lists;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ValoresArrayEmMetodos extends JFrame {

	
	public void modifyArray (int array2[]) {
		for (int contador = 0; contador < array2.length; contador++)
			array2[contador] *= 2;
	}
	
	public void modifyElement (int element) {
		element *= 2;
	}
	
	public ValoresArrayEmMetodos () {
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		int array[] = {1, 2, 3, 4, 5};
		
		String output = "Efeito de passar um array inteiro por referência:\n" + 
		"O valor do array original é:\n";
		
		// Acrescentar os elementos do array original ao String output
		for (int contador = 0; contador < array.length; contador++) {
			output += "   " + array[contador];
		}
		
		modifyArray(array);
		
		output += "\n\nOs valores do array modificado são:\n";
		
		// acrescentar os elementos do array modificado ao String output
		for (int contador = 0; contador < array.length; contador++) {
			output += "   " + array[contador];
		}
		
		output += "\n\nEfetitos de passar array " +
				"elemento por valor:\n" +
				"array[3] antes de executar modifyElement: " + array[3];
		
		// Tentativa de modificar array[3]
		modifyElement(array[3]);
		
		output += "\narray[3] após executar modifyElement: " + array[3];
		outputArea.setText(output);
		
		container.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Sobrecarga de Métodos");
	}
	
	public static void main(String[] args) {
		new ValoresArrayEmMetodos();

	}

}

