import java.awt.*;

class p1RadioButton extends Frame
{
	p1RadioButton()
	{
		Label sem = new Label("Select Semester");
		
		CheckboxGroup g = new CheckboxGroup();
		
		Checkbox r1 = new Checkbox("Semester I", true, g);
		Checkbox r2 = new Checkbox("Semester II", false, g);
		Checkbox r3 = new Checkbox("Semester III", false, g);
		Checkbox r4 = new Checkbox("Semester IV", false, g);
		Checkbox r5 = new Checkbox("Semester V", false, g);
		Checkbox r6 = new Checkbox("Semester VI", false, g);
		
		add(sem);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(r5);
		add(r6);
		
		Label sub = new Label("Select Subjects");
		
		Checkbox c1 = new Checkbox("C", true);
		Checkbox c2 = new Checkbox("C++");
		Checkbox c3 = new Checkbox("JAVA");
		Checkbox c4 = new Checkbox("PYTHON");
		Checkbox c5 = new Checkbox("HTML");
		Checkbox c6 = new Checkbox("VB");
		
		add(sub);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new p1RadioButton();
	}
}