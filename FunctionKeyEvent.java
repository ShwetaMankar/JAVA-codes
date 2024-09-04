import java.awt.*;
import java.awt.event.*;
public class FunctionKeyEvent extends Frame implements KeyListener
{
	Label l;
	TextArea t;
	
	FunctionKeyEvent()
	{
		l = new Label();
		l.setBounds(100,50, 400, 40);
		
		t = new TextArea();
		t.setBounds(100, 100, 200, 200);
		t.addKeyListener(this);
		add(l);
		add(t);
		
		setLayout(null);
		setSize(500,500);
		setTitle("KeyPressedEvent");
		setVisible(true);
		
	}
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_F1:
				l.setText("You pressed F1");
			break;
			case KeyEvent.VK_F2:
				l.setText("You pressed F2");
			break;
			case KeyEvent.VK_F3:
				l.setText("You pressed F3");
			break;
			case KeyEvent.VK_F4:
				l.setText("You pressed F4");
			break;
			case KeyEvent.VK_F5:
				l.setText("You pressed F5");
			break;
			case KeyEvent.VK_F6:
				l.setText("You pressed F6");
			break;
			case KeyEvent.VK_F7:
				l.setText("You pressed F7");
			break;
			case KeyEvent.VK_F8:
				l.setText("You pressed F8");
			break;
			case KeyEvent.VK_F9:
				l.setText("You pressed F9");
			break;
			case KeyEvent.VK_F10:
				l.setText("You pressed F10");
			break;
			case KeyEvent.VK_F11:
				l.setText("You pressed F11");
			break;
			case KeyEvent.VK_F12:
				l.setText("You pressed F12");
			break;
			
			// for arrow keys
			
			case KeyEvent.VK_UP:
				l.setText("You pressed up arrow key");
			break;
			case KeyEvent.VK_RIGHT:
				l.setText("You pressed right arrow key");
			break;
			case KeyEvent.VK_DOWN:
				l.setText("You pressed down arrow key");
			break;
			case KeyEvent.VK_LEFT:
				l.setText("You pressed left arrow key");
			break;
		}
		
	}
	public void keyReleased(KeyEvent e)
	{
		//l.setText("Key Released");
	}
	public void keyTyped(KeyEvent e)
	{
		//l.setText("Key Typed");
	}
	public static void main(String s[])
	{
		new FunctionKeyEvent();
	}
}