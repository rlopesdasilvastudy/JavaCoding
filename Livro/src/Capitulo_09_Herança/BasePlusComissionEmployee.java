package Capitulo_09_Herança;

public class BasePlusComissionEmployee extends ComissionEmployee{
	
	private double baseSalary; // salário base por semana
	
	// Construtor de 6 argumentos
	public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double comissionRate, double baseSalary) {
		
		// chamada explicita para o construtor ComissionEmployee da superclasse
		// deve ser a primeira coisa a se declarar no construtor da subclasse
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
		
		// se baseSalary é inválido, lança uma exceção
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	} // fim do construtor
	
	// configura o salário base
	public void setBaseSalary(double BaseSalary) {
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}
	
	// retorna o salário base
	public double getBaseSalary() {
		return baseSalary;
	}
	
	// Calcula os lucros
	@Override
	public double earning() {
		// não permitido: comissionRate e grossSales privado em superclasse
		return getBaseSalary() + super.earning();
	}
	
	// retorna a representação String do objeto BasePlusComissionEmployee
	@Override // indica que esse método substitui um método da superclasse
	public String toString() {
		return String.format("%s %s%n%s: %.2f", "base-salaried", 
				super.toString(), "base salary", getBaseSalary());
	}
	
} // fim da classe ComissionEmployee

