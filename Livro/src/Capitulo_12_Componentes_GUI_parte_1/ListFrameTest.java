package Capitulo_12_Componentes_GUI_parte_1;

import javax.swing.JFrame;

public class ListFrameTest {
	
	public static void main(String[] args) {
		ListFrame listFrame = new ListFrame();
		listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		listFrame.setSize(350, 150);
		listFrame.setVisible(true);
	}
	
}
