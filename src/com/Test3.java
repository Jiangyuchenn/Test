package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		
		frame.setLayout(null);
		
		JButton button = new JButton("����");
		button.setBounds(100,100,100,30);
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				JOptionPane.showConfirmDialog(null, "��ѡ��һ��","ѡ���",JOptionPane.YES_OPTION);
				JDialog d = new JDialog();
				d.setSize(200, 200);
				d.add(new JButton("��ť"));
				d.setVisible(true);
				//JOptionPane.showMessageDialog(null,"Error", "������ʾ��", JOptionPane.YES_OPTION);
			}
		});
		frame.add(button);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
	
	
	
	
	
	
	
	
	}