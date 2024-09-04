import java.awt.*;
import javax.swing.*;

public class p4Ex1 extends JFrame 
{
	p4Ex1()
	{
		setTitle("GridBagLayout");
		
		GridBagConstraints gbc = new GridBagConstraints(); // constraints are stored here
		
		/*GridBagLayout Layout = new GridBagLayout();
		setLayout(Layout);*/
		setLayout(new GridBagLayout());
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(new Button("Button One"),gbc);
		gbc.gridx = 1;
		gbc.gridy =0;
		this.add(new Button("Button Two"),gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;   // extra vertical space
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(new Button("Button Three"),gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(new Button("Button Four"),gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 2;
		
		gbc.gridwidth = 2;
		this.add(new Button("Button Five"),gbc);
		
		setSize(300,300);
		setPreferredSize(getSize());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new p4Ex1();
	}
}