//import java.sql.*;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
public class registration extends JFrame implements ActionListener
{
	//Create object of JPanel and Label 
		JPanel clgName;
		Label reg;
	//create object of TextField
		JTextField textEnrollment=new JTextField ();
        JTextField textName=new JTextField ();
        JTextField textRoll =new JTextField ();
        JTextField textMo=new JTextField ();
		JTextField textEmail =new JTextField ();
        JTextField textDOB=new JTextField ();
		JTextField textClass =new JTextField ();
        JTextField textparentm=new JTextField ();
        JTextArea textAddress=new JTextArea();
	    JComboBox jc=new JComboBox();   
	   
	   //Create JButton Object
		JButton btnAdd = new JButton("Add");
		JButton btnClear =new JButton("Clear");
	    JButton btnDelete = new JButton("Delete");
	    JButton btnUpdate = new JButton("Update");
		JButton Search = new JButton("Search");
		
	    registration()   //Create a constructor of class Microproject
	    {
			clgName = new JPanel();	// JPanel to add label of college name
			clgName.setBackground(Color.gray);
			
			reg.setFont(new Font("Serif", Font.PLAIN, 70));
			reg.setForeground(Color.orange);
			
			clgName.add(reg);	//label of college name added to JPanel
		
		 //create JLabel object
		 reg = new Label(" Registration Form ");
		 
		 JLabel l2 = new JLabel("Enrollment No.:-");     
		 JLabel l3 = new JLabel("Name of Student:-");
		 JLabel l4 = new JLabel("Roll No.:-");
		 JLabel l5 = new JLabel("Mobile No.:-");
		 JLabel l6 = new JLabel("Email ID:-");
		 JLabel l7 = new JLabel("Date of Birth:-");
		 JLabel l8 = new JLabel("Class:-");
		 JLabel l9 = new JLabel("Parent phone no");
		 JLabel l10 = new JLabel("Address");
		 JLabel jpH1 = new JLabel(new ImageIcon("kaveri1.jpg"));	//JLabel to display img of kaveri

		
		 //set setBounds for JLabel
		 clgName.setBounds(10, 10, 1900, 110);
		 l2.setBounds(40,150,200,40);
		 l3.setBounds(40,200,200,40);
		 l4.setBounds(40,260,200,40);
		 l5.setBounds(40,320,100,40);
		 l6.setBounds(40,375,100,40);
		 l7.setBounds(40,435,100,40);
		 l8.setBounds(40,490,100,40);
		 l9.setBounds(40,540,200,40);
		 l10.setBounds(40,590,200,40);
		 jpH1.setBounds(300, 200, 1200, 400);

		
		 //Add Jlabel to frame 
		 add(clgName);	//JPanel added to JFrame
		 add(l2);  add(l3);  add(l4);  add(l5);  add(l6); 
		 add(l7);  add(l8);  add(l9);   add(l10);
		 add(jpH1);

		 //set setBounds for TextField 
		 textEnrollment.setBounds(240,155,200,30);
	     textName.setBounds(240,205,200,30);
	     textRoll.setBounds(240,265,200,30);
	     textMo.setBounds(240,325,200,30);
		 textEmail.setBounds(240,380,200,30);
	     textDOB.setBounds(240,440,200,30);
		 textClass.setBounds(240,490,200,30);
	     textparentm.setBounds(240,550,200,30);
		 textAddress.setBounds(240,600,200,30);
	    
		
		 //add TextField to frame
		 add(textEnrollment);  add(textName);  add(textRoll);  add(textMo);  add(textEmail); 
		 add(textDOB);   add(textparentm);  add(textAddress);
		
		 //For JComboBox
		 jc.setBounds(240,490,200,30);
		 jc.addItem("COFY");
		 jc.addItem("COSY");
		 jc.addItem("COTY");
		 add(jc);
		
		 //set setBounds for JButton
		 btnAdd.setBounds(200,760,100,25);
		 btnClear.setBounds(400,760,100,25);
	     btnUpdate.setBounds(600,760,100,25);
	     btnDelete.setBounds(800,760,100,25);
		 Search.setBounds(1000,760,100,25);
		 
		 // add JButton to frame
		 add(btnAdd);  add(btnDelete);   add(btnUpdate);  add(btnClear); add(Search);
		
		//addActionListeners to JButton
		 btnAdd.addActionListener(this);
		 btnClear.addActionListener(this);
		 Search.addActionListener(this);
		 btnDelete.addActionListener(this);
		 btnUpdate.addActionListener(this);
		 
		 //To set frame properties
		 setExtendedState(JFrame.MAXIMIZED_BOTH); // to make screen fully visible
		 setTitle("registration");
		 setLayout(null);
		 setSize(700,700);
		 setVisible(true);
	    }
	   /* public void actionPerformed(ActionEvent e) 
	    {    
       
		   String enroll = textEnrollment.getText();
           String Name = textName.getText();
           String rollno = textRoll.getText();
           String Mobile = textMo.getText();		
		   String email = textEmail.getText();
           String dob = textDOB.getText();
		   String classt=jc.getSelectedItem().toString();
           String pmobileno = textparentm.getText();
           String address = textAddress.getText();
       
	       try 
	      {
		     Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance","root","");
             //for insert data into table
             Statement stmt = con.createStatement();
			 PreparedStatement pst;
             if(e.getSource()==btnAdd) 
			 {
				  String sql="INSERT INTO registration(Enrollmentno,named,rolls,mobiles,emails,dateofbir,classes,pamobiles,addresss)value('"+enroll+"','"+Name+"','"+rollno+"','"+Mobile+"','"+email+"','"+dob+"','"+classt+"','"+pmobileno+"','"+address+"')";
             
				stmt.executeUpdate(sql); //here insert query apply
                JOptionPane.showMessageDialog(null, "DATA SAVED SUCCESSFULLY ..");
			 }
			 if (e.getSource() == btnClear) 
		     {
                 textEnrollment.setText("");
                 textName.setText("");
				 textRoll.setText("");
                 textMo.setText("");
				 textEmail.setText("");
                 textDOB.setText("");
				 textparentm.setText("");
                 textAddress.setText("");
             }
			 if (e.getSource() == Search) 
		     {
                 pst = con.prepareStatement("select Enrollmentno,named,rolls,mobiles,emails,dateofbir,classes,pamobiles,addresss from registration where Enrollmentno=? ");
                 int Enrollmentno = Integer.parseInt(textEnrollment.getText());
			     pst.setInt(1, Enrollmentno);
			     
			     ResultSet rs1 = pst.executeQuery();
			      if(rs1.next()==false)
				  {
				    JOptionPane.showMessageDialog(null, "Sorry Record Not Found");
                                
                                textName.setText("");
								textRoll.setText("");
                                textMo.setText("");
								textEmail.setText("");
                                textDOB.setText("");
								textClass.setText("");
                                textparentm.setText("");
								textAddress.setText("");
                                textEnrollment.requestFocus();
			     }
                else
                {
			            textName.setText(rs1.getString("named"));
                        textRoll.setText(rs1.getString("rolls"));
						textMo.setText(rs1.getString("mobiles"));
                        textEmail.setText(rs1.getString("emails"));
						textDOB.setText(rs1.getString("dateofbir"));
   						jc.setSelectedItem(rs1.getString("classes").toString());
						textparentm.setText(rs1.getString("pamobiles"));
                        textAddress.setText(rs1.getString("addresss"));
		        }
			  }	
              if (e.getSource() == btnDelete) 
		      {
				 pst = con.prepareStatement("DELETE FROM registration where Enrollmentno="+textEnrollment.getText());
                 
			     pst.executeUpdate();
                 JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY ..");
				                textEnrollment.setText("");
				                textName.setText("");
								textRoll.setText("");
                                textMo.setText("");
								textEmail.setText("");
                                textDOB.setText("");
								textClass.setText("");
                                textparentm.setText("");
								textAddress.setText("");
                                textEnrollment.requestFocus();
              }
			  if (e.getSource() == btnUpdate) 
		      {
				String sql="UPDATE registration set named='"+textName.getText()+"',rolls='"+textRoll.getText()+"',mobiles='"+textMo.getText()+"',emails='"+textEmail.getText()+"',dateofbir='"+textDOB.getText()+"',classes='"+jc.getSelectedItem().toString()+"',pamobiles='"+textparentm.getText()+"',addresss='"+textAddress.getText()+"' where Enrollmentno= "+textEnrollment.getText();
				stmt.executeUpdate(sql); //here insert query apply
                JOptionPane.showMessageDialog(this, "UPDATED SUCCESSFULLY ..");
              }
 		     //close connection
	         con.close();
         } catch(Exception ex) {System.out.print(ex);}*/
		
    }
	public static void main(String args[])
	{
		new registration();
	}
}