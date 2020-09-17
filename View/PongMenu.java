package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import Controller.PongEventListener;

public class PongMenu {
	
	// public enum GameState {
	// 	READY, PLAYING, GAMEOVER
	// }

	private JFrame window;
	private JButton playButton = new JButton("Play!");
	//private GameState gameState = GameState.READY;
	private JRadioButton redButton = new JRadioButton("Red");
	private JRadioButton blackButton = new JRadioButton("Black");
	private JRadioButton orangeButton = new JRadioButton("Orange");
	private JRadioButton whiteButton = new JRadioButton("Black");
	private JRadioButton blackButton2 = new JRadioButton("White");
	private JButton exitButton = new JButton("Exit");

	public PongMenu(JFrame window) {
		this.window = window;
	}

	public void start() {
		Container cp = window.getContentPane();

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 150));
		cp.add(BorderLayout.NORTH, panel);

		panel.setLayout(new GridLayout(2, 1));
		JPanel radioPanel = new JPanel();
		radioPanel.add(redButton);
		radioPanel.add(blackButton);
		radioPanel.add(orangeButton);
		panel.add(radioPanel);

		ButtonGroup colorGroup = new ButtonGroup();
		colorGroup.add(redButton);
		colorGroup.add(blackButton);
		colorGroup.add(orangeButton);

		TitledBorder title = BorderFactory.createTitledBorder("Choose ball color");
		radioPanel.setBorder(title);


		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(300, 150));
		cp.add(BorderLayout.CENTER, centerPanel);

		centerPanel.setLayout(new GridLayout(2, 1));
		JPanel radioPanel2 = new JPanel();
		radioPanel2.add(whiteButton);
		radioPanel2.add(blackButton2);
		centerPanel.add(radioPanel2);

		ButtonGroup colors2 = new ButtonGroup();
		colors2.add(whiteButton);
		colors2.add(blackButton2);

		TitledBorder title2 = BorderFactory.createTitledBorder("Choose background color");
		radioPanel2.setBorder(title2);


		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);
		southPanel.setLayout(new GridLayout(2, 1));

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(playButton);
		buttonPanel.add(exitButton);
		southPanel.add(buttonPanel);


		PongEventListener listener = new PongEventListener(this);
		exitButton.addActionListener(listener);
		redButton.addActionListener(listener);
		blackButton.addActionListener(listener);
		orangeButton.addActionListener(listener);
		whiteButton.addActionListener(listener);
		blackButton2.addActionListener(listener);
	}

	public JButton getExitButton() {
		return exitButton;
	}

	public JRadioButton getRedButton() {
		return redButton;
	}

	public JRadioButton getBlackButton() {
		return blackButton;
	}

	public JRadioButton getOrangeButton() {
		return orangeButton;
	}

	public JRadioButton getWhiteButton() {
		return whiteButton;
	}

	public JRadioButton getBlackButton2() {
		return blackButton2;
	}

	public JFrame getWindow() {
		return window;
	}

	// public TriangleCanvas getCanvas() {
	// 	return canvas;
	// }
}
