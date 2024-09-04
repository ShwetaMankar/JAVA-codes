import java.awt.*;

class p1Ex3 extends Frame
{
	p1Ex3()
	{
		Button ok = new Button("OK");
		ok.setBounds(100, 100, 100, 50);
		add(ok);
		
		Button reset = new Button("RESET");
		reset.setBounds(100, 200, 100, 50);
		add(reset);
		
		Button cancle = new Button("CANCLE");
		cancle.setBounds(100, 300, 100, 50);
		add(cancle);
		
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String agrs[])
	{
		new p1Ex3();
	}
}