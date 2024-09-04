import java.awt.*;
import java.applet.*;

/*<applet code = p2Ex2 width = "500", height= 500>
</applet>
*/
public class p2Ex2 extends Applet
{
	public void init()
	{
		Label l = new Label("Select multiple newspapers : ");
		l.setBounds(50,50,200,50);
		add(l);
		
		List news = new List(10, true);
		news.setBounds(100, 100, 250, 200);
		
		news.add("The Hindu");
		news.add(" The Times of India");
		news.add("Hindustan");
		news.add("Dainik Jagran");
		news.add("Dainik Bhaskar");
		news.add("Indian Express");
		news.add("Sangli");
		news.add("Pudhari");
		news.add("Sakal");
		news.add("Lokmat");
		
		add(news);
		
		setLayout(null);
	
	}
}