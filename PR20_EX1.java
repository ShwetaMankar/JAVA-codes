import java.sql.*;

public class PR20_EX1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");	
			
			Statement stmt=con.createStatement();
			String Query="update student set Name='John' where ID=19126";
			int count=stmt.executeUpdate(Query);
			System.out.println(+count+" Updated record from Database");
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
