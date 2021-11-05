package Capitulo_05_Estruturas_de_Controle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.EventQueue;

public class DoWhileDesenharCirculo extends JPanel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		int counter = 1;
		
		do {
			g.drawOval(110 - counter * 10, 110 - counter * 10, counter * 20, counter * 20);
			++counter;
		} while (counter <= 10);
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new DoWhileDesenharCirculo());
				frame.setSize(300, 300);
				frame.setVisible(true);
			}
		});
	}
}

