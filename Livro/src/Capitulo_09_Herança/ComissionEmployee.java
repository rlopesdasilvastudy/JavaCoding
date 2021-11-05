package Capitulo_09_Herança;

public class ComissionEmployee extends Object {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; // vendas brutas semanais
	private double comissionRate; // % da comissão
	
	// Construtor de 5 argumentos
	public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double comissionRate) {
		
		// A chamada implicita para o construtor padrão de Object ocorre aqui
		// se grossSales é inválido, lança uma exceção
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		// se comissionRate é inválida, lança uma exceção
		if (comissionRate <= 0.0 || comissionRate >= 1.0) {
			throw new IllegalArgumentException("Comission rate must be > 0.0 and < 1.0");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
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
	
	// Calcula os lucros
	public double earning() {
		return getComissionRate() * getGrossSales();
	}
	
	// retorna a representação String do objeto ComissionEmployee
	@Override // indica que esse método substitui um método da superclasse
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
				"comission employee", getFirstName(), getLastName(),
				"social security number", getSocialSecurityNumber(), 
				"gross sales", getGrossSales(),
				"comission rate", getComissionRate());
	}
	
} // fim da classe ComissionEmployee

