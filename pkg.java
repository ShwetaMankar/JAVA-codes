package labelcolor;
import java.awt.*;
import java.swing.*;

public class pkg extends JFrame
{
	Container c; //container of this frame
	label_class l; //label that should apper
	public pkg()
	{
		c = getContentPane();
		c.setLayout(new FloeLayout());
		l = new label_class(Color.orange);
		c.add(l);
		
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String s[])
	{
		new pkg();	
	}
}