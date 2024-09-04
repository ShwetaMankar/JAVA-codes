import java.awt.*;
import java.applet.*;

/*<applet code = p3Ex1 width ="600", height = "250">
</applet>
*/

public class p3Ex1 extends Applet
{
	public void init()
	{
		setLayout(new GridLayout(3,3, 10,10));
		
		add(new Button("Button 1"));
		add(new Button("Button 2"));
		add(new Button("Button 3"));
		add(new Button("Button 4"));
		add(new Button("Button 5"));
	}
}