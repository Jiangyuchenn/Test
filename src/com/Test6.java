package com;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

public class Test6 {

	public static void main(String[] args) {
		JFrame jf = new JFrame("���Դ���");
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        // �����ָ����
        JSplitPane splitPane = new JSplitPane();

        // ��������������ʾ�����
        splitPane.setLeftComponent(new JButton("��߰�ť"));
        splitPane.setRightComponent(new JButton("�ұ߰�ť"));

        // �ָ�������ʾ���� �۵�/չ�� ���������С��ť
        splitPane.setOneTouchExpandable(true);

        // �϶��ָ���ʱ�����ػ����
        splitPane.setContinuousLayout(true);

        // ���÷ָ����ĳ�ʼλ��
        splitPane.setDividerLocation(150);

        // �ѷָ������Ϊ���������ӵ����ڲ���ʾ
        jf.setContentPane(splitPane);
        jf.setVisible(true);
    }



	}

