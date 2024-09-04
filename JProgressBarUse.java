import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JProgressBarUse extends Frame implements ActionListener
{
	JProgressBar jpb;
	
	JButton b;
	JProgressBarUse()
	{
		Label l = new Label("Enter Your Details ");
		l.setBounds(50,50,300,50);
		add(l);	
		
		Label lfn = new Label("First Name : ");
		lfn.setBounds(50,100,200,50);
		add(lfn);
		
		TextField tf = new TextField();
		tf.setBounds(400,100,200,50);
		add(tf);
		
		Label lln = new Label("Last Name : ");
		lln.setBounds(50,170,200,50);
		add(lln);		
		
		TextField tf2 = new TextField();
		tf2.setBounds(400,170,200,50);
		add(tf2);	
		
		Label adr = new Label("Address : ");
		adr.setBounds(50,240,200,50);
		add(adr);	
		
		TextArea ta = new TextArea();
		ta.setBounds(400,240,200,50);
		add(ta);
		
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
			}
			catch(Exception e1)
			{
				System.out.print("Caughted exception is =" +e1);
			}
		}
	}

		public static void main(String args[])
		{
			new JProgressBarUse();
		}
}