package test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class Test7 {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("测试窗口");
		jframe.setSize(300,300);
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//创建 内容面板 使用边界布局
		JPanel panel = new JPanel(new BorderLayout());
		
		Object [] colsName = {"姓名","性别","年龄","地址"};
		Object[][] rowData = {
				{"TOM","男","10","长春"},
				{"JACK","男","10","长春"},
				{"MARRY","女","10","长春"},
				{"CINDY","女","10","长春"},
				{"LISA","女","10","长春"},
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
