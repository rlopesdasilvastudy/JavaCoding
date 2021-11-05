package Capitulo_06_Metodos;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FactorialComRecursividade extends JFrame {

	JTextArea outputArea;
	
	public FactorialComRecursividade() {
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(outputArea);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		for (long counter = 0; counter <= 10; counter++) {
			outputArea.append(counter + "! = " + fatorial(counter) + "\n");
		}
		
	}
	
	public long fatorial(long number) {
		if (number <= 1)
			return 1;
		else
			return number * fatorial(number - 1);
	}
	
	public static void main(String[] args) {
		
		new FactorialComRecursividade();

	}

}

