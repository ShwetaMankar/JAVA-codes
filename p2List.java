import java.awt.*;

class p2List extends Frame
{
	p2List()
	{
		List l = new List(3, true);

		l.add("Summer");
		l.add("Winter");
		l.add("Rainy");

		add(l);

		setLayout(new FlowLayout());
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String s[])
	{
		new p2List();
	}
}