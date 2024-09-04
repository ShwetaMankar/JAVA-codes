import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class jcombobox extends JFrame implements ItemListener
{
	JComboBox jcb;
	Label l;
	
	jcombobox()
	{
		jcb = new JComboBox();
		jcb.setBounds(200, 10, 100, 30);
		
		jcb.addItem("java");
		jcb.addItem("c");
		jcb.addItem("c++");
		jcb.addItem("html");
		jcb.addItem("python");
		
		jcb.addItemListener(this);
		
		l = new Label("");
		l.setBounds(10, 10, 200, 30);
		
		add(jcb);
		add(l);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		l.setText("selected language is " + jcb.getSelectedItem());
	}
	
	public static void main(String args[])
	{
		new jcombobox();
	}
}