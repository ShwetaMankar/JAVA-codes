import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
class pr7b extends JFrame
{
	pr7b()
	{
		DefaultMutableTreeNode India = new DefaultMutableTreeNode("India");
		
		DefaultMutableTreeNode Maharashtra = new DefaultMutableTreeNode("Maharashtra");
		DefaultMutableTreeNode Gujrath = new DefaultMutableTreeNode("Gujrath");
		
		DefaultMutableTreeNode Mumbai = new DefaultMutableTreeNode("Mumbai");
		DefaultMutableTreeNode Pune = new DefaultMutableTreeNode("Pune");
		DefaultMutableTreeNode Nashik = new DefaultMutableTreeNode("Nashik");
		DefaultMutableTreeNode Nagpur = new DefaultMutableTreeNode("Nagpur");		
		
		Maharashtra.add(Mumbai);
		Maharashtra.add(Pune);
		Maharashtra.add(Nashik);
		Maharashtra.add(Nagpur);	
		
		India.add(Maharashtra);
		India.add(Gujrath);		
		
		JTree jt = new JTree(India);
		add(jt);		
		
		setLayout(new FlowLayout());
		//pack();
		setSize(500,500);
		setVisible(true);
	}	
	public static void main(String s[])
	{
		new pr7b();
	}
}