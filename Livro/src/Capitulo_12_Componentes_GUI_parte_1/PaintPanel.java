package Capitulo_12_Componentes_GUI_parte_1;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	
	// lista das referências Point
	private final ArrayList<Point> points = new ArrayList<>();
	
	// configura GUI e registro rotinas de tratamento de evento de mouse
	public PaintPanel()
	{
		// trata evento de movimento de mouse do frame
		addMouseMotionListener(
		new MouseMotionAdapter()
		{
			// Armazena coordenadas da ação de arrastar e repinta
			@Override
			public void mouseDragged(MouseEvent event)
			{
				points.add(event.getPoint());
				repaint();
			}
		}
	);
	}

	// desenha ovais em um quadro delimitador de 4 x 4 nas localizações especificadas na janela
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); // liompa a área do desenho
		// desenha todos os pontos
		for (Point point : points)
			g.fillOval(point.x, point.y, 4, 4);
	}
	
}
	

