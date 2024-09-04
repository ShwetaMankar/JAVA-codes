import java.sql.*;
import java.util.*;

public class PR19_EX2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student id:");
		int id=sc.nextInt();
		
		System.out.println("Enter student enrollnment number:");
		int enroll=sc.nextInt();
		
		System.out.println("Enter student Name:");
		String name=sc.next();
		
		System.out.println("Enter year:");
		String year=sc.next();
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");
			String Query="update student set ID=?,EnrollnmentNo=?,Name=?,Year=? where ID="+id;
			
			PreparedStatement pstmt=con.prepareStatement(Query);
			
			pstmt.setInt(1,id);
			pstmt.setInt(2,enroll);
			pstmt.setString(3,name);
			pstmt.setString(4,year);
			
			pstmt.executeUpdate();
			System.out.println("Data updated successfully");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
