package Capitulo_06_Metodos;

import javax.swing.JOptionPane;

public class CalculoMedia1 {

	public static void main(String[] args) {
		
		int total,
			contadorNotas,
			valorNota,
			media;
		String nota;
		
		// Inicialização
		total = 0;
		contadorNotas = 1;
		
		while (contadorNotas <= 10) {
			nota = JOptionPane.showInputDialog("informe a nota com número Inteiro");
			valorNota = Integer.parseInt(nota);
			total = total + valorNota;
			contadorNotas = contadorNotas + 1;
		}
		
		media = total / 10;
		
		JOptionPane.showMessageDialog(null, "A média da classe é " + media, "Média da Classe", JOptionPane.INFORMATION_MESSAGE);;
		System.exit(0);

	}

}

