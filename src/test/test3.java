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
		
		JButton btn1 = new JButton("测试");
		btn1.addActionListener(new ActionListener(){



			@Override
			public void actionPerformed(ActionEvent e) {
				Object[] sel = new Object[]{"苹果","西瓜","香蕉","芒果"};
				Object input = JOptionPane.showOptionDialog(null, "点击某个请选择一项","选项对话框",
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

