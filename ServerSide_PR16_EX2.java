import java.net.*;
import java.io.*;
class ServerSide_PR16_EX2
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(3333);
		Socket s= ss.accept();
		
		DataInputStream is = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String str="", str2="";
		
		while(!str.equals("stop"))
		{	
			str = is.readUTF();
			if(str))
			{
				str2 = br.readLine();
				dout.writeUTF("Number is Prime");
			}
			else
			{	
				System.out.println("Number is not prime"); 
			}
			dout.flush();
		}
		is.close();	
		s.close();	
		ss.close();
	}
}
