package test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class Test7 {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("���Դ���");
		jframe.setSize(300,300);
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//���� ������� ʹ�ñ߽粼��
		JPanel panel = new JPanel(new BorderLayout());
		
		Object [] colsName = {"����","�Ա�","����","��ַ"};
		Object[][] rowData = {
				{"TOM","��","10","����"},
				{"JACK","��","10","����"},
				{"MARRY","Ů","10","����"},
				{"CINDY","Ů","10","����"},
				{"LISA","Ů","10","����"},
		};
		JTable table = new JTable(rowData,colsName);
		
		panel.add(table,BorderLayout.CENTER);
		panel.add(table,getTableHeader());
		
		jframe.setContentPane(panel);
        jframe.setVisible(true);
	}

	private static Object getTableHeader() {
		// TODO Auto-generated method stub
		return null;
	}

}
