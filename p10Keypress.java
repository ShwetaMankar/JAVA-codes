import java.awt.*;
import java.awt.event.*;
public class p10Keypress extends Frame implements KeyListener
{
	Label l;
	TextArea t;
	
	p10Keypress()
	{
		l = new Label();
		l.setBounds(100,50, 100, 40);
		
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
		l.setText("Key Pressed");
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
		new p10Keypress();
	}
}