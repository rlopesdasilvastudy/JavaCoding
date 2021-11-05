package Capitulo_12_Componentes_GUI_parte_1;

import javax.swing.JFrame;

public class ButtonFrameTest {

	public static void main(String[] args) {
		
		ButtonFrame buttonFrame = new ButtonFrame();
		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonFrame.setSize(700, 400);
		buttonFrame.setVisible(true);
	}
}
