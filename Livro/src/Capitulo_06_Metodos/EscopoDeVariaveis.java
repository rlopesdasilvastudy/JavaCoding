package Capitulo_06_Metodos;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class EscopoDeVariaveis extends JFrame {

	int x = 1;
	JTextArea outputArea;
	
	public EscopoDeVariaveis() {
		
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(outputArea);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		start();
		
		
	}
	
	public void start() {
		int x = 5;
		
		outputArea.append("Local x no método start é " + x);
		useLocal();
		useInstance();
		useLocal();
		useInstance();
		
		outputArea.append("\n\nLocal x após useLocal é " + x);
				
	}
	
	public void useLocal() {
		int x = 25;
		
		outputArea.append("\n\nLocal x em useLocal é " + x + " ao iniciar método useLocal");
		++x;
		outputArea.append("\nLocal x em useLocal é " + x + " antes de sair do método useLocal");
	}
	
	public void useInstance() {
		outputArea.append("\n\nVariável de Instãncia x é " + x + " ao inciar método useInstace");
		x *= 10;
		outputArea.append("\n\nVariavel de Instância x é " + x + " antes de sair do método useInstace");
	
	}
	
	
	public static void main(String[] args) {
		
		new EscopoDeVariaveis();

	}

}

