import java.awt.*;
import javax.swing.*;

class p6Ex1 extends JFrame 
{	
	p6Ex1()
	{
		JComboBox states = new JComboBox();
		states.setBounds(200, 10, 100, 30);
		
		states.addItem("Maharashtra");
		states.addItem("Delhi");
		states.addItem("Kerala");
		states.addItem("Karnataka");
		states.addItem("Goa");
		
		add(states);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new p6Ex1();
	}
}