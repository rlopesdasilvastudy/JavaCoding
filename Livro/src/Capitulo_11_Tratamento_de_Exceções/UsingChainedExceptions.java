package Capitulo_11_Tratamento_de_Exceções;

public class UsingChainedExceptions {

	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception exception) {// exceções lançadas de method1 
			exception.printStackTrace();
		}
	}
	
	// chama method2; lança exceção de volta para main
	public static void method1() throws Exception {
		try {
			method2();
		} catch (Exception exception) { // exceção lançada de method2
			throw new Exception("Exception thrown in method1", exception);
		}
	}

	// chama method3; lança exceção de volta para method1
	public static void method2() throws Exception {
		try {
			method3();
		} catch (Exception exception) { // exceção lançada de method3
			throw new Exception("Exception thrown in method 2", exception);
		}
	}
	// lança Exception de volta para method2
	public static void method3() throws Exception {
		throw new Exception("Exception thrown in method3");
	}
	
}

