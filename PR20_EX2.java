import java.sql.*;

public class PR20_EX2
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");	
			
			Statement stmt=con.createStatement();
			String Query="delete from product where ID='P1234' && Price>500";
			int count=stmt.executeUpdate(Query);
			System.out.println(+count+"  Data Deleted Successfully");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
