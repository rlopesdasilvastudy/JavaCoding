package Capitulo_06_Metodos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CalculoMedia2 {

	public static void main(String[] args) {
		
		int total,
			contadorNotas,
			valorNota;
		double media;
		String input;
		
		// Inicialização
		total = 0;
		contadorNotas = 0;
		
		// Processamento
		input = JOptionPane.showInputDialog("Informe a nota ou informe -1 para calcular média e  finalizar");
		valorNota = Integer.parseInt(input);
		
		while (valorNota != -1) {
			total = total + valorNota;
			contadorNotas = contadorNotas + 1;
			input = JOptionPane.showInputDialog("Informe a nota ou informe -1 para calcular média e  finalizar");
			valorNota = Integer.parseInt(input);
		}
		
		// Conclusão
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		
		if (contadorNotas != 0) {
			media = (double) total / contadorNotas;
			JOptionPane.showMessageDialog(null,"A média da classe é " + twoDigits.format(media),
										  "Média da Classe" , JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Nenhum valor para calcular foi informado" ,
											  "Média da Classe", JOptionPane.INFORMATION_MESSAGE);
			}
				
		System.exit(0);
	}

}

