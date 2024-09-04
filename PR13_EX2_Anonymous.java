import java.awt.*;
import java.awt.event.*;
public class PR13_EX2_Anonymous extends Frame
{
	PR13_EX2_Anonymous()
	{
		addWindowListener( 
		new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
				System.out.print("Window Closed");
			}
		}
		);
		setLayout(null);
		setSize(700,700);
		setVisible(true);
	}

	public static void main(String s[])
	{
		new PR13_EX2_Anonymous();
	}
}