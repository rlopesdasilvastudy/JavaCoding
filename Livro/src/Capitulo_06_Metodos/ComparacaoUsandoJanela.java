package Capitulo_06_Metodos;

import javax.swing.JOptionPane;

public class ComparacaoUsandoJanela {

	public static void main(String[] args) {

		String primeiroNumero ;
		String segundoNumero ;
		String resultado;
		int numero1, numero2;
		
		primeiroNumero = JOptionPane.showInputDialog("informe o primeiro número");
		segundoNumero = JOptionPane.showInputDialog("informe o segundo número");
		
		numero1 = Integer.parseInt(primeiroNumero);
		numero2 = Integer.parseInt(segundoNumero);
		
		resultado = "";
		
		if (numero1 == numero2) 
			resultado = resultado + numero1 + "==" + numero2;
		
		if (numero1 != numero2) 
			resultado = resultado + numero1 + "!=" + numero2;
		
		if (numero1 < numero2) 
			resultado = resultado + "\n" + numero1 + "<" + numero2;
		
		if (numero1 > numero2) 
			resultado = resultado + "\n" + numero1 + ">" + numero2;
		
		if (numero1 <= numero2) 
			resultado = resultado + "\n" + numero1 + "<=" + numero2;
		
		if (numero1 >= numero2) 
			resultado = resultado + "\n" + numero1 + ">=" + numero2;
		
		JOptionPane.showMessageDialog(null, resultado, "Resultado da Comparação", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	}

}

