package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame {
	
	private final JTextField textField;
	private final Font plainFont;
	private final Font boldFont;
	private final Font italicFont;
	private final Font boldItalicFont;
	private final JRadioButton plainJRadioButton;
	private final JRadioButton boldJRadioButton;
	private final JRadioButton italicJRadioButton;
	private final JRadioButton boldItalicJRadioButton;
	private final ButtonGroup radioGroup;
	
	public RadioButtonFrame() {
		super("RabioButton Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Veja o estilo da fonte mudar", 25);
		add(textField);
		
		// cria botões de opção
		plainJRadioButton = new JRadioButton("Plain", true);
		boldJRadioButton = new JRadioButton("Bold", false);
		italicJRadioButton = new JRadioButton("Italic", false);
		boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
		add(plainJRadioButton);
		add(boldJRadioButton);
		add(italicJRadioButton);
		add(boldItalicJRadioButton);
		
		// cria relacionamento lógico entre JRadioButtons
		radioGroup = new ButtonGroup();
		radioGroup.add(plainJRadioButton);
		radioGroup.add(boldJRadioButton);
		radioGroup.add(italicJRadioButton);
		radioGroup.add(boldItalicJRadioButton);
		
		// cria fontes
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont);
		
		// registra eventos para JRadioButtons
		plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
		boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
		italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
		boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
	}
		// classe interna private para tratar eventos de botão de opção
	private class RadioButtonHandler implements ItemListener {
		
		private Font font; // fonte associada ao listener
		
		public RadioButtonHandler(Font f) {
			font = f;
		}
		
		@Override
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(font);
		}

	}
}
