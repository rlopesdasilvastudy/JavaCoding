package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class ButtonFrame extends JFrame{
	
	private final JButton plainJButton;
	private final JButton fancyJButton;
	
	// ButtonFrame adiciona JButtons ao JFrame
	public ButtonFrame() {
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		plainJButton = new JButton("Plain Button"); // botão com texto
		add(plainJButton);
		
		Icon bug1 = new ImageIcon(getClass().getResource("exclamacao.png"));
		Icon bug2 = new ImageIcon(getClass().getResource("visto.png"));
		fancyJButton = new JButton("Fancy Button", bug1);
		fancyJButton.setRolloverIcon(bug2);
		add(fancyJButton);
		
		// cria novo ButtonHanlder de tratamento para tratar eventos de botão
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
		
	}
	
	private class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format
					("You pressed: %s", event.getActionCommand()));
		}
	}
	
}

