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
		setTitle("ͼ�����ϵͳ");
		
		setSize(900,500);
		
		//��ʼ������
		initPanel();
		
		//��ʼ�� �м�����
		initCenterPanel();
		
		SwingUtil.setMainFrame(this);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
		
	    public CenterPanel getCenterPanel1(){
	    	return centerPanel;
	    	
	}
       //�м�����
	    private void initCenterPanel(){
			centerPanel = new CenterPanel();
			JLabel label =new JLabel("��ҳ��");
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
