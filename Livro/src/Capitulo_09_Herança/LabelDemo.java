package Capitulo_09_Herança;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo {

	public static void main(String[] args) {
		
		// Cria um rótulo com texto simples
		JLabel northLabel = new JLabel("North");
		// cria um ícone de uma imagem para podermos colocar em um Jlabel
		ImageIcon labelIcon = new ImageIcon(System.getProperty("user.dir") + "\\src\\download.png");
		// cria um rótulo com um Icon em vez de texto
		JLabel centerLabel = new JLabel(labelIcon);
		// cira outro rótulo com um Icon
		JLabel southLabel = new JLabel(labelIcon);
		// configura o rótulo para exibir o texto (bem como um ícone)
		southLabel.setText("South");
		// cria um quadro para armazenas os rótulos
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// adiciona os rótulos ao frame. o segundo argumento especifica
		// onde adicionar o rótulo no frame
		application.add(northLabel, BorderLayout.NORTH);
		application.add(centerLabel, BorderLayout.CENTER);
		application.add(southLabel, BorderLayout.SOUTH);
		
		application.setSize(300, 300);
		application.setVisible(true);

	}

}

