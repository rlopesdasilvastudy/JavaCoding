package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame{
	
	private final JPanel mousePanel; // painel no qual os eventos do mouse ocorrem
	private final JLabel statusBar; // exibe informações do evento do mouse
	
	// construtor MouseTrackerFrame configura GUI e
	// registra rotinas de tratamento de evento de mouse
	
	public MouseTrackerFrame()
	{
		super("Demonstrando Eventos do Mouse");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.white);
		add(mousePanel, BorderLayout.CENTER); // adiciona painel ao JFrame
		
		statusBar = new JLabel("Mouse fora do JPanel");
		add(statusBar, BorderLayout.SOUTH); // adiciona rótulo ao JFrame
		
		// cria e registra listener para mouse e eventos de movimento do mouse
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}
	
	private class MouseHandler implements MouseListener, MouseMotionListener
	{
		// rotinas de tratamento de evento MouseListener
		// trata evento quando o mouse é liberado imediatamente depois de ser pressionado
		@Override
		public void mouseClicked(MouseEvent event)
		{
			statusBar.setText(String.format("Clicou em [%d, %d]", event.getX(), event.getY()));
		}
		
		// trata evento quando o mouse é pressionado
		public void mousePressed(MouseEvent event)
		{
			statusBar.setText(String.format("Pressionado em [%d, %d]", event.getX(), event.getY()));
		}
		
		// trata evento quando o mouse é liberado
		@Override
		public void mouseReleased(MouseEvent event) 
		{
			statusBar.setText(String.format("Liberado em [%d, %d]", event.getX(), event.getY()));
		}
		
		// trata evento quando mouse entra na área
		@Override
		public void mouseEntered(MouseEvent event)
		{
			statusBar.setText(String.format("Mouse entrou em [%d, %d]", event.getX(), event.getY()));
			mousePanel.setBackground(Color.green);
		}
		
		// trata evento quando mouse sai da área
		@Override
		public void mouseExited(MouseEvent event)
		{
			statusBar.setText("Mouse fora do JPanel");
			mousePanel.setBackground(Color.white);
		}
		
		// rotinas de tratamento de evento MouseMotionLIstener
		// trata o evento quando o usuário arrasta o mouse com botão pressionado
		@Override
		public void mouseDragged(MouseEvent event)
		{
			statusBar.setText(String.format("Pressionado em [%d, %d]", event.getX(), event.getY()));
		}
		
		// trata evento quando o usuário move o mouse
		@Override
		public void mouseMoved(MouseEvent event)
		{
			statusBar.setText(String.format("Mouse movido em [%d, %d]", event.getX(), event.getY()));
		}
		
	}
	
}
