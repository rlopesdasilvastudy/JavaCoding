package Capitulo_06_Metodos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class DeterminarMaximo {
	
	public static double maximum (double x, double y, double z) {
		return Math.max(x, Math.max(y, z));
	}
	
	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog("Informe o primeiro numero decimal");
		String s2 = JOptionPane.showInputDialog("Informe o segundo numero decimal");
		String s3 = JOptionPane.showInputDialog("Informe o terceiro numero decimal");
		
		double number1 = Double.parseDouble(s1);
		double number2 = Double.parseDouble(s2);
		double number3 = Double.parseDouble(s3);
		
		double max = maximum(number1, number2, number3);
		
		JTextArea outputArea = new JTextArea();
		
		outputArea.setText("Primeiro número: " + number1 + 
						   "\nSegundo número: " + number2 + 
						   "\nTerceiro número " + number3 +
						   "\nO máximo entre eles é: " + max);
		
		JOptionPane.showMessageDialog(null, outputArea, "Quadrado", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}

