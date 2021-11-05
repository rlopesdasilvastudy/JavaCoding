package Capitulo_12_Componentes_GUI_parte_1;

import javax.swing.JFrame;

public class MultipleSelectionFrameTest {
	
	public static void main (String[] args) {
		MultipleSelectionFrame multipleSelectionFrame = new MultipleSelectionFrame();
		multipleSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		multipleSelectionFrame.setSize(350, 150);
		multipleSelectionFrame.setVisible(true);
	}
	
}
