import java.awt.*;

class p3Ex2Frame extends Frame
{
	p3Ex2Frame()
	{
		setLayout(new BorderLayout(0,0));
		
		/*Button b1, b2, b3, b4, b5;
		b1=new Button("North");
		b2=new Button("South");
		b3 = new Button("East");
		b4 = new Button("West");
		b5 = new Button("Center");*/
		
		Button b1 = new Button("North");
		Button b2 = new Button("South");
		Button b3 = new Button("East");
		Button b4 = new Button("West");
		Button b5 = new Button("Center");
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		new p3Ex2Frame();
	}
}