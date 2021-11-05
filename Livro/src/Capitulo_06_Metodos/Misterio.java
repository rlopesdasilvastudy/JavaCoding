package Capitulo_06_Metodos;

public class Misterio {

	public static void main(String[] args) {

		// Mistério 1
		System.out.println("Mistério 1");
		int y, x = 1, total = 0;
		
		while (x <= 10) {
			y = x * x;
			System.out.println(y);
			total += y;
			++x;
		}
		
		System.out.println("Total is " + total);
		
		// Mistério 2
		System.out.println("Mistério 2");
		int count = 1;
		while (count <= 10) {
			System.out.println(count % 2 == 1 ? "*****" : "++++++++++");
			System.out.println(count);
			++count;
		}
		
		// Mistério 3
		System.out.println("Mistério 3");
		int row = 10, column;
		while (row >= 1) {
			column = 1;
			while (column <= 10) {
				System.out.println(row % 2 == 1 ? "<" : ">");
				++column;
			}
			{
				--row;
				System.out.println();
			}
		}

	}

}

