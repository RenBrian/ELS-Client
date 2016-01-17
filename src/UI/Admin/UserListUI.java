package UI.Admin;

import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BL.UserBL;
import BLService.UserBLService;
import PO.UserPO;
import java.awt.Color;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class UserListUI extends JScrollPane{
	public UserListUI(){
		setBounds(0, 0, 545, 458);
		this.getViewport().setBackground(Color.WHITE);;
		
		UserBLService bl=new UserBL();
		ArrayList<UserPO> list=bl.getList();
		String[][] a=new String[list.size()][3];
		int index=0;
		for(UserPO user:list){
			a[index][0]=user.getID();
			a[index][1]=user.getPassword();
			a[index][2]=user.getRole();
			index++;
		}
		JTable table = new JTable();
		table.getTableHeader().setBackground(SystemColor.inactiveCaptionBorder);
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			a,
			new String[] {
				"\u8D26\u53F7", "\u5BC6\u7801", "\u804C\u4F4D"
			}
		));
		table.getTableHeader().setReorderingAllowed(false);
		this.setViewportView(table);		
	}

}
