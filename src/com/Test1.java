package com;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class Test1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.addWindowListener(new WindowListener() {						
			public void windowOpened(WindowEvent arg0) {
				System.out.println("�������");
			}						
			public void windowIconified(WindowEvent arg0) {
				System.out.println("������С����");
			}						
			public void windowDeiconified(WindowEvent arg0) {
				System.out.println("������С������ԭ��");
			}						
			public void windowDeactivated(WindowEvent arg0) {
				System.out.println("����ʧȥ������");
			}						
			public void windowClosing(WindowEvent arg0) {
				System.out.println("����ر�");
				//frame.dispose();  //��windowClosing������ִ��dispose������windowClosed����ִ��,���ʹ����frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)����windowClosed������ִ��
			}						
			public void windowClosed(WindowEvent arg0) {
				System.out.println("�����Ѿ��ر���");
			}						
			public void windowActivated(WindowEvent arg0) {
				System.out.println("�����ý���");
			}
		});										
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		

	}

