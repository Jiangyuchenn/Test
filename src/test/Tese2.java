package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tese2 {

	protected static final Icon NULL = null;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		
		JButton btn1 = new JButton("����");
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Object[] sel = new Object[]{"ƻ��","����","�㽶","â��"};
				Object input = JOptionPane.showInputDialog(null, "��ѡ��һ��","����",JOptionPane.PLAIN_MESSAGE,NULL,sel,sel[0]);
				
				System.out.println(input);
			}
			
		});
        frame.add(btn1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	}

