import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class PR_EX2 extends Frame implements  ActionListener
{
	Label l;
	JTextField t, t1;
	Button b;
	String f, f1;
	int i, j;
	
	PR_EX2()
	{
		Label a = new Label("Enter first digit : ");
		a.setBounds(50,100,200,50);
		
		t = new JTextField();
		t.setBounds(400,100,200,50);
		
		Label l1 = new Label("Enter second digit to add : ");
		l1.setBounds(50,170,200,50);
		
		t1 = new JTextField();
		t1.setBounds(400,170,200,50);
		
		b = new Button("ADD");
		b.setBounds(250,250,80,40);
		b.addActionListener(this);
		l = new Label();
		l.setBounds(50, 270, 200, 50);
		
		add(a);
		add(t);
		add(l1);
		add(t1);
		add(b);
		add(l);
		setLayout(null);
		setSize(700,500);
		setTitle("Add two numbers using JTextField");
		setVisible(true);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		try{
			f = t1.getText();
            i = Integer.parseInt(f);
			System.out.println(i);
			f1 = t.getText();
            j = Integer.parseInt(f1);	
		}
		catch(Exception ce){}
		l.setText("Answer is " + (i+j));//l.setText("s");
	}
	public static void main(String s[])
	{	new PR_EX2();	}
}