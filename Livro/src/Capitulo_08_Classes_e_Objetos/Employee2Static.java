package Capitulo_08_Classes_e_Objetos;

public class Employee2Static {
	
	private static int count = 0;
	private String firstName;
	private String lastName;
	
	// Inicializa Employee, adiciona 1 a static count
	// e gera saída de String indicando que o construtor foi chamado
	
	public Employee2Static(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		++count; // Incrementa contagem estática de empregados
		System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public static int getCount() {
		return count;
	}
	
}

