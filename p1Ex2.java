import java.awt.*;

class p1Ex2 extends Frame
{
	p1Ex2()
	{
		
		Label lang = new Label("Select known languages : ");
		lang.setBounds(50,50,200,50);
		
		Checkbox m = new Checkbox("Marathi", true);
		m.setBounds(50,100,200,50);
		Checkbox h = new Checkbox("Hindi");
		h.setBounds(50,150,200,50);
		Checkbox e = new Checkbox("English");
		e.setBounds(50,200,200,50);
		Checkbox s = new Checkbox("Sanskrit");
		s.setBounds(50,250,200,50);
		
		add(lang);
		add(m);
		add(h);
		add(e);
		add(s);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new p1Ex2();
	}
}