import java.awt.*;
import javax.swing.*;

public class p4Ex2 extends JFrame
{
	Label name, comments;
	TextArea a;
	TextField f;
	Button b;
	p4Ex2()
	{
		
		GridBagLayout l = new GridBagLayout();
		setLayout(l);
		GridBagConstraints gbc = new GridBagConstraints();
		setSize(200, 300);
		setTitle("GridBagLayout");
		setVisible(true);
		
		//define components
		name = new Label("Name");
		comments = new Label("Comments");
		b = new Button("Submit");
		a = new TextArea(6,15);
		f = new TextField(10);
		
		// define gridbag
		gbc.anchor = GridBagConstraints.NORTH;
		
		//first row
		//gbc.weightx = 1.0; // weightx & weighty's values determines how much of extra space within container is allocated to each row & column
		
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		l.setConstraints(name,gbc);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		l.setConstraints(f,gbc);
		
		//second row
		//gbc.weighty = 1.0;
		
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		l.setConstraints(comments,gbc);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		l.setConstraints(a,gbc);
		
		/*third row
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;*/
		
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		
		l.setConstraints(b,gbc);
		
		//add components
		add(name);
		add(f);
		add(comments);
		add(a);	
		add(b);
	}
	public static void main(String args[])
	{
		new p4Ex2();
	}
}