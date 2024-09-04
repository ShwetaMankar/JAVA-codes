import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class p6 extends JFrame implements ItemListener
{
	JComboBox cb;
	Label l;
	
	p6()
	{
		cb = new JComboBox();
		
		cb.addItem("Solapur");
		cb.addItem("Pune");
		cb.addItem("Banglor");
		cb.addItem("Mumbai");
		
		l = new Label("                                  ");
		
		cb.addItemListener(this);
		
		add(cb);
		add(l);
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		l.setText("You are in " +cb.getSelectedItem());	
	}
	
	public static void main(String args[])
	{
		new p6();
	}
}