package com;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import util.SwingUtil;

public class LeftPanel extends JPanel {
    protected static final Object BorderLayout = null;
	protected static final int CENTER = 0;
	private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    
    
    public LeftPanel() {
    	 initComponents();
    	setVisible(true);
    }


	private void initComponents() {
		this.setLayout(null);
		btn1 = new JButton("菜单一");
		btn1.setBounds(10,0,80,150);
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame main = SwingUtil.getMainFrame();
				CenterPanel jpCenter = main.getCenterPanel();
				jpCenter.removeAll();
				jpCenter.setLayout(new BorderLayout());
				jpCenter.add(new JLabel("菜单一"),BorderLayout,CENTER);
				
				jpCenter.revalidate();
				jpCenter.repaint();
				
			}
		});
		
		
		btn2 = new JButton("菜单二");
		btn2.setBounds(10,150,80,150);
		btn2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame main = SwingUtil.getMainFrame();
				CenterPanel jpCenter = main.getCenterPanel();
				jpCenter.removeAll();
				jpCenter.setLayout(new BorderLayout());
				jpCenter.add(new JLabel("菜单二"),BorderLayout,CENTER);
				
				jpCenter.revalidate();
				jpCenter.repaint();
				
			}
		});
		
		btn3 = new JButton("菜单三");
		btn3.setBounds(10,300,80,150);
		btn3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame main = SwingUtil.getMainFrame();
				CenterPanel jpCenter = main.getCenterPanel();
				jpCenter.removeAll();
				jpCenter.setLayout(new BorderLayout());
				jpCenter.add(new JLabel("菜单三"),BorderLayout,CENTER);
				
				jpCenter.revalidate();
				jpCenter.repaint();
				
			}
		});
		add(btn1);
		add(btn2);
		add(btn3);
		
	}
}
