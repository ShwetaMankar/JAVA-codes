import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class pr7a extends JFrame
{
	pr7a()
	{
		
		DefaultMutableTreeNode desktop = new DefaultMutableTreeNode("Desktop");
		
		DefaultMutableTreeNode java = new DefaultMutableTreeNode("Java");
		
		DefaultMutableTreeNode manual = new DefaultMutableTreeNode("Manual");
		DefaultMutableTreeNode book = new DefaultMutableTreeNode("Book");
		DefaultMutableTreeNode code = new DefaultMutableTreeNode("Code");
		DefaultMutableTreeNode notes = new DefaultMutableTreeNode("Notes");
		
		DefaultMutableTreeNode chapter1 = new DefaultMutableTreeNode("Chapter 1");
		DefaultMutableTreeNode chapter2 = new DefaultMutableTreeNode("Chapter 2");
		DefaultMutableTreeNode chapter3 = new DefaultMutableTreeNode("Chapter 3");
		DefaultMutableTreeNode chapter4 = new DefaultMutableTreeNode("Chapter 4");
		DefaultMutableTreeNode chapter5 = new DefaultMutableTreeNode("Chapter 5");
		DefaultMutableTreeNode chapter6 = new DefaultMutableTreeNode("Chapter 6");
		
		notes.add(chapter1);
		notes.add(chapter2);
		notes.add(chapter3);
		notes.add(chapter4);
		notes.add(chapter5);
		notes.add(chapter6);
		
		
		java.add(manual);
		java.add(book);
		java.add(code);
		java.add(notes);
		
		desktop.add(java);
		
		JTree jt = new JTree(desktop);
		add(jt);
		
		setLayout(new FlowLayout());
		//pack();
		setSize(500,500);
		setVisible(true);
		setTitle("Use of JTree");
	}
	
	public static void main(String s[])
	{
		new pr7a();
	}
}