package Controller;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import View.GameScreen;
import View.MenuScreen;
import View.PongCanvas;
import Model.Rectangle;

public class PongEventListener implements ActionListener, MouseListener {
	
	private GameScreen panel;
	Rectangle rect1;

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
			PongCanvas.ballColor = Color.red;
			
		} else if (source == panel.getBlackButton()) {
			PongCanvas.ballColor = Color.black;
		} else if (source == panel.getOrangeButton()) {
			PongCanvas.ballColor = Color.orange;
		} else if (source == panel.getWhiteButton()) {
			PongCanvas.backgroundColor = Color.white;
		} else if (source == panel.getBlackButton2()) {
			PongCanvas.backgroundColor = Color.black;
		} else if (source == panel.getPlayButton()) {
			panel.getCanvas().repaint();
		}

		panel.getCanvas().repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int a = e.getY(); 
		rect1.setY(a);
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) { }

	@Override
	public void mouseEntered(MouseEvent e) { }

	@Override
	public void mouseExited(MouseEvent e) { }

}