package Capitulo_11_Tratamento_de_Exceções;

import java.util.Scanner;

public class AssertTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 10: ");
		int number = input.nextInt();
		// afirma que o valor é >=0 e <=10
		
		/* Para ativar Assertions no Eclipse:
		 * Menu Run > Run Configurations > [Nome da Classe no painel esquerdo] >
		 * Tab Arguments > [Campo VM arguments] > adicionar "-ea" nesse campo
		 * Em caso de execução via prompt, utilizar java -ea AssertTest
		 */
		assert (number >= 0 && number <= 10) : "bad number: " + number;
		
		System.out.printf("You entered %d%n", number);

	}

}

