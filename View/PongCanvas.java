package View;

import java.awt.*;
import javax.swing.*;

public class PongCanvas extends JPanel {

	private GameScreen panel;
	private Color color = Color.gray;
	private Color ballColor;
	private Color backgroundColor;

	public PongCanvas(GameScreen panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.white);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.drawOval(0, 0, 15, 15);
	//	g2d.setColor(PongEventListener.get);

		g2d.draw(new Rectangle(30, 50, 42, 100));
        g2d.setColor(Color.gray);
		g2d.fillRect(30, 50, 15, 75);
	}
		


}
