package Capitulo_05_Estruturas_de_Controle;

import javax.swing.JOptionPane;

public class BreakUsandoLabel {

	public static void main(String[] args) {
		
		String output = "";
		
		stop: {
			for (int linha = 1; linha <= 10; linha++) {
				for (int coluna = 1; coluna <= 5; coluna++) {
					if (linha == 5) // se a linha for = 5, pula para o fim do STOP
						break stop;
					output += "* ";
				}
				output += "\n";
			}
			output += "\nLoop terminado normalmente";
		} // Fim do bloco com LAVEL stop 
		JOptionPane.showMessageDialog (null, output, "Testando break com uso de LABEL", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
