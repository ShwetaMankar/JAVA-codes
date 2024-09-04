import java.sql.*;
public class PR18_EX2 
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	//1
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");	//2
			Statement stmt=con.createStatement();
			String Query="select  roll_no,Name from StudPer where Percentage>70";
			ResultSet rs=stmt.executeQuery(Query);
			while(rs.next())
			{
				int Roll=rs.getInt(1);
				String name=rs.getString(2);
				System.out.println("Roll No:"+Roll);
				System.out.println("Name:"+name);
			}
			con.close();
		}
		catch(Exception e)
		{	System.out.println(e);	}
	}
}
