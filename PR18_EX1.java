import java.sql.*;
public class PR18_EX1 
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	//1
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
			Statement stmt=con.createStatement();
			String Query="create table emp(empid int,empname varchar(50))";
			stmt.execute(Query);
			System.out.println("Table Created");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
