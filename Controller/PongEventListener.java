package Controller;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import View.MenuScreen;
import View.PongMenu;

public class PongEventListener implements ActionListener, MouseListener {
	
	private PongMenu panel;
	private int clicks = 0;
	//private Pong pong;

	public PongEventListener(PongMenu panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();
		if (source == panel.getExitButton()) {
			JFrame window = panel.getWindow();
			window.getContentPane().removeAll();
			var menu = new MenuScreen(window);
			menu.start();
			window.pack();
			window.revalidate();
		}

		// } else if (source == panel.getRedButton()) {
		// 	color = Color.red;
		// } else if (source == panel.getYellowButton()) {
		// 	color = Color.yellow;
		// } else if (source == panel.getBlueButton()) {
		// 	color = Color.blue;
		// }

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// ++clicks;
		// switch(clicks) {
		// 	case 1:
		// 		triangle = new Triangle();
		// 		triangle.setPos(0, e.getX(), e.getY());
		// 		triangle.setColor(color);
		// 		panel.getCanvas().getShapes().add(triangle);
		// 		break;
		// 	case 2:
		// 		triangle.setPos(1, e.getX(), e.getY());
		// 		break;
		// 	case 3:
		// 		triangle.setPos(2, e.getX(), e.getY());
		// 		clicks = 0;
		// 		break;
		// }
		// panel.getCanvas().repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) { }

	@Override
	public void mouseReleased(MouseEvent e) { }

	@Override
	public void mouseEntered(MouseEvent e) { }

	@Override
	public void mouseExited(MouseEvent e) { }
	
}

