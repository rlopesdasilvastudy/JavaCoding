package Capitulo_05_Estruturas_de_Controle;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OperadoresLogicosTabela {

	public static void main(String[] args) {

		JTextArea outputArea = new JTextArea(17,20);
		JScrollPane scroller = new JScrollPane(outputArea);
		String output = "";
				output += "AND Lógico (&&) " +
						   "\nfalse && false: " + (false && false) +
						   "\nfalse && true: " + (false && true) +
						   "\ntrue && false: " + (true && false) +
						   "\ntrue && true: " + (true && true);
				
				output += "\n\nOR Lógico (||) " +
						  "\nfalse || false: " + (false || false) +
						  "\nfalse || true: " + (false || true) +
						  "\ntrue || false: " + (true || false) +
						  "\ntrue || true: " + (true || true);
				
				output += "\n\nAND booleano lógico (&) " +
						  "\nfalse & false: " + (false & false) +
						  "\nfalse & true: " + (false & true) +
						  "\ntrue & false: " + (true & false) +
						  "\nfalse & true: " + (true & true);
				
				output += "\n\nOU booleano lógico inclusivo (|) " +
						  "\nfalse | false: " + (false | false) +
						  "\nfalse | true: " + (false | true) +
						  "\ntrue | false: " + (true | false) +
						  "\ntrue | true: " + (true | true);
				
				output += "\n\nOU booleano lógico exclusivo (^) " +
						   "\nfalse ^ false: " + (false ^ false) +
						   "\nfalse ^ true: " + (false ^ true) +
						   "\ntrue ^ false: " + (true ^ false) +
						   "\ntrue ^ true: " + (true ^ true);
				
				output += "\n\nNÃO lógico: " +
						  "\n!false: " + (!false) +
						  "\n!true: " + (!true);
				
		outputArea.setText (output);
		JOptionPane.showMessageDialog(null, scroller, "Tabela Verdade", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}

}

