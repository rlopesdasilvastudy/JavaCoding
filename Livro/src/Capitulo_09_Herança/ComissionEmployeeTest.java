package Capitulo_09_Herança;

public class ComissionEmployeeTest {

	public static void main(String[] args) {
		
		// Instancia o objeto Comission Employee
		ComissionEmployee employee = new ComissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
		// obtém os dados de empregado comissionado
		System.out.println("Employee information obtained by get methods:");
		System.out.printf("%n%s %s%n", "First Name is", employee.getFirstName());
		System.out.printf("%s %s%n", "Last Name is", employee.getLastName());
		System.out.printf("%s %s%n", "Social Security Number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross Sales is", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Comission Rate is", employee.getComissionRate());
		
		employee.setGrossSales(5000);
		employee.setComissionRate(.15);
		
		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);

	}

}

