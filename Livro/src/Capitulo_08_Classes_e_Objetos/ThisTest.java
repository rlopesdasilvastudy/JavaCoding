package Capitulo_08_Classes_e_Objetos;

public class ThisTest {

	public static void main(String[] args) {
		
		SimpleTime time = new SimpleTime(15, 30, 19);
		System.out.println(time.buildString());
	}
}
	
	// Classe SimpleTime demonstra a referência "this"
	class SimpleTime {
		
		private int hour;
		private int minute;
		private int second;
		
		/* Se o construtor utilizar nomes de parâmetro idênticos a nomes de variáveis
		 * de instância, a referência this será exigida para distinguir entre os nomes
		 */
		public SimpleTime(int hour, int minute, int second) {
			this.hour =  hour; // configura a hora do objeto this
			this.minute =  minute; // configura o minuto do objeto this
			this.second =  second; // configura o segundo do objeto this
		}
		
		// utilizam this explicito e implicito para chamar toUniversalString
		
		public String buildString() {
			return String.format("%24s: %s%n%24s: %s", 
					"this.toUniversalString()", this.toUniversalString(),
					"toUniversalString()", toUniversalString());
		}
		
		// converte em String no formato de data/hora universal HH:MM:SS
		public String toUniversalString() {
			/* this não é requerido aqui para acessar variáveis de instância
			 * porque o método não tem variáveis locais com os mesmos
			 * nomes das variáveis de instância
			 */
			return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
		}
		
		
}



