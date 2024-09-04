import java.awt.*;
import javax.swing.*;
class pr8b extends JFrame
{
	pr8b()
	{
		String head[] = {"ID", "NAME", "SALARY"};
		
		String info[][] = {{"101", "Amit", "670000"},
						   {"102", "Jai", "780000"},
						   {"101", "Sachin", "700000"}
						  };
						  
		JTable t = new JTable(info, head);
		JScrollPane p = new JScrollPane(t);
		add(p);
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	
	}
	
	public static void main(String s[])
	{
		new pr8b();
	}
}