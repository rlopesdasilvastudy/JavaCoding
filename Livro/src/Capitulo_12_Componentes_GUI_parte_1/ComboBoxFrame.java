package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {
	
	private final JComboBox<String> imagesJComboBox; // nomes dos ícones
	private final JLabel label;
	
	private static final String[] names =
			{"java01.png", "java02.png", "java03.png", "java04.jpg"};
	private final Icon[] icons = {
			new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])),
			new ImageIcon(getClass().getResource(names[2])),
			new ImageIcon(getClass().getResource(names[3]))};
	
	// Construtor ComboBoxFrame  adiciona JComboBox ao JFrame
	public ComboBoxFrame() {
		super("Testing JComboBox");
		setLayout(new FlowLayout());
		
		imagesJComboBox = new JComboBox<String>(names);
		imagesJComboBox.setMaximumRowCount(3);
		
		/* Classe Interna Anonima uma classe que é declarada sem um nome 
		 * e que normalmente aparece dentro de uma declaração de método. 
		 * Como com outras classes internas, uma classe interna anônima pode 
		 * acessar os membros de sua classe de primeiro nível. 
		 * Mas uma classe interna anônima tem acesso limitado às 
		 * variáveis locais do método em que é declarada. 
		 * Como uma classe interna anônima não tem nomes, deve-se 
		 * criar um objeto da classe interna anônima 
		 * no ponto em que a classe é declarada
		 */
		
		imagesJComboBox.addItemListener(
			new ItemListener() { // classe interna anonima 
								// trata eventos do JCOMBOBOX
								@Override
								public void itemStateChanged(ItemEvent event) {
									// determina se o item está sleecionado
									if (event.getStateChange() == ItemEvent.SELECTED) {
										label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
									} 
								} 
			} // fim da classe interna anonima
		); // fim da chamada para AddItemListener
		
		add(imagesJComboBox); // adiciona combo box ao JFrame
		label = new JLabel(icons[0]); // exibe primeiro ícone
		add(label); // adiciona rótulo ao JFrame
	}
}
