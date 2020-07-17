package com;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Test5 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(100,100,100,200);
		textArea.setLineWrap(true);
		JScrollPane jp = new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
       frame.setContentPane(jp);
       
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
	}

}
