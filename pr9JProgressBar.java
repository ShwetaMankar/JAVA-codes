import java.awt.*;
import javax.swing.*;
class pr9JProgressBar extends JFrame
{
	JProgressBar jpb;
	int i = 0;
	
	pr9JProgressBar()
	{
		jpb = new JProgressBar(0,3000); // min 0, max = 2000;
		jpb.setBounds(40,40,350,50);
		jpb.setValue(0);//current value from where to strat progress
		jpb.setStringPainted(true);
		add(jpb); // add JProgressBar to JFrame
		
		setLayout(null);
		setSize(500,200);
		setVisible(true);
	}
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
	}
	public static void main(String s[])
	{
		pr9JProgressBar jp = new pr9JProgressBar();
		jp.iterate();
	}
}