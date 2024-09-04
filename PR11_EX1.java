import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code = "PR11_EX1" width = 400 height = 400> </applet>*/
public class PR11_EX1 extends Applet implements MouseMotionListener
{
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		setBackground(Color.pink);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		setBackground(Color.gray);
		repaint();
	}
}