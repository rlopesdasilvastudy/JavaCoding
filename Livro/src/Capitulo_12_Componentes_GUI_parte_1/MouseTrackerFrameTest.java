package Capitulo_12_Componentes_GUI_parte_1;

import javax.swing.JFrame;

public class MouseTrackerFrameTest {

	public static void main(String[] args) {
		
		MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
		mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseTrackerFrame.setSize(300, 100);
		mouseTrackerFrame.setVisible(true);

	}

}
