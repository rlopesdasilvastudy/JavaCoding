package Capitulo_05_Estruturas_de_Controle;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EstruturaSwitchDesenhar extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	// Valor "global" da opção selecionada
	public int choice = 0;
	
	// Método para desenhar no JPanel as figuras conforme o valor informado em choice
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < 10; i++) {
			switch (choice) {
			case 1:
				g.drawLine(10, 10, 250, 10 + i * 10);
				break;
			case 2:
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 3:
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			default:
				g.drawString("Foi informado um valor inválido ", 10, 20 + i * 15);
			}
		}
	}
	
	public static void main(String[] args) {
		
	
		String input;
		input = JOptionPane.showInputDialog(
				"Digite 1 para desenhar linhas\n" +
				"Digite 2 para desenhar retângulos\n" +
				"Digite 3 para desenhar circulos\n");
		int selectedChoice = Integer.parseInt(input);


		// Inicializa a classe setando a opção desejada
		EstruturaSwitchDesenhar desenhar = new EstruturaSwitchDesenhar();
		desenhar.choice = selectedChoice;
		
		// Adiciona a classe JPanel dentro de um JFrame
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(desenhar);
				frame.setSize(400, 400);
				frame.setVisible(true);
			}
		});
	}
}

