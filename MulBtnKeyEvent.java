import java.awt.*;
import java.awt.event.*;
public class MulBtnKeyEvent extends Frame implements  ActionListener//, KeyListener
{
	Label l;
	TextField t, t1;
	Button b;
	String f, f1;
	int i, j;
	
	MulBtnKeyEvent()
	{
		l = new Label();
		l.setBounds(100,50, 100, 40);
		
		t = new TextField();
		t.setBounds(100, 100, 70, 70);
		//t.addKeyListener(this);
		
		t1 = new TextField();
		t1.setBounds(100, 200, 70, 70);
		//t1.addKeyListener(this);
		
		b = new Button("Multiply");
		b.setBounds(100, 300, 50, 50);
		b.addActionListener(this);
		
		add(l);
		add(t);
		add(t1);
		add(b);
		
		setLayout(null);
		setSize(500,500);
		setTitle("KeyPressedEvent");
		setVisible(true);
		
	}/*
	public void keyPressed(KeyEvent e)
	{
		try{
			f = t1.getText();
            i = Integer.parseInt(f);
			System.out.println(i);
			f1 = t.getText();
            j = Integer.parseInt(f1);	
		}
		catch(Exception ce){}
	}
	public void keyReleased(KeyEvent e)
	{
		//l.setText("Key Released");
	}
	public void keyTyped(KeyEvent e)
	{
		//l.setText("Key Typed");
	}*/
	public void actionPerformed(ActionEvent ae)
	{try{
			f = t1.getText();
            i = Integer.parseInt(f);
			System.out.println(i);
			f1 = t.getText();
            j = Integer.parseInt(f1);	
		}
		catch(Exception ce){}
		l.setText("Answer is " + (i*j));//l.setText("s");
	}
	public static void main(String s[])
	{
		new MulBtnKeyEvent();
	}
}