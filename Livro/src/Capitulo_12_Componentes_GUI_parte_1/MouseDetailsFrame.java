package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class MouseDetailsFrame extends JFrame {
	
	private String details; // String exibida na parte inferior da janela
	private final JLabel statusBar; // jlabel na parte inferior da janela
	
	public MouseDetailsFrame()
	{
		super("CLiques do mouse e botões");
		
		statusBar = new JLabel("Clique o mouse");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new MouseClickHanlder()); // adiciona tratamento de evento
	}
	
	// classe interna para tratar eventos do mouse
	private class MouseClickHanlder extends MouseAdapter
	{
		// trata evento de clique do mouse e determina qual botão foi pressionado
		@Override
		public void mouseClicked(MouseEvent event) 
		{
			int xPos = event.getX();
			int yPos = event.getY();
			details = String.format("Clicou %d veze(s) ", event.getClickCount());
			
			if (event.isMetaDown()) // botão direito do mouse
				details += " com botão direito do mouse";
			else if (event.isAltDown()) // botão do meio do mouse
				details += " com botão central do mouse";
			else // botão esquerdo do mouse
				details += "com botão esquerdo do mouse";
			
			statusBar.setText(details); // exibe mensagem em statusBar
		}
	}
}
