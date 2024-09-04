import java.awt.*;
import javax.swing.*;
class pr8EX extends JFrame
{
	pr8EX()
	{
		String columns[] = {"Name", "Percentage", "Grade"};
		
		String data[][] = {	{"Sanika", "89.78", "A2"},
							{"Ritesh", "56", "C"},
							{"Aniket", "99", "A"},
							{"Neha", "84", "A2"},
							{"gayatri", "84", "A2"},
							{"Anita", "97", "A"},
							{"Sanika", "97.06", "A"},
							{"Kiyara", "56.99", "C"},
							{"Amey", "89.78", "A2"},
							{"Om", "98", "A"}
						};
					
		JTable jt = new JTable(data, columns);
		JScrollPane jp = new JScrollPane(jt);	
		add(jp);
		setLayout(new FlowLayout());
		setSize(700, 700);
		setVisible(true);
	}
	public static void main(String s[])
	{ new pr8EX(); }
}