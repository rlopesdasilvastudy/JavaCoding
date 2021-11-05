package Capitulo_05_Estruturas_de_Controle;

import javax.swing.JOptionPane;

public class ContinueUsandoLabel {

	public static void main(String[] args) {
		
		String output = "";
		
		proximaLinha:  // LABEL alvo da instrução CONTINUE
			for (int linha = 1; linha <= 5; linha++) {
				output += "\n";
				
				for (int coluna = 1; coluna <= 10; coluna++) {
					if (coluna > linha) // se coluna for maior que linha inicia a próxima linha
						continue proximaLinha;
					output += "* ";
				}
			}
 
		JOptionPane.showMessageDialog (null, output, "Testando continue com uso de LABEL", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}

