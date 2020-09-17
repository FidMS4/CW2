package Controller;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import Model.Pong;
import View.GameScreen;
import View.MenuScreen;
import View.PongCanvas;

public class PongEventListener implements ActionListener, MouseListener {
	
	private GameScreen panel;
	private Pong pong;
	public static Color ballColor;
	public static Color backgroundColor;

	public PongEventListener(GameScreen panel) {
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

		} else if (source == panel.getRedButton()) {
			ballColor = Color.red;
		} else if (source == panel.getBlackButton()) {
			ballColor = Color.black;
		} else if (source == panel.getOrangeButton()) {
			ballColor = Color.orange;
		} else if (source == panel.getWhiteButton()) {
			backgroundColor = Color.white;
		} else if (source == panel.getBlackButton2()) {
			backgroundColor = Color.black;
		} else if (source == panel.getPlayButton()) {
			JFrame window = panel.getWindow();
			window.getContentPane().removeAll();
			var gameplay = new GameScreen(window);
			gameplay.start();
			window.pack();
			window.revalidate();
		
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
	
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

