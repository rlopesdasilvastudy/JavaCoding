package Capitulo_08_Classes_e_Objetos;

public class PackageDataTest {

	public static void main(String[] args) {
		
		PackageData packageData = new PackageData();
		
		// gera saída da representação String de packageData
		System.out.printf("After instantiacion:%n%s%n", packageData);
		// muda os dados de acesso de pacote no objeto packageData
		packageData.number = 77;
		packageData.string = "Goodbye";
		// gera saída da representação String de packageData
		System.out.printf("After changing values:%n%s%n", packageData);

	}
}
	
	class PackageData {
		int number; // Variável de instância de acesso de pacote
		String string; // Variável de instância de acesso de pacote
		
		//Construtor
		public PackageData() {
			number = 0;
			string = "Hello";
		}
		
		// retorna a representação String do objeto PackageData
		
		public String toString() {
			return String.format("number: %d; string: %s", number, string);
		}
	}


