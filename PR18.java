import java.sql.*;

public class PR18 
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");	
			Statement stmt=con.createStatement();
			String Query="insert into student values(19126,1912280141,'Shweta','COTY')";
			int count=stmt.executeUpdate(Query);
			System.out.println(+count+" Record Inserted Successfully");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
