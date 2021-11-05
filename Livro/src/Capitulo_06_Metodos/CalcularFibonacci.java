package Capitulo_06_Metodos;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcularFibonacci extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JLabel numberLabel, resultLabel;
	JTextField numberField, resultField;
	
	public CalcularFibonacci() {
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		numberLabel = new JLabel ("informe um inteiro e pressione ENTER");
		container.add(numberLabel);
		numberField = new JTextField(10);
		container.add(numberField);
		
		numberField.addActionListener(this);
		
		resultLabel = new JLabel ("O valor Fibonacci é ");
		container.add(resultLabel);
		resultField = new JTextField(15);
		resultField.setEditable(false);
		container.add(resultField);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 150);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	

	public void actionPerformed(ActionEvent actionEvent) {
		
		long number, fibonacciValue;
		number = Long.parseLong(numberField.getText());
		// showStatus("Calculating");
		fibonacciValue = fibonacci(number);
		resultField.setText(Long.toString(fibonacciValue));
		
	}
	
	public long fibonacci(long n) {
		if (n == 0 || n == 1) 
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n -2);
	}
	
	public static void main(String[] args) {
		
		new CalcularFibonacci();

	}

}

