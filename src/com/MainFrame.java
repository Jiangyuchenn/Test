package com;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import util.SwingUtil;

public class MainFrame extends JFrame{

	public static void main(String[] args){
		new MainFrame();
	}
	private LeftPanel leftPanel = null;
	private CenterPanel centerPanel = null;
	
	public MainFrame(){
		setTitle("图书借阅系统");
		
		setSize(900,500);
		
		//初始化容器
		initPanel();
		
		//初始化 中间容器
		initCenterPanel();
		
		SwingUtil.setMainFrame(this);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
		
	    public CenterPanel getCenterPanel1(){
	    	return centerPanel;
	    	
	}
       //中间容器
	    private void initCenterPanel(){
			centerPanel = new CenterPanel();
			JLabel label =new JLabel("主页面");
			centerPanel.add(label);
			this.add(centerPanel,BorderLayout.CENTER);
	    }
	    
	private void initPanel() {
		
		leftPanel = new LeftPanel();
		leftPanel.setPreferredSize(new Dimension(120,575));
		this.add(leftPanel,BorderLayout.WEST);
	}

	public CenterPanel getCenterPanel() {
		
		return null;
	}
}
