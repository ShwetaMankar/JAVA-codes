import java.awt.*;
import java.applet.*;

/*
<applet code = p3b width=500 height=500>
</applet>
*/

public class p3b extends Applet
{
	public void init()
	{
		setLayout(new GridLayout(5,5,15,15));
		
		add( new Button(" 0 "));
		add( new Button(" 1 "));
		add( new Button(" 2 "));
		add( new Button(" 3 "));
		add( new Button(" 4 "));
		add( new Button(" 5 "));
		add( new Button(" 6 "));
		add( new Button(" 7 "));
		add( new Button(" 8 "));
		add( new Button(" 9 "));
		
	}
}