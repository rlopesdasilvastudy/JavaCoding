package Capitulo_06_Metodos;

import javax.swing.JOptionPane;

public class InteirosAleatorios {

	public static void main(String[] args) {
		
		int valor;
		String output = "";
		
		for (int contador = 1; contador <= 20; contador++) {
			valor = 1 + (int) (Math.random() * 6);
			
			output += valor + " ";
			
			// quebrar a linha a cada 5 valores retornados
			if (contador % 5 == 0)
				output += "\n";
		}
		
		JOptionPane.showMessageDialog (null, output, "20 Números aleatórios entre 1 e 6", 
									   JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}

}

