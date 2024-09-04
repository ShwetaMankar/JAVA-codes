import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PR13_EX1_UseOfWindowAdapter extends WindowAdapter
{
	JFrame f;
	JLabel l;
	PR13_EX1_UseOfWindowAdapter()
	{
		f = new  JFrame();
		f.addWindowListener(this);
		f.setLayout(new FlowLayout());
		f.setSize(700,700);
		f.setTitle("Use of Wondowdapter Class");
		f.setVisible(true);
	}
	public void windowOpened(WindowEvent we)
	{
		l = new JLabel("Window Opened");
		f.remove(l);
		f.add(l);
	}
	public void windowActivated(WindowEvent we)
	{
		l = new JLabel("Window Activated");
		f.remove(l);
		f.add(l);
	}
	public void windowDectivated(WindowEvent we)
	{
		l = new JLabel("\nWindow Deactivated");
		f.remove(l);
		f.add(l);
	}
	public void windoeGainedFocus(WindowEvent we)
	{
		l = new JLabel("Window Gaine Focus");
		f.remove(l);
		f.add(l);
	}
	public void windowLostFocus(WindowEvent we)
	{
		l = new JLabel("\nWindow Lost focus");
		f.remove(l);
		f.add(l);
	}
	public static void main(String s[])
	{
		new PR13_EX1_UseOfWindowAdapter();
	}
}
