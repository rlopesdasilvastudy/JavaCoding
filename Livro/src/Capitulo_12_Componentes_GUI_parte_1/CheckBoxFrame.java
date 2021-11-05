package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {
	
	private final JTextField textField;
	private final JCheckBox boldJCheckBox; // marcar/desmarcar negrito
	private final JCheckBox italicJCheckBox; // marcar/desmarcar italico
	
	public CheckBoxFrame() {
		super("JCheckBox Test");
		setLayout(new FlowLayout());
		
		// configura JTextField e sua fonte
		textField = new JTextField("Veja o estilo da fonte mudar", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		
		boldJCheckBox = new JCheckBox("Bold");
		italicJCheckBox = new JCheckBox("Italic");
		add(boldJCheckBox);
		add(italicJCheckBox);
		
		// listeners registradores para JCheckBoxes
		CheckBoxHandler handler = new CheckBoxHandler();
		boldJCheckBox.addItemListener(handler);
		italicJCheckBox.addItemListener(handler);
	}
		// classe interna private para tratamento de evento ItemListener
	private class CheckBoxHandler implements ItemListener {
		
		// responde aos eventos na caixa de seleção
		public void itemStateChanged(ItemEvent event) {
			
			Font font = null; // armazena uma nova Fonte

			// determina quais CheckBoxes estão marcadas e cria a Fonte
			if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) {
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			} else if (boldJCheckBox.isSelected()) {
				font = new Font("Serif", Font.BOLD, 14);
			} else if (italicJCheckBox.isSelected()) {
				font = new Font("Serif", Font.ITALIC, 14);
			} else {
				font = new Font("Serif", Font.PLAIN, 14);
			}
			textField.setFont(font);
		}

	}
}
