package Capitulo_12_Componentes_GUI_parte_1;

import javax.swing.JFrame;

public class MouseDetailsFrameTest {
	
	public static void main(String[] args) {
		MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
		mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseDetailsFrame.setSize(400, 150);
		mouseDetailsFrame.setVisible(true);
	}
	
}
