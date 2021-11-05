package Capitulo_08_Classes_e_Objetos;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class JurosUsandoBigDecimal {

	public static void main(String[] args) {
		
		// Quantidade principal inicial antes dos juros
		BigDecimal principal = BigDecimal.valueOf(100000.0);
		BigDecimal rate = BigDecimal.valueOf(0.03); // taxa de juros
		
		// Cabeçalhos
		System.out.printf("%s%20s%n", "Ano\t", "Quantidade de depósito");
		// Calcula a quantidade de depósito para cada um dos dez anos
		for (int year = 1; year <= 10; year++) {
			// Calcula nova quantidade durante ano especificado
			BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
			// exibe o ano e a quantidade
			System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
		}
	}
}

