import java.awt.*;
import java.awt.event.*;
class MouseMtionListener extends Frame implements MouseMotionListener
{
	MouseMtionListener()
	{
		addMouseMotionListener(this);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	public void mouseDragged(MouseEvent e)
	{
		Graphics g = getGraphics();
		g.setColor(Color.red);
		g.fillOval(e.getX(), e.getY(), 10,20);
	}
	public void mouseMoved(MouseEvent e)
	{
		/*setBackground(Color.gray);
		repaint();*/
	}
	public static void main(String s[])
	{
		new MouseMtionListener();
	}
}