package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class LabelFrame extends JFrame {
	
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	
	public LabelFrame() {
		super("Testing JLabel");
		setLayout(new FlowLayout()); // selecionar layout do frame
		
		// construtor JLabel como um argumento de String
		label1 = new JLabel("Label with text");
		label1.setToolTipText("This is label 1");
		add(label1);
		
		// Construtor Jlabel com string, Icon e argumentos de alinhamento
		Icon bug = new ImageIcon(getClass().getResource("download.png"));
		label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
		label2.setToolTipText("This is label 2");
		add(label2);
		
		label3 = new JLabel();
		label3.setText("Label with icon and text at botton");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label 3");
		add(label3);
	}
}

