package Capitulo_08_Classes_e_Objetos;

public class Time1 {
	
	private int hour; // 00 - 23 
	private int minute;  // 0 - 59
	private int second; // 0 - 59
	
	// Configura um novo valor de tempo usando hora universal
	// lança uma exceção se a hora, minuto ou segundo forem inválidos
	public void setTime(int hour, int minute, int second) {
		// Validar hora, minuto e segundo
		if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
			throw new IllegalArgumentException 
			("hour, minute and/or second was out of range");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Converte em String no formato de data/hora universal (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	// Converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
	public String toString() { 
		return String.format("%d:%02d:%02d %s", 
				((hour == 0 || hour == 12) ? 12 : hour % 12),
				minute, second, (hour < 12 ? "AM" : "PM"));
	}
}

