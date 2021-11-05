package Capitulo_10_Polimorfismo;

public class ComissionEmployee extends Employee {
	
	private double grossSales; // vendas brutas semanais
	private double comissionRate; // % da comissão
	
	// Construtor 
	public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double comissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		if (comissionRate <= 0.0 || comissionRate >= 1.0) {
			throw new IllegalArgumentException("Comission rate must be > 0.0 and < 1.0");
		}
		
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	} // fim do construtor
	
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
	
	// Calcula os rendimentos; sobrescreve o método earnings em Employee
	public double earnings() {
		return getComissionRate() * getGrossSales();
	}
	
	// retorna a representação String do objeto ComissionEmployee
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", 
				"comission employee", super.toString(),
				"gross sales", getGrossSales(),
				"comission rate", getComissionRate());
	}
	
} // fim da classe ComissionEmployee