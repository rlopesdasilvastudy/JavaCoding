package Capitulo_10_Polimorfismo;

public class HourlyEmployee extends Employee {
	
	private double wage; // salário por hora
	private double hours; // horas trabalhadas durante a semana
	
	// construtor
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		// valida remuneração
		if (wage < 0.0) {
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
		// valida horas
		if ((hours < 0.0) || (hours > 168.0)) {
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}
		this.wage = wage;
		this.hours = hours;
	}
	//configura a remuneração
	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
		this.wage = wage;
	}
	// retorna a remuneração
	public double getWage() {
		return wage;
	}
	
	// configura as horas trabalhadas
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) {
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}
		this.hours = hours;
	}
	// retorna as horas trabalhadas
	public double getHours() {
		return hours;
	}
	
	// calcula os rendimentos; sobrescreve o método earnings em Employee
	@Override
	public double earnings() {
		if (getHours() <= 40) { // nenhuma hora extra
			return getWage() * getHours();
		} else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	// retorna a representação de String do objeto Hourly Employee
	@Override
	public String toString() {
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", 
				super.toString(), "hourly wage", getWage(), 
				"hours worked", getHours());
	}
	
}

