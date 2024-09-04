import java.awt.*;
import java.awt.event.*;
public class MulBtnKeyEvent2 extends Frame implements  ActionListener
{
	Label l;
	TextField t, t1;
	Button b;
	String f, f1;
	int i, j;
	
	MulBtnKeyEvent2()
	{
		Label a = new Label("Enter first digit to multiply: ");
		a.setBounds(50,100,200,50);
		
		t = new TextField();
		t.setBounds(400,100,200,50);
		
		Label l1 = new Label("Enter second digit to multiply : ");
		l1.setBounds(50,170,200,50);
		
		t1 = new TextField();
		t1.setBounds(400,170,200,50);
		
		b = new Button("Multiply");
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
		setTitle("KeyPressedEvent");
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
		l.setText("Answer is " + (i*j));//l.setText("s");
	}
	public static void main(String s[])
	{
		new MulBtnKeyEvent2();
	}
}