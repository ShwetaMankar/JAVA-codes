import java.sql.*;

public class PR20
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");	
			
			Statement stmt=con.createStatement();
			String Query="delete from student where id=20134";
			int count=stmt.executeUpdate(Query);
			
			System.out.println(+count+"Deleted record from Database");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
