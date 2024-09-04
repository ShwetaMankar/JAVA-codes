import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JProgressBarExternalCall extends Frame implements ActionListener
{
	/*JProgressBar jpb;
	int i = 0;*/
	
	Button b;
	JProgressBarExternalCall()
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
		
		b = new Button("Submit");
		b.setBounds(250,350,80,40);
		add(b);		
		b.addActionListener(this);
		
		/*jpb = new JProgressBar(0,3000); // min 0, max = 2000;
		jpb.setBounds(300,400,350,50);
		jpb.setValue(0);//current value from where to strat progress
		jpb.setStringPainted(true);
		add(jpb); // add JProgressBar to JFrame*/
		
		setLayout(null);
		setSize(700,700);
		setVisible(true);
		setTitle("JProgressBar");
		
	}/*
	public void iterate()
	{
		while(i<=3000)
		{
			jpb.setValue(i);
			i=i+20; //fiiled 100%
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{}
		}
	}*/
	public void actionPerformed(ActionEvent e) 
	{ 
		pr9JProgressBar jp = new pr9JProgressBar(); // to go to next home page constructor of that pg is created & called				
    }
	public static void main(String args[])
	{
		new JProgressBarExternalCall();
	}
}