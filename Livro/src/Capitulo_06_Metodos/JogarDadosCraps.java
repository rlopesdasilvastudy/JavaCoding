package Capitulo_06_Metodos;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JogarDadosCraps extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	// variáveis constantes para controlar o Status do Jogo
	final int WON = 0, LOST = 1, CONTINUE = 2;
	
	// Variáveis gerais do jogo de Dados
	boolean primeiraJogada = true; // verdadeiro se for primeira jogada
	int somaDosDados = 0; // soma dos dados jogados
	int meusPontos = 0; // pontuação caso jogo não seja terminado em uma jogada
	int estadoDoJogo = CONTINUE; // jogo ainda não acabou
	
	// Componentes da interface gráfica com o usuário

	JLabel dado1Label, dado2Label, somaLabel, pontosLabel;
	JTextField dado1Field, dado2Field, somaField, pontosField;
	JButton jogarButton;
	
	// Configurar os componentes da tela

 	public JogarDadosCraps() {

		// Obtém painel de conteúdo e muda o lay-out para o Flow Layout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		// cria campo de rótulo e texto para o dado 1
		dado1Label = new JLabel("Dado 1");
		container.add(dado1Label);
		dado1Field = new JTextField (10);
		dado1Field.setEditable(false);
		container.add(dado1Field);
		
		// cria campo de rótulo e texto para o dado 2
		dado2Label = new JLabel("Dado 2");
		container.add(dado2Label);
		dado2Field = new JTextField (10);
		dado2Field.setEditable(false);
		container.add(dado2Field);
		
		// cria campo de rótulo e texto para a Soma
		somaLabel = new JLabel("Soma");
		container.add(somaLabel);
		somaField = new JTextField (10);
		somaField.setEditable(false);
		somaField.setFont(somaField.getFont().deriveFont(Font.BOLD, 14f));
		somaField.setForeground(Color.BLUE);
		container.add(somaField);
		
		// cria campo e rótulo de texto para a pontuação
		pontosLabel = new JLabel("Pontos");
		container.add(pontosLabel);
		pontosField = new JTextField (10);
		pontosField.setEditable(false);
		pontosField.setFont(pontosField.getFont().deriveFont(Font.BOLD, 14f));
		pontosField.setForeground(Color.BLUE);
		container.add(pontosField);
		
		// cria botão para o usuário clicar e lançar os dados
		jogarButton = new JButton("Jogue os dados!");
		jogarButton.addActionListener(this);
		container.add(jogarButton);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed (ActionEvent actionEvent) {
		
		// primeio lançamento de dados
		if (primeiraJogada) {
			somaDosDados = jogarDados();
			
			switch (somaDosDados) {
			// jogo ganho na primeira rodada
			case 7: case 11:
				estadoDoJogo = WON;
				pontosField.setText(""); // limpa o campo da pontuação
				break;
			// jogo perdido na primeira rodada	
			case 2: case 3: case 12:
				estadoDoJogo = LOST;
				pontosField.setText(""); // limpa o campo da pontuação
				break;
			// guarda a pontuação e joga novamente	
			default:
				estadoDoJogo = CONTINUE;
				meusPontos = somaDosDados;
				pontosField.setText(Integer.toString(meusPontos)); // limpa o campo da pontuação
				primeiraJogada = false;
				break;				
			} // fim estrutura SWITCH
		} // fim do IF
		else {
			somaDosDados = jogarDados(); // joga os Dados
			
			// determina o estado do JOGO
			if (somaDosDados == meusPontos) 
				estadoDoJogo = WON;
			 else  
				if (somaDosDados == 7) 
				estadoDoJogo = LOST;
		}
		
		// Exibe mensagem indicando o estado do Jogo
		exibirMensagem();
	} // fim do método ActionPerformed
	
	public int jogarDados() {
		
		int dado1, dado2, soma;
		
		// escolher valores aleatórios para os dados
		dado1 = 1 + (int) (Math.random() * 6);
		dado2 = 1 + (int) (Math.random() * 6);
		
		soma = dado1 + dado2;
		
		// Exibir resultados
		dado1Field.setText(Integer.toString(dado1));
		dado2Field.setText(Integer.toString(dado2));
		
		somaField.setText(Integer.toString(soma));
		
		return soma;
	} // fim do método jogarDados()
	
	public void exibirMensagem() {
		
		// Jogo deve continuar
		if (estadoDoJogo == CONTINUE) {
			JOptionPane.showMessageDialog (null, ("Continue a jogar"), "Continue a Jogar", 
					   JOptionPane.INFORMATION_MESSAGE);
		} else {
			if (estadoDoJogo == WON) 
				JOptionPane.showMessageDialog (null, "Você venceu! ", "Você Venceu!", 
						   JOptionPane.INFORMATION_MESSAGE);
			 else 
				JOptionPane.showMessageDialog (null, "Ahhhhh, Você perdeu!", "Você perdeu!", 
						   JOptionPane.INFORMATION_MESSAGE);
			
			primeiraJogada = true;
		} 
	} // Fim do método exibirMensagem

	public static void main(String[] args) {
		
		new JogarDadosCraps();

	}

}

