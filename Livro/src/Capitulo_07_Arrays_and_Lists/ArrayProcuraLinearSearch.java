package Capitulo_07_Arrays_and_Lists;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ArrayProcuraLinearSearch extends JFrame implements ActionListener {

	// elementos da tela declarados de forma Global para serem alterados por qualquer método
	JLabel enterLabel, resultLabel;
	JTextField enterField, resultField;
	int array[];
	
	public ArrayProcuraLinearSearch() {
		
		// Configurar elementos da tela
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		enterLabel = new JLabel("Informe o inteiro a ser procurado");
		container.add(enterLabel);
		enterField = new JTextField(10);
		container.add(enterField);
		enterField.addActionListener(this);
		
		resultLabel = new JLabel("Resultado");
		container.add(resultLabel);
		resultField =  new JTextField(20);
		resultField.setEditable(false);
		container.add(resultField);
		
		// Criar um array de 100 posições com inteiros pares de 0 a 198
		array = new int[100];
		
		for (int counter = 0; counter < array.length; counter++) {
			array[counter]= 2 * counter;
		}
		
		// Mais parâmetros da tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public int linearSearch(int array[], int key) {
		
		// Laço para percorrer os elementos do Array
		for (int counter = 0; counter < array.length; counter++) {
			// se o valor do elemento for igual ao valor a ser pesquisado, devolve a posição dele
			if (array[counter] == key)
				return counter;
		}
		// senão retorna -1 = valor não encontrado no array
		return -1;
	}
	
	@Override
	public void actionPerformed (ActionEvent actionEvent) {
		// Dados de entrada podem ser obtidos com enterField.getText()
		String searchKey = actionEvent.getActionCommand();
		
		/* Array é passado para o método linearSearch mesmo que ele seja uma variável de  
		 * instância. Normalmente um array é passado a um método para fins de pesquisa
		 */
		int element = linearSearch(array, Integer.parseInt(searchKey));
		
		// Exibe o resultado da pesquisa
		if (element != -1) {
			resultField.setText("Valor encontrado no elemento " + element);
		} else {
			resultField.setText("Valor não encontrado");
		}
	}
	
	
	public static void main(String[] args) {
		
		// Executa o programa principal
		new ArrayProcuraLinearSearch();

	}

}

