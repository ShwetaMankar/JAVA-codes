import java.awt.*;
import javax.swing.*;
class p6Ex2 extends JFrame 
{
	JScrollPane sp;
	
	p6Ex2()
	{
		JTextArea ta = new JTextArea(20,20);
		
		sp = new JScrollPane(ta);
	    sp.setBounds(100,100,200,200);
		add(sp);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new p6Ex2();
	}
}