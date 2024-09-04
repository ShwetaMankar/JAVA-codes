import java.awt.*;
import java.applet.Applet;
/*
<applet code = p2ListApplet width="500", height= "500">
</applet>
*/
public class p2ListApplet extends Applet
{
	public void init()
	{
		List l = new List(3, true);
		l.setBounds(100, 100, 250, 200);
 
		l.add("Summer");
		l.add("Winter");
		l.add("Rainy");

		add(l);

		setLayout(null);
		setSize(500,500);
	}

}