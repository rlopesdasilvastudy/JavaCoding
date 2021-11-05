package Capitulo_07_Arrays_and_Lists;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ArrayProcuraBinarySearch extends JFrame implements ActionListener {

	JLabel enterLabel, resultLabel;
	JTextField enterField, resultField;
	JTextArea output;
	int array[];
	String display = "";
	
	
	public ArrayProcuraBinarySearch() {
		
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
		
		output = new JTextArea(6, 60);
		output.setFont(new Font("Monospaced", Font.PLAIN, 12));
		container.add(output);
		
		array = new int[15];
		
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 * counter;
		}
		
		// Mais parâmetros da tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	// Obtém os dados de entrada do usuário e chama o método binarySearch
	public void actionPerformed(ActionEvent actionEvent) {
		String searchKey = actionEvent.getActionCommand();
		// Inicializa o string display para nova pesquisa
		display = "Porções do array procurado\n";
		// realiza a pesquisa binária
		int element = binarySearch(array, Integer.parseInt(searchKey));
		
		output.setText(display);
		// exibe o resultado da pesquisa
		if (element != -1) {
			resultField.setText("Valor encontrado no elemento " + element);
		} else {
			resultField.setText("Valor não encontrado");
		}
	}
	
	// Método que executa a pesquisa binária
	public int binarySearch (int array2[], int key) {
		int low = 0; // posição baixa no array
		int high = array2.length; // posição alta no array
		int middle; // posição intermediária no array
		
		// repete até que a posição low seja maior do que a posição high
		while (low <= high) {
			// determina a posição do elemento do meio
			middle = (low + high) / 2;
			// exibe o subconjunto do array que está sendo utilizado
			// durante a iteração do laço de pesquisa binária
			buildOutput(array2, low, middle, high);
			
			// se a chave for igual ao elemento do meio, devolve a posição do elemento do meio
			if (key == array[middle]) {
				return middle;
			// se a chave é menor que o elemento do meio, ajuda o high - posição mais alta	
			} else if (key < array2[middle]) {
				high = middle - 1;
			// chave maior do que o elemento do meio ajusta o low - posição mais baixa	
			} else {
				low = middle + 1;
			}
		}
		return -1; // caso a chave não seja encontrada, retorna -1
	}
	
	// Constrói uma linha de saída mostrando o subconjunto do array
	// que está sendo processado atualmente
	void buildOutput (int array3[], int low, int mid, int high) {
		
		// cria um formato para números inteiros de 2 dígitos
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		// percorre os elementos do array
		for (int counter = 0; counter < array3.length; counter++) {
			// se counter está fora do subconjunto atual do array
			// acrescenta espaços de preenchimento ao String display
			if (counter < low || counter > high ) {
				display += "   ";
			// se elemento do meio, acrescenta o elemento ao String display
			// seguido por um * para indicar o elemento do meio marcado
			} else if (counter == mid) {
				display += twoDigits.format(array3[counter]) + "* ";
			// acrescenta elemento ao String display	
			} else {
				display += twoDigits.format(array3[counter]) + "  ";
			}
		}
		display += "\n";
	}
	
	public static void main(String[] args) {
		
		// executa método principal JFRAME com Listener
		new ArrayProcuraBinarySearch();

	}

}

