import java.awt.*;
class p1b extends Frame
{
	p1b()
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
		
		Button b = new Button("Submit");
		b.setBounds(250,350,80,40);
		add(b);		
		
		setLayout(null);
		setSize(700,700);
		setVisible(true);
	}	
	public static void main(String agrs[])
	{
		new p1b();
	}
}