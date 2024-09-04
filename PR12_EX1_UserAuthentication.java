import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class PR12_EX1_UserAuthentication extends JFrame implements ActionListener 
{
 
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
 
 
    PR12_EX1_UserAuthentication()
	{
		
		loginButton.setBackground(Color.green);
		loginButton.setForeground(Color.blue);
		loginButton.setFont(new Font("Serif", Font.BOLD, 20));
		
		
		resetButton.setBackground(Color.red);
		resetButton.setForeground(Color.blue);
		resetButton.setFont(new Font("Serif", Font.BOLD, 20));
		
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        setTitle("Login Form");
		setSize(500,500);
        setVisible(true);
    }
 
    public void setLayoutManager() 
	{
        container.setLayout(null);
    }
 
    public void setLocationAndSize() 
	{
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 60);
        resetButton.setBounds(200, 300, 100, 60);
 
    }
 
    public void addComponentsToContainer() 
	{
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }
 
    public void addActionEvent() 
	{
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) 
	{
        //LOGIN button
        if (e.getSource()==loginButton) 
		{
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("Shweta") && pwdText.equalsIgnoreCase("1912280141")) 
			{
                JOptionPane.showMessageDialog(this,"Login Successful");
				welcome w = new welcome();
            } 
			else 
			{ JOptionPane.showMessageDialog(this,"Invalid Username or Password");   }
        }
        if (e.getSource() == resetButton)  //RESET button
		{
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword)   //showPassword JCheckBox
		{
            if (showPassword.isSelected()) 
			{
                passwordField.setEchoChar((char)0);
            } 
			else 
			{
                passwordField.setEchoChar('*');
            }
        }
    }
	public static void main(String[] a) 
    { new PR12_EX1_UserAuthentication();}
}