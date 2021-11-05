package Capitulo_10_Polimorfismo;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	// construtor
	public SalariedEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	}
	// configura o salário
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	}
	// retorna o salário
	public double getWeeklySalary() {
		return weeklySalary;
	}
	// calcula os vencimento; Implementa o método Payable da Interface
	// que era bastrata na superclasse Employee
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}
	
	// retorna a representação String do objeto SalariedEmployee
	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: $%,.2f", 
				super.toString(), "weekly salary", getWeeklySalary());
	}
	
}

