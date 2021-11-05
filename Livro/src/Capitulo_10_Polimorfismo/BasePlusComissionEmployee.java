package Capitulo_10_Polimorfismo;


public class BasePlusComissionEmployee extends ComissionEmployee{
	
	private double baseSalary; // salário base por semana
	
	// Construtor 
	public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double comissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);

		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	} // fim do construtor
	
	// configura o salário base
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}
	
	// retorna o salário base
	public double getBaseSalary() {
		return baseSalary;
	}
	
	// Calcula os vencimentos; sobrescreve o método earnings em ComissionEmployee
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	// retorna a representação String do objeto BasePlusComissionEmployee
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", 
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}
	
} 
