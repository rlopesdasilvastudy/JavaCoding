package Capitulo_06_Metodos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLineWhileCounterAndForLoop extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		// g.drawLine(0, 0, getWidth(), getHeight());
		// g.drawLine(getWidth(), 0, 0, getHeight());
		
		// Desenhando linhas com o WHILE
		/* 
		int counter = 1;
		while (++counter <= 20) { // utilizando o ++ não precisa setar dentro do WHILE o incremento
			g.drawLine(10, 10, 250, counter * 10);
		}
		*/
		
		// Desenhando linhas com o FOR
		for (int counter = 1; counter <= 10; counter++) {
			g.drawLine(10, 10, 250, counter * 10);
		}
		
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new DrawLineWhileCounterAndForLoop());
				frame.setSize(300, 300);
				frame.setVisible(true);
							
			}
		});
	}
}

