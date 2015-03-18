package com.praveen.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This class used to create simple window using swing.
 * 
 * @author PRAVEEN
 *
 */
public class FirstSwingDemo {

	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame firstWindow = new JFrame();
		firstWindow.setSize(WIDTH, HEIGHT);
		firstWindow.setLayout(new FlowLayout());

		firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		JButton endButton = new JButton("Click to end buttom");
		endButton.setSize(50, 50);
		EndingListener buttonEar = new EndingListener();
		endButton.addActionListener(buttonEar);
		firstWindow.add(endButton);

		firstWindow.setVisible(true);
	}

}
