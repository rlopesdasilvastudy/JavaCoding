package Capitulo_07_Arrays_and_Lists;

public class ArrayViaLinhaDeComando {

	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.out.printf("Erro, por favor execute o comando novamente incluindo%n" + 
						"o tamanho do array, o valor inicial e o incremento.%n");
		} else {
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			
			int initialValue = Integer.parseInt(args[1]);
			int increment =  Integer.parseInt(args[2]);
			
			for (int counter = 0; counter < array.length; counter++) {
				array[counter] = initialValue + increment * counter;
			}
			
			System.out.printf("%s%8s%n", "Indice", "Valor");
			
			for (int counter = 0; counter < array.length; counter++) {
				System.out.printf("%5d%8d%n", counter, array[counter]);
			}
		}
			

	}

}

