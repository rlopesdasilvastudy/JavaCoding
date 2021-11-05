package Capitulo_08_Classes_e_Objetos;

public class Employee2StaticTest {

	public static void main(String[] args) {
		
		// mostra que a contagem é 0 antes de criar Employees
		System.out.printf("Employees before instatiation: %d%n", Employee2Static.getCount());
		
		// cria dois Employess. a contagem deve virar 2 após os objetos serem criados
		Employee2Static e1 = new Employee2Static("Susane", "Baker");
		Employee2Static e2 = new Employee2Static("Athelstan", "Smith");
		
		// mostra que a contagem é 2 depois de criar dois Employees
		System.out.printf("\nEmployess after instantiation:%n");
		System.out.printf("via e1.getCount(): %d%n" , e1.getCount());
		System.out.printf("via e2.getCount(): %d%n" , e2.getCount());
		System.out.printf("via Employee2Static.getCount(): %d%n" , Employee2Static.getCount());
		
		// Obter nomes de Employees
		System.out.printf("%n Employee 1: %s %s%nEmployee 2: %s %s%n", 
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());

	}

}

