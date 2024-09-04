import java.sql.*;

public class PR19_EX1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");	
			
			Statement stmt=con.createStatement();
			String Query="select * from student";
			ResultSet rs=stmt.executeQuery(Query);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				int enroll=rs.getInt(2);
				String name=rs.getString(3);
				String year=rs.getString(4);
								
				System.out.println(" Records from database");
				System.out.println("ID:"+id);
				System.out.println("Enrollnment:"+enroll);
				System.out.println("Name:"+name);
				System.out.println("Year:"+year);
			}
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
