import java.awt.*;
import javax.swing.*;
class pr8a extends JFrame
{
	pr8a()
	{
		String columns[] = {"RollNo", "Name", "Marks"};
		
		String data[][] = {	{"19101", "Akshata", "89"},
							{"19102", "Sayali", "93"},
							{"19103", "Bhagyashree", "91"}
						};
		JTable jt = new JTable(data, columns);
		JScrollPane jp = new JScrollPane(jt);	// without JScroolPane header not displayed ; only needed space acquired by table
		//jp.setBounds(10, 10, 250, 250);
		add(jp);
		//add(jt);
		setLayout(new FlowLayout());
		setSize(700, 700);
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		new pr8a();
	}
}