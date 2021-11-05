package Capitulo_08_Classes_e_Objetos;

public class Time2 {
	
	private int hour;
	private int minute;
	private int second;
	
	// Construtor sem argumento Time2
	// inicializa cada variável de instância como zero
	public Time2() {
		this(0, 0, 0); // invoca o construtor com três argumentos
	}
	
	// Construtor Time2: hora fornecida, minuto e segundo padronizados para 0
	public Time2(int hour) {
		this(hour, 0, 0); // invoca o construtor com três argumentos
	}
	
	// Construtor Time2: hora e minutos fornecidos, segundo padronizado para 0
	public Time2(int hour, int minute) {
		this(hour, minute, 0); // invoca o construtor com três argumentos
	}
	
	// Construtor Time2: hora, minuto e segundos fornecidos
	public Time2(int hour, int minute, int second) {
		
		if (hour < 0 | hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if (minute < 0 | minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		if (second < 0 | second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	// Construtor Time2: outro objeto Time2 fornecido
	public Time2(Time2 time) {
		// invoca o construtor com 3 argumentos
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	// Métodos SET
	// Configura um novo valor de tempo usando hora universal
	// Valida os dados fornecidos
	public void setTime(int hour, int minute, int second) {
		
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Valida e configura Hora
	public void setHour(int Hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		this.hour = hour;
	}
	
	// valida e configura minutos
	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		this.minute = minute;
	}
	
	// valida e configura segundos
	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		this.second = second;
	}
	
	// Métodos GET
	// obtém valor de hora
	public int getHour() {
		return hour;
	}
	// obtém valor de minutos
	public int getMinute() {
		return minute;
	}
	// obtém valor de segundos
	public int getSecond() {
		return second;
	}
	
	// Converte em String no formato de data/hora universal HH:MM:SS
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	// Converte em String no formato padrão de data/hora H:MM:SS AM ou PM
	public String toString() {
		return String.format("%d:%02d:%02d %s",
				((getHour() == 00 || getHour() == 12) ? 12 : getHour() % 12) ,
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}

