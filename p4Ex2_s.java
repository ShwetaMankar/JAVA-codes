import java.awt.*;

public class p4Ex2 extends Frame
{
	Label name, comments;
	TextArea a;
	TextField f;
	Button b;
	
	p4Ex2()
	{
		setLayout(new GridBagLayout(););
		GridBagConstraints gbc = new GridBagConstraints();
		setSize(500, 500);
		setTitle("GridBagLayout");
		setVisible(true);
		
		//define components
		name = new Label("Name");
		comments = new Label("Comments");
		b = new Button("Submit");
		a = new TextArea(10);
		f = new TextField(6,15);
		
		
		
		//add components
		add(name);
		add(comments);
		add(a);
		add(f);
		
	}
	public static void main(String args[])
	{
		new p4Ex2();
	}
}