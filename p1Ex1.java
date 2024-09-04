import java.awt.*;

class p1Ex1 extends Frame
{
	p1Ex1()
	{
		Label l = new Label("Welcome to Java ");
		l.setBounds(50,50,300,50);
		add(l);
		
		setLayout(null);
		setSize(700,700);
		setVisible(true);
		
	}
	
	public static void main(String agrs[])
	{
		new p1Ex1();
	}
}