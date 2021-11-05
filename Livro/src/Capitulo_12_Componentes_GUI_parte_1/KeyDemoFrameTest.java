package Capitulo_12_Componentes_GUI_parte_1;

import javax.swing.JFrame;

public class KeyDemoFrameTest {

	public static void main(String[] args) {
		
		KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
		keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		keyDemoFrame.setSize(350, 100);
		keyDemoFrame.setVisible(true);

	}

}
