package Capitulo_10_Polimorfismo;

public abstract class Employee implements Payable {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	// construtor
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// retorna o nome
	public String getFirstName() {
		return firstName;
	}
	// retorna o sobrenome
	public String getLastName() {
		return lastName;
	}
	// retorna o número de Seguro Social
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%nsocial security number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber());
			
	}
}

