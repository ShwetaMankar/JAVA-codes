import java.awt.*;

class TextAreaField extends Frame
{
	TextAreaField()
	{
		Label l = new Label("Enter Your Details ");
		l.setBounds(50,50,300,50);
		add(l);
		
		TextArea ta = new TextArea();
		ta.setText(" First Name : ");
		ta.setBounds(50,100,200,50);
		add(ta);
		
		TextField tf = new TextField();
		tf.setBounds(400,100,200,50);
		add(tf);
		
		TextArea ta2 = new TextArea();
		ta2.setText(" Last Name : ");
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
		new TextAreaField();
	}
}