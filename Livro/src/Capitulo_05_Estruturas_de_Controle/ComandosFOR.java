package Capitulo_05_Estruturas_de_Controle;

public class ComandosFOR {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) { // 1 a 100 de 1 em 1
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int i = 100; i >= 1; i--) { // 100 a 1 de -1 em -1
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int i = 7; i <= 77; i += 7) { // 7 a 77 de 7 em 7
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int i = 20; i >= 2; i -= 2) { // 20 a 2 de -2 em -2
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int i = 2; i <= 20; i += 3) { // 2, 5, 8, 11, 14, 17, 20
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int i = 99; i >= 0; i -= 11) { // 99 a 0 de -11 em -11
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int number = 2; number <= 100; number += 2) {
			sum += number;
		}
		System.out.println("Soma de 2 em 2 até 100 é: " + sum);

	}

}

