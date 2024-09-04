import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PR12_echochar extends Frame implements ActionListener
{
	Label l2, l1;
	Button b;
	TextField t1;
	JPasswordField jpf;
	
	PR12_echochar()
	{
		l1 = new Label("Username : ");
		l1.setBounds(50, 200, 100, 30);
		
		l2 = new Label("Password : ");
		l2.setBounds(50, 260, 100, 30);
		
		t1 = new TextField();
		t1.setBounds(200, 200, 200, 30);
		
		jpf = new JPasswordField();
		jpf.setBounds(200, 260, 200, 30);
		jpf.setEchoChar('#');
		
		b = new Button("Login");
		b.setBounds(125, 350, 100, 40);
		b.setBackground(Color.green);
		b.setForeground(Color.blue);
		b.addActionListener(this);
		
		add(l1);
		add(l2);
		add(t1);
		add(jpf);
		add(b);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		setTitle("JPasswordField");
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(this,"Login Successful");
	}
	public static void main(String s[])
	{
		new PR12_echochar();
	}
}