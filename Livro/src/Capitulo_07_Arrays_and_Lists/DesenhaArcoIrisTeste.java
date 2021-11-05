package Capitulo_07_Arrays_and_Lists;

import javax.swing.JFrame;

public class DesenhaArcoIrisTeste {

	public static void main(String[] args) {
		
		DesenhaArcoIris panel =  new DesenhaArcoIris();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);

	}

}

