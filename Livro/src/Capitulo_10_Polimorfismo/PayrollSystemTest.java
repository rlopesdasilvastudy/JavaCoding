package Capitulo_10_Polimorfismo;

public class PayrollSystemTest {

	public static void main(String[] args) {
		
		// cria objetos de subclasse
		SalariedEmployee salariedEmployee = 
				new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		HourlyEmployee hourlyEmployee = 
				new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		ComissionEmployee comissionEmployee =
				new ComissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
		BasePlusComissionEmployee basePlusComissionEmployee =
				new BasePlusComissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
		
		System.out.println("Employees processed individually:");
		
		System.out.printf("%n%s%n%s: $%,.2f%n%n",
				salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				comissionEmployee, "earned", comissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				basePlusComissionEmployee,
				"earned", basePlusComissionEmployee.earnings());
		
		// cria um array Employee de quatro elementos
		Employee[] employees = new Employee[4];
		// inicializa o array com Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = comissionEmployee;
		employees[3] = basePlusComissionEmployee;
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		// processa genericamente cada elemento no array employees
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee); // invoca String
			
			// determina se elemento é um BasePlusComissionEmployee
			if (currentEmployee instanceof BasePlusComissionEmployee) {
				// downcast da referência Employee para referência a BasePlusCo0missionEmployee
				BasePlusComissionEmployee employee = 
						(BasePlusComissionEmployee) currentEmployee;
				employee.setBaseSalary(employee.getBaseSalary() * 1.10);
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n" ,
						employee.getBaseSalary());
			} // termina o IF

			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		} // termina o FOR
		
		// obtém o nome do tipo de cada objeto no array employees
		for (int j = 0; j < employees.length; j++) {
			System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
		}

	}

}

