import java.awt.*;

class p5 extends Frame
{
	p5()
	{
		MenuBar mb =new MenuBar();
		
		Menu c = new Menu("Color");
		
		MenuItem r = new MenuItem("Red");
		MenuItem g = new MenuItem("Green");
		MenuItem blu = new MenuItem("Blue");
		MenuItem b = new MenuItem("Black");
		b.setEnabled(false);
		MenuItem w = new MenuItem("White");
		
		c.add(r);
		c.add(g);
		c.add(blu);
		c.add(b);
		c.add(w);
		
		mb.add(c);
		
		setMenuBar(mb);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		new p5();
	}
}