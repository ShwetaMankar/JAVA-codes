import java.awt.*;
public class welcome extends Frame
{
	welcome()
	{
		Label l = new Label("******* WELCOME ******");
		l.setBounds(60, 30, 700, 60);
		l.setFont(new Font("Serif",Font.BOLD, 50));
		add(l);
		setLayout(null);
		setVisible(true);
		setSize(800, 200);
	}
	public static void main(String a[])
	{
		new welcome();
	}
}