import java.awt.*;
import java.applet.*;

/*<applet code = p2Ex1 width = "500", height= 500>
</applet>
*/
public class p2Ex1 extends Applet
{
	public void init()
	{
		List list = new List(10, true);
		list.setBounds(100, 100, 250, 200);
		
		list.add("Sangli");
		list.add("Mumbai");
		list.add("Pune");
		list.add("Nashik");
		list.add("Nagpur");
		list.add("Karad");
		list.add("Kolhapur");
		list.add("Dhule");
		list.add("Ratnagiri");
		list.add("Mahabaleshwar");
		
		add(list);
		
		setLayout(null);
	
	}
}