package Capitulo_11_Tratamento_de_Exceções;

public class UsingExceptions {

	public static void main(String[] args) {

		try {
			throwException();
		}
		catch (Exception exception) { // exceção lançada por throwException
			System.err.println("Exception handled in main");
		}
		
		doesNotThrowException();
	}
	
	// demonstra try... catch... finally
	public static void throwException() throws Exception {
		try { // lança uma exceção e imediatamente a captura
			System.out.println("Method throwException");
			throw new Exception();
		} catch (Exception exception) { // captura exceção lançada em try
			System.err.println("Exception handled in method throwException");
			throw exception; // lança novamente para processamento adicional
			// o código aqui não seria alcançado; poderia causar erros de compilação
		} finally  { //executa independentemente do que ocorre em try.. catch
			System.err.println("Finally executed in throwException");
		}
		// o código aqui não seria alcançado; poderia causar erro de compilação
	}
	
	// demonstra finally quando nenhuma exceção ocorrer
	public static void doesNotThrowException() {
		try { // bloco try não lança uma exceção
			System.out.println("Method doesNotThrowException");
		} catch (Exception exception) { // não executa
			System.err.println(exception);
		} finally { // executa independentemente do que ocorre em try...catch
			System.err.println("Finally executed in doesNotThowException");
		}
		System.out.println("End of method doesNotThrowException");
	}

}

