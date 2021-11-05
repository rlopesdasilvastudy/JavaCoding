package Capitulo_07_Arrays_and_Lists;

import java.util.Arrays;

public class ArrayManipulacao {

	public static void main(String[] args) {
		
		// Classificar array em ordem crescente
		double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
		Arrays.sort(doubleArray);
		System.out.printf("%ndoubleArray: ");
		
		for (double value : doubleArray) {
			System.out.printf("%.1f", value);
		}
		
		// Preenche o array com 10 elementos 7
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "filledIntArray");
		
		// copia array intArray em array intArrayCopy
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");
		
		// Verifica a igualdade de intArray e intArrayCopy
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "==" : "!="));
		
		// Verifica a igualdade de intArray e filledIntArray
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("%n%nintArray %s filledIntArray%n", (b ? "==" : "!="));
		
		// Pesquisa o valor 5 em intArray
		int location = Arrays.binarySearch(intArray, 5);
		
		if (location >= 0) {
			System.out.printf("Elemento 5 encontrado em %d no intArray%n", location);
		} else {
			System.out.println("Elemento 5 não foi encontrado no intArray");
		}
		
		// Pesquisa o valor 8763 em intArray
		location = Arrays.binarySearch(intArray, 8763);
		
		if (location >= 0) {
			System.out.printf("Elemento 8763 encontrado em %d no intArray%n", location);
		} else {
			System.out.println("Elemento 8763 não foi encontrado no intArray");
		}

	}
	
	// Gera a saida de valores de cada um dos arrays
	public static void displayArray(int[] array, String description) {
		System.out.printf("%n%s; ", description);
		
		for (int value : array) {
			System.out.printf("%d", value);
		}
	}

}

