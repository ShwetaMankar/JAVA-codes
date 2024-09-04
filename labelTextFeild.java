import java.awt.*;

class labelTextFeild extends Frame
{
	labelTextFeild()
	{
		Label l = new Label("Enter Your Details ");
		l.setBounds(50,50,300,50);
		add(l);
		
		Label ta = new Label("First Name : ");
		ta.setBounds(50,100,200,50);
		add(ta);
		
		TextField tf = new TextField();
		tf.setBounds(400,100,200,50);
		add(tf);
		
		Label ta2 = new Label("Last Name : ");
		ta2.setBounds(50,170,200,50);
		add(ta2);
		
		TextField tf2 = new TextField();
		tf2.setBounds(400,170,200,50);
		add(tf2);
		
		Button b = new Button("Submit");
		b.setBounds(250,300,80,40);
		add(b);
		
		setLayout(null);
		setSize(700,700);
		setVisible(true);
		
	}
	
	public static void main(String agrs[])
	{
		new labelTextFeild();
	}
}