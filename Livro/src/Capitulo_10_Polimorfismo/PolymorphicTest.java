package Capitulo_10_Polimorfismo;

public class PolymorphicTest {

	public static void main(String[] args) {
		
		//  atribui uma referência de superclasse a variável de superclasse
		ComissionEmployee comissionEmployee = new ComissionEmployee(
				"Sue", "Jones", "222-22-2222", 10000, .06);
		
		// atribui uma referência de subclasse a variável de subclasse
		BasePlusComissionEmployee basePlusComissionEmployee = new BasePlusComissionEmployee(
				"Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		
		// invoca toString no objeto de supeclasse utilizando a variável de superclasse
		System.out.printf("%s %s:%n%n%s%n%n",
				"Call ComissionEmployee's toString with superclass reference", 
				"to superclass object", comissionEmployee.toString());
		
		// invoca toString no objeto de subclasse utilizando a variável de subclasse
		System.out.printf("%s %s:%n%n%s%n%n",
				"Call BasePlusComissionEmployee's toString with subclass",
				"reference to subclass object", basePlusComissionEmployee.toString());
		
		// invoca toString no objeto de subclasse utlizando a variável de SUPERclasse
		ComissionEmployee comissionEmployee2 = basePlusComissionEmployee;
		System.out.printf("%s %s:%n%n%s%n",
				"Call BasePlusComissionEmployee's toString with SUPERclass", 
				"reference to subclass object", comissionEmployee2.toString());

	}

}

