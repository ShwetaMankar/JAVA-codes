import java.awt.*;
import javax.swing.*;
class jscrollpane extends JFrame
{
	jscrollpane()
	{
		TextArea t = new TextArea(50, 50);
		
		JScrollPane jsp = new JScrollPane(l);
		jsp.setBounds(10,10,100,50);
		add(jsp);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new jscrollpane();
	}
}