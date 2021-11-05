package Capitulo_06_Metodos;

public class IncrementoDecrementoUnario {

	public static void main(String[] args) {

		int c, d;
		
		c = 5;
		System.out.println("Variável: " + c);  // Imprime 5
		System.out.println("Variável++: " + c++); // Imprime 5 pós-incrementa
		System.out.println("Variável: " + c); // imprime 6
		
		System.out.println();
		
		c= 5;
		System.out.println("Variável: " + c); // imprime 5
		System.out.println("++Variável: " + ++c); // pré-incrementa e imprime 6 
		System.out.println("Variável: " + c); // imprime 6
		
		System.out.println();
		
		d = 5;
		System.out.println("Variável: " + d);  // Imprime 5
		System.out.println("Variável++: " + d--); // Imprime 5 pós-decrementa
		System.out.println("Variável: " + d); // imprime 4
		
		System.out.println();
		
		d= 5;
		System.out.println("Variável: " + d); // imprime 5
		System.out.println("++Variável: " + --d); // pré-decrementa e imprime 4 
		System.out.println("Variável: " + d); // imprime 4
		
		}

}

