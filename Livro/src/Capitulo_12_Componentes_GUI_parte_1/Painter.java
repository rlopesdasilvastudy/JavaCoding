package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter {

	public static void main(String[] args) {
		
		// Cria o JFrame
		JFrame application = new JFrame("Um simples programa de pintura");
		
		PaintPanel paintPanel = new PaintPanel();
		application.add(paintPanel, BorderLayout.CENTER);
		
		// cria um rótulo e o coloca em SOUTH do BorderLayout		
		application.add(new JLabel("Clique e arraste o mouse para desenhar"), BorderLayout.SOUTH);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(400, 200);
		application.setVisible(true);
	}

}
