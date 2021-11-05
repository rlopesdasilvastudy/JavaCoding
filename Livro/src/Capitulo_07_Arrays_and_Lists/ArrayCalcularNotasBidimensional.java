package Capitulo_07_Arrays_and_Lists;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ArrayCalcularNotasBidimensional extends JFrame {

	
	int notas [][] = { {10, 20, 30, 40 },
					   {50, 60, 70, 80 },
					   {90, 100, 110, 120 } };
	int alunos, exames;
	String output;
	JTextArea outputArea;
	
	public ArrayCalcularNotasBidimensional() {
		
		alunos = notas.length;
		exames = notas[0].length;
		
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		output = "O Array é: \n";
		
		buildString();
		
		output += "\n\nNota mais baixa: " + minimum() + "\nNota mais alta: " + maximum() + "\n";
		
		for (int contador = 0; contador < alunos; contador++) {
			output += "\nMédia por aluno " + contador + " é " + average(notas[contador]);
		}
		outputArea.setFont(new Font("Courier", Font.PLAIN, 12));
		outputArea.setText(output);
		
		container.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public int minimum() {
		
		int notaBaixa = notas[0][0];
		
		for (int linha = 0; linha < alunos; linha++) {
			for (int coluna = 0; coluna < exames; coluna++) {
				if (notas[linha][coluna] < notaBaixa) {
					notaBaixa = notas[linha][coluna];
				}
			}
		}
		return notaBaixa;
	}
	
	public int maximum() {
		
		int notaAlta = notas[0][0];
		
		for (int linha = 0; linha < alunos; linha++) {
			for (int coluna = 0; coluna < exames; coluna++) {
				if (notas[linha][coluna] > notaAlta) {
					notaAlta = notas[linha][coluna];
				}
			}
		}
		return notaAlta;
	}
	
	public double average(int arrayDeNotas[]) {
		
		int total = 0;
		
		for (int contador = 0; contador < arrayDeNotas.length; contador++) {
			total += arrayDeNotas[contador]; 
		}
		return (double) total / arrayDeNotas.length;
	}
	
	public void buildString() {
		
		output += "          ";
		
		for (int contador = 0; contador < exames; contador++) {
			output += "[" + contador + "]   ";
		}
		
		for (int linha = 0; linha < alunos; linha++) {
			output += "\nNotas[" + linha + "]   ";
			for (int coluna = 0; coluna < exames; coluna++) {
				output += notas[linha][coluna] + "   ";
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		new ArrayCalcularNotasBidimensional();

	}

}

