import java.awt.*; 
import java.awt.event.*;
public class PR11_EX2_MouseMtionListener extends Frame implements MouseListener 
{ 
	Label l; 
	PR11_EX2_MouseMtionListener() 
	{
		addMouseListener(this);
		setLayout(null);
		setVisible(true);
		setSize(500,500);
		l=new Label("Hello Mouse");
		l.setBounds(50,150,300,100);
		add(l);
	}
	public void mousePressed(MouseEvent e)
	{
		//l.setText("Mouse Pressed no. of clicks:" + e.getClickCount() + "atposition" + e.getX() + ","+ e.getY());
	}
	public void mouseReleased(MouseEvent e)
	{
		//l.setText("Mouse Released; # of clicks:"+e.getClickCount());
	}
	public void mouseEntered(MouseEvent e)
	{
		//l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		//l.setText("Mouse exited");
	}
	public void mouseClicked(MouseEvent e)
	{
		l.setText("mouse clicked no of clicks:"+e.getClickCount());
	}
	public static void main(String s[])
	{
		new PR11_EX2_MouseMtionListener();
	}
}
