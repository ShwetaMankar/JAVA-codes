import java.awt.*;
import java.applet.*;
/*
<applet code = p3Ex2 width=500 height=500>
</applet>
*/
public class p3Ex2 extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout(0,0));
		
		Button b1, b2, b3, b4, b5;
		b1=new Button("North");
		b2=new Button("South");
		b3 = new Button("East");
		b4 = new Button("West");
		b5 = new Button("Center");
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
	}
}