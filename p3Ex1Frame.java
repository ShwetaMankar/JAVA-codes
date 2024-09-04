import java.awt.*;

class p3Ex1Frame extends Frame
{
	p3Ex1Frame()
	{
		setLayout(new GridLayout(3,3, 10,10));
		
		add(new Button("Button 1"));
		add(new Button("Button 2"));
		add(new Button("Button 3"));
		add(new Button("Button 4"));
		add(new Button("Button 5"));
		
		setSize(600, 250);
		setVisible(true);
	
	}
		
	public static void main(String s[])
	{
		new p3Ex1Frame();
	}
}