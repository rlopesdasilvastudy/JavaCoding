package Capitulo_12_Componentes_GUI_parte_1;

import javax.swing.JOptionPane;

public class Addition {
	
	public static void main(String[] args) {
		// obter entrada de usuário a partir de diálogos JOptionPane
		String firstNumber = JOptionPane.showInputDialog("Enter First Integer");
		String secondNumber = JOptionPane.showInputDialog("Enter Second Integer");
		
		// converte String em valores int para utilização em cálculo
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		//Exibe o resultado em um diálogo de mensagem JOptionpane
		JOptionPane.showMessageDialog(null, "The sum is " + sum, 
				"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
	}
	
}

