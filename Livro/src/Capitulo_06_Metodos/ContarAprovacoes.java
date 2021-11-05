package Capitulo_06_Metodos;

import javax.swing.JOptionPane;

public class ContarAprovacoes {

	public static void main(String[] args) {
		
		int passou = 0,
			reprovou = 0,
			aluno = 1,
			resultado;
		String entrada, saida;
		
		while (aluno <= 10) {
			entrada = JOptionPane.showInputDialog("informe 1 para passou e 2 para reprovou");
			resultado = Integer.parseInt(entrada);
			if (resultado == 1) {
				passou = passou + 1;
			} else {
				reprovou = reprovou + 1;
			}
			
			aluno = aluno + 1;
		}
		
		saida = "Passou; " + passou + "\nReprovou: " + reprovou;
		
		if (passou > 8) {
			saida = saida + "\nAumentar Mensalidade";
		}
		
		JOptionPane.showMessageDialog(null, saida, "Analise dos resultados", JOptionPane.INFORMATION_MESSAGE);;
		System.exit(0);

	}

}

