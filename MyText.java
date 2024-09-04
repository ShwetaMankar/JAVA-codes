import java.awt.*;
class MyText extends Frame
{
	MyText()
	{
		TextField t1, t2, t3, t4;
		
		t1= new TextField();
		t2= new TextField(100);
		t3= new TextField("############");
		t4= new TextField("Hello text......");
		
		t1.setBounds(100,100,200,10);
		t2.setBounds(100,200,200,10);
		t3.setBounds(100,300,200,10);
		t4.setBounds(100,400,200,10);
		
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
	}	
	public static void main(String args[])
	{
		new MyText();
	}
}