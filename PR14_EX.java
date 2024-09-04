import java.io.*;
import java.net.*;
public class PR14_EX
{
	public static void main(String[] s) throws IOException
	{
		String hostname = s[0];
		try
		{
			InetAddress ip = InetAddress.getByName(hostname);
			
			System.out.println("IP Address of entered hostname is :" +ip.getHostAddress());
		}
		catch(UnknownHostException e)
		{
			System.out.println("Could not found IP address for : " +hostname);
		}
	}
}
