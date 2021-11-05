package Capitulo_12_Componentes_GUI_parte_1;

import javax.swing.JFrame;

public class CheckBoxFrameTest {

	public static void main(String[] args) {
		
		CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
		checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkBoxFrame.setSize(275, 100);
		checkBoxFrame.setVisible(true);
	}
}
