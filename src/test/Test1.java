package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		
		JButton btn1 = new JButton("����");
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog(null,"�������������:","Ĭ������");
				System.out.println(input);
				
			}
			
		});
        frame.add(btn1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
