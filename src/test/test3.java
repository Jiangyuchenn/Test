package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class test3 {

	protected static int inputSelected;

	public static void main(String[] args) {
		

		JFrame frame = new JFrame();
		frame.setSize(500,500);
		
		JButton btn1 = new JButton("����");
		btn1.addActionListener(new ActionListener(){



			@Override
			public void actionPerformed(ActionEvent e) {
				Object[] sel = new Object[]{"ƻ��","����","�㽶","â��"};
				Object input = JOptionPane.showOptionDialog(null, "���ĳ����ѡ��һ��","ѡ��Ի���",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.ERROR_MESSAGE,null,sel,sel[0]);
				
				
				if(inputSelected>=0){
					System.out.println(sel[inputSelected]);

				}
				
			}
			
		});
        frame.add(btn1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	}

