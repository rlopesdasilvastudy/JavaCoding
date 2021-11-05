package Capitulo_08_Classes_e_Objetos;

public class Date {
	
	private int month;
	private int day;
	private int year;
	
	private static int[] daysPerMonth = 
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	// Construtor: confirma o valor adequado para o mês e dia dado o ano
	public Date(int month, int day, int year) {
		
		// Verifica se Mês está no intervalo correto
		if (month <= 0 || month > 12) {
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		}
		
		// Verifica se dia está no intervalo correto
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		}
		
		// Verificar no ano bissexto se o mês é 2 e o dia é 29
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		}
		
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf("Date object constructor for date %s%n", this);
		
	}
	
	// Retorna String no formato mês/dia/ano
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
	
}

