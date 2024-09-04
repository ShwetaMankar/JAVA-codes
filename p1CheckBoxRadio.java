import java.awt.*;

class p1CheckBoxRadio extends Frame
{
	p1CheckBoxRadio()
	{
		Label sem = new Label("Select Semester");
		sem.setBounds(50,50,200,50);//(x,y,w,h)
		
		CheckboxGroup g = new CheckboxGroup();
		
		Checkbox r1 = new Checkbox("Semester I", true, g);
		r1.setBounds(50,100,200,50);
		Checkbox r2 = new Checkbox("Semester II", false, g);
		r2.setBounds(50,150,200,50);
		Checkbox r3 = new Checkbox("Semester III", false, g);
		r3.setBounds(50,200,200,50);
		Checkbox r4 = new Checkbox("Semester IV", false, g);
		r4.setBounds(50,250,200,50);
		Checkbox r5 = new Checkbox("Semester V", false, g);
		r5.setBounds(50,300,200,50);
		Checkbox r6 = new Checkbox("Semester VI", false, g);
		r6.setBounds(50,350,200,50);
		
		add(sem);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(r5);
		add(r6);
		
		Label sub = new Label("Select Subjects");
		sub.setBounds(500,50,200,50);
		
		Checkbox c1 = new Checkbox("C", true);
		c1.setBounds(500,100,200,50);
		Checkbox c2 = new Checkbox("C++");
		c2.setBounds(500,150,200,50);
		Checkbox c3 = new Checkbox("JAVA");
		c3.setBounds(500,200,200,50);
		Checkbox c4 = new Checkbox("PYTHON");
		c4.setBounds(500,250,200,50);
		Checkbox c5 = new Checkbox("HTML");
		c5.setBounds(500,300,200,50);
		Checkbox c6 = new Checkbox("VB");
		c6.setBounds(500,350,200,50);
		
		add(sub);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		
		setLayout(null);
		setSize(700,700);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new p1CheckBoxRadio();
	}
}