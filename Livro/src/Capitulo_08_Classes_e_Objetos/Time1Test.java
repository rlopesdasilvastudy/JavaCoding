package Capitulo_08_Classes_e_Objetos;

public class Time1Test {

	public static void main(String[] args) {

		// cria e inicializa um objeto Time1
		Time1 time = new Time1(); // invoca o construtor de Time1
		
		// gera saída de representações de string de data/hora
		displayTime("After time object is created", time);
		System.out.println();
		
		time.setTime(3, 5, 6);
		displayTime("After calling setTime", time);
		System.out.println();
		
		// tenta definir data/hora com valores inválidos
		try {
			time.setTime(99, 99, 99); // valores fora do intervalo esperado
		} catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		// exibe data e hora após uma tentativa de definir valores inválidos
		displayTime("After calling setTime with invalid values", time);
		
	}
	
	// Exibe um objeto Time1 nos formatos de 24 e 12 horas
	private static void displayTime(String header, Time1 t) {
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", 
				header, t.toUniversalString(), t.toString());
	}

}

