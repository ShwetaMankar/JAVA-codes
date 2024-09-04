import java.awt.*;
import java.awt.event.*;
public class PR13_EX3_MouseMotionAdapter extends Frame
{
	PR13_EX3_MouseMotionAdapter()
	{
		addMouseMotionListener(
		new MouseMotionAdapter()
		{
			public void mouseDragged(MouseEvent me)
			{
				System.out.print("Mouse dragged");
			}
		}
		);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		new PR13_EX3_MouseMotionAdapter();
	}
} 