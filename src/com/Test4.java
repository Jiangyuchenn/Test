package com;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("�û���:"));
		panel1.add(new JTextField(10));
		
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("����:"));
		panel2.add(new JTextField(10));
		
		JPanel panel3 = new JPanel();
		panel3.add(new JLabel("��¼"));
		panel3.add(new JLabel("����"));
		
		Box vBox = Box.createVerticalBox();
		vBox.add(panel1);
		vBox.add(panel2);
		vBox.add(panel3);
		
		frame.setContentPane(vBox);
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
