package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {
	
	private String line1 = ""; // primeira linha da área de texto
	private String line2 = ""; // segunda linha da área de texto
	private String line3 = ""; // terceira linha da área de texto
	private final JTextArea textArea; // area de texto para exibir a saída
	
	// construtor KeyDemoFrame
	public KeyDemoFrame()
	{
		super("Demonstrando eventos do teclado");
		textArea = new JTextArea(10,15);// configura JTextArea
		textArea.setText("Pressione qualquer tecla do teclado");
		textArea.setEnabled(false);
		textArea.setDisabledTextColor(Color.BLACK);
		add(textArea); // adiciona área de texto a JFrame
		
		addKeyListener(this);// permite que o frame processe os eventos do teclado
	}
	
	// trata o pressionamento de qualquer tecla
	@Override
	public void keyPressed(KeyEvent event)
	{
		line1 = String.format("A tecla pressionada foi: %s", 
				KeyEvent.getKeyText(event.getKeyCode())); // mostra a tecla pressionada
		setLines2and3(event); // configura a saída das linhas dois e três
	}
	
	// trata liberação de qualquer tecla
	@Override
	public void keyReleased(KeyEvent event)
	{
		line1 = String.format("A tecla solta foi: %s", 
				KeyEvent.getKeyText(event.getKeyCode())); // mostra a tecla liberada
		setLines2and3(event); // configura a saída das linhas dois e três
	}
	
	// trata pressionamento de uma tecla de ação
	@Override
	public void keyTyped(KeyEvent event)
	{
		line1 = String.format("A tecla de ação pressionada foi: %s", event.getKeyChar());
		setLines2and3(event); // configura a saída das linhas dois e três
	}
	
	// configura segunda e terceira linhas de saída
	private void setLines2and3(KeyEvent event)
	{
		line2 = String.format("Esta tecla %s é uma tecla de ação",
				(event.isActionKey() ? "" : "não "));
		String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
		
		// tecla modificadora: shift, ALT, CTRL
		line3 = String.format("Tecla modificadora utilizada é: %s", 
				(temp.equals("") ? "nenhuma" : temp)); // modificadores de saída
		
		textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3)); // gera saída de três linhas de texto
	}
}
