package Capitulo_08_Classes_e_Objetos;

public class Time2Test {

	public static void main(String[] args) {
		
		Time2 t1 = new Time2(); // 00:00:00
		Time2 t2 = new Time2(2); // 02:00:00
		Time2 t3 = new Time2(21, 34); // 21:34:00
		Time2 t4 = new Time2(12, 25, 42); // 12:25:42
		Time2 t5 = new Time2(t4); // 12:25:42
		
		System.out.println("Construído com: ");
		displayTime("t1: parâmetros default", t1);
		displayTime("t2: hora especificada, minutos e segundos default", t2);
		displayTime("t3: hora e minuto especificado, segundos default", t3);
		displayTime("t4: hora, minuto e segundo especificado", t4);
		displayTime("t5: Objeto criado a partir de t4", t5);
		
		// Tenta inicializar t6 com valores inválidos
		try {
			Time2 t6 = new Time2(17, 58, 60);
		} catch (IllegalArgumentException e) {
			System.out.printf("%nExceção ao inicializar t6: %s%n", e.getMessage());
		}
		
	}
	// Exibe um objeto Time2 nos formatos de 24 horas e 12 horas
	private static void displayTime(String header, Time2 t) {
		System.out.printf("%s%n   %s%n   %s%n", 
				header, t.toUniversalString(), t.toString());
	}

}

