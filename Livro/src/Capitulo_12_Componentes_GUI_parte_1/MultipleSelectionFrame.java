package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {

	private final JList<String> colorJList;
	private final JList<String> copyJList;
	private JButton copyJButton;
	private static final String[] colorNames = {"Black", "Blue", "Cyan",
			"DarkGray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
			"Pink", "Red", "White", "Yellow" };
	
	// construtor Multiple Selection Frame
	public MultipleSelectionFrame() 
	{
		super("Multiple Selection Lists");
		setLayout(new FlowLayout());
		
		colorJList = new JList<String>(colorNames);
		colorJList.setVisibleRowCount(5);
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorJList));
		
		copyJButton = new JButton("Copy >>>");
		copyJButton.addActionListener(
				new ActionListener() // classe interna anonima 
				{ 
					// trata evento do botão
					@Override
					public void actionPerformed(ActionEvent event) 
					{
						// coloca valores selecionados na copyJList
						copyJList.setListData(
								colorJList.getSelectedValuesList().toArray(new String[0]));
					}
				}
		);
		
		add(copyJButton);
		
		copyJList = new JList<String>(); // lista para armazenar nomes copiados
		copyJList.setVisibleRowCount(5);
		copyJList.setFixedCellWidth(100);
		copyJList.setFixedCellHeight(15);
		copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyJList));
	}
}
