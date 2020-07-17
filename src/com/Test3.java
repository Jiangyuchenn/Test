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
		
		JButton button = new JButton("测试");
		button.setBounds(100,100,100,30);
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				JOptionPane.showConfirmDialog(null, "请选择一项","选择框",JOptionPane.YES_OPTION);
				JDialog d = new JDialog();
				d.setSize(200, 200);
				d.add(new JButton("按钮"));
				d.setVisible(true);
				//JOptionPane.showMessageDialog(null,"Error", "错误提示框", JOptionPane.YES_OPTION);
			}
		});
		frame.add(button);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
	
	
	
	
	
	
	
	
	}