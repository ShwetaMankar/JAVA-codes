import java.sql.*;

public class PR19
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");
			Statement stmt=con.createStatement();
			
			String Query="update studper set Year='IFTY' where roll_no=19124";
			
			int count=stmt.executeUpdate(Query);
			
			System.out.println(+count+" Record Updated Successfully");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
