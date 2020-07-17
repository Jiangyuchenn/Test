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
		
		JButton btn1 = new JButton("测试");
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Object[] sel = new Object[]{"苹果","西瓜","香蕉","芒果"};
				Object input = JOptionPane.showInputDialog(null, "请选择一项","标题",JOptionPane.PLAIN_MESSAGE,NULL,sel,sel[0]);
				
				System.out.println(input);
			}
			
		});
        frame.add(btn1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	}

