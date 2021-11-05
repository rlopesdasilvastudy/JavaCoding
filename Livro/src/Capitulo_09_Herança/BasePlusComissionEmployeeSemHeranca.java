package Capitulo_09_Herança;

public class BasePlusComissionEmployeeSemHeranca {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; // vendas brutas semanais
	private double comissionRate; // % da comissão
	private double baseSalary; // salário base por semana
	
	// Construtor de 6 argumentos
	public BasePlusComissionEmployeeSemHeranca(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double comissionRate, double baseSalary) {
		
		// A chamada implicita para o construtor padrão de Object ocorre aqui
		// se grossSales é inválido, lança uma exceção
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		// se comissionRate é inválida, lança uma exceção
		if (comissionRate <= 0.0 || comissionRate >= 1.0) {
			throw new IllegalArgumentException("Comission rate must be > 0.0 and < 1.0");
		}
		
		// se baseSalary é inválido, lança uma exceção
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
		this.baseSalary = baseSalary;
	} // fim do construtor
	
	// retorna o nome
	public String getFirstName() {
		return firstName;
	}
	
	// retorna o sobrenome
	public String getLastName() {
		return lastName;
	}
	
	// retorna o número de seguro social
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	// Configura a quantidade de vendas brutas
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales;
	}
	
	// retorna a quantidade de vendas brutas
	public double getGrossSales() {
		return grossSales;
	}
	
	// Configura a taxa de comissão
	public void setComissionRate(double comissionRate) {
		if (comissionRate <= 0.0 || comissionRate >= 1.0) {
			throw new IllegalArgumentException("Comission rate must be > 0.0 and < 1.0");
		}
		this.comissionRate = comissionRate;
	}
	
	// retorna a taxa de comissão
	public double getComissionRate() {
		return comissionRate;
	}
	
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
	public double earning() {
		return baseSalary + (comissionRate * grossSales);
	}
	
	// retorna a representação String do objeto BasePlusComissionEmployee
	@Override // indica que esse método substitui um método da superclasse
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
				"Base-salaried comission employee", firstName, lastName,
				"social security number", socialSecurityNumber, 
				"gross sales", grossSales, "comission rate", comissionRate,
				"base salary", baseSalary);
	}
	
} // fim da classe ComissionEmployee

