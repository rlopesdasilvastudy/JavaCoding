package Capitulo_06_Metodos;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SobrecargaMetodos extends JFrame{

	public SobrecargaMetodos() {
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(outputArea);
		
		outputArea.setText("O quadrado de inteiro é: " + potencia(7) + "\nO quadrado de decimal é: " + potencia(7.5));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 150);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Sobrecarga de Métodos");
	
	}
	
	public int potencia(int intValue) {
		System.out.println("Calculando potencia com valor inteiro: " + intValue);
		return intValue * intValue;
	}
	
	public double potencia(double doubleValue) {
		System.out.println("Calculando potencia com valor decimal: " + doubleValue);
		return doubleValue * doubleValue;
	}
	
	public static void main(String[] args) {
		
		new SobrecargaMetodos();

	}

}

