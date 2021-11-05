package Capitulo_07_Arrays_and_Lists;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ProbabilidadeValoresRandom {

	public static void main(String[] args) {
		
		int frequencia1 = 0, frequencia2 = 0, frequencia3 = 0,
			frequencia4 = 0, frequencia5 = 0, frequencia6 = 0, face;
		
		// resume os resultados
		for (int jogar = 1; jogar <= 6000; jogar++) {
			face = 1 + (int) (Math.random() * 6);
			// Determina o valor de lançamento e incrementa contador correspondente
			switch (face) {
			case 1:
				++frequencia1;
				break;
			case 2:
				++frequencia2;
				break;
			case 3:
				++frequencia3;
				break;
			case 4:
				++frequencia4;
				break;
			case 5:
				++frequencia5;
				break;
			case 6: 
				++frequencia6;
				break;
			} // fim Switch
		} // fim FOR
		

		
		JTextArea outputArea = new JTextArea();
		outputArea.setText("Face\tFrequencia\tPercentual" +
		"\n1\t" + frequencia1 + "\t" + (String.format("%2.02f", (((float) frequencia1) / 6000)*100)) + 
		"\n2\t" + frequencia2 + "\t" + (String.format("%2.02f", (((float) frequencia2) / 6000)*100)) +
		"\n3\t" + frequencia3 + "\t" + (String.format("%2.02f", (((float) frequencia3) / 6000)*100)) + 
		"\n4\t" + frequencia4 + "\t" + (String.format("%2.02f", (((float) frequencia4) / 6000)*100)) +
		"\n5\t" + frequencia5 + "\t" + (String.format("%2.02f", (((float) frequencia5) / 6000)*100)) +
		"\n6\t" + frequencia6 + "\t" + (String.format("%2.02f", (((float) frequencia6) / 6000)*100)));
		
		JOptionPane.showMessageDialog(null,  outputArea, "Jogando um Dado 6000 vezes", 
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
		// ((float) totalOptCount) / totalRespCount;

	}

}

