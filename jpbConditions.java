import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class jpbConditions extends Frame implements ActionListener
{
	JProgressBar jpb;
	TextField tf;
	TextField tf2;
	
	JButton b;
	jpbConditions()
	{
		Label l = new Label("Login");
		l.setBounds(100,50,300,50);
		add(l);	
		
		Label lfn = new Label("UserName: ");
		lfn.setBounds(50,100,200,50);
		add(lfn);
		
		tf = new TextField();
		tf.setBounds(400,100,200,50);
		add(tf);
		
		Label lln = new Label("Password : ");
		lln.setBounds(50,170,200,50);
		add(lln);		
		
		tf2 = new TextField();
		tf2.setBounds(400,170,200,50);
		tf2.setEchoChar('*');
		add(tf2);	
		
		b = new JButton("Submit");
		b.setBounds(250,350,80,40);
		add(b);		
		
		
		jpb = new JProgressBar(0,2000); // min 0, max = 2000;
		jpb.setBounds(150,400,350,50);
		jpb.setValue(0);//current value from where to start progress
		jpb.setStringPainted(true);
		jpb.setVisible(false);
		add(jpb); // add JProgressBar to JFrame*/
		
		b.addActionListener(this); 
		
		setLayout(null);
		setSize(700,700);
		setVisible(true);
		setTitle("JProgressBar");
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{ 	int i = 0;
	
		if(e.getSource() == b)
		{
			String userText;
            String pwdText;
            userText = tf.getText();
            pwdText = tf2.getText();
            if (userText.equalsIgnoreCase("GRWPT") && pwdText.equalsIgnoreCase("gpt1228")) 
			{	
				jpb.setVisible(true);
				try
				{
					while(i<=2000)
					{
						Thread.sleep(10);
						jpb.paintImmediately(0,0,350,50);
						jpb.setValue(i);
						i=i+20; //filled 100%
					}
					jpb.setVisible(false);
					JOptionPane.showMessageDialog(this,"Login Successful");
					pr8EX d = new pr8EX(); 
				}
				catch(Exception e1)
				{
					System.out.print("Caughted exception is =" +e1);
				}
            } 
			else 
			{
                JOptionPane.showMessageDialog(this,"Invalid Username or Password");
            }
 
		}
	}
		public static void main(String args[])
		{
			new jpbConditions();
		}
}