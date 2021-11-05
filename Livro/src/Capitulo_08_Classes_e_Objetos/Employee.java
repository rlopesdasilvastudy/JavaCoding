package Capitulo_08_Classes_e_Objetos;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	// Construtor para inicializar nome, data de nascimento e data de contratação
	public Employee (String firstName, String lastName, Date birthDate, Date hireDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
	}
	// Converte Employee em formato de String
	public String toString() {
		return String.format("%s,  %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
	}
}

