import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class UpdateQuery
{
 public static void main(String [] args)
 {
 try 
 {
	Class.forName("com.mysql.jdbc.Driver");
	Connection 
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Ddemodatabase","root","root");
		
	PreparedStatement st = con.prepareStatement("update student set roll_no=3 where name='Abhishek'"); 
	st.executeUpdate(); 
 }
 catch(Exception ex)
 {
	System.out.println(ex);
 }
}
}