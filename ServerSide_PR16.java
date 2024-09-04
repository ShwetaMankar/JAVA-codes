import java.net.*;
import java.io.*;
class ServerSide_PR16
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
			if(str.equals("ShwetaMankar"))
			{
				System.out.println("Username & Password is :" +str);
				str2 = br.readLine();
				dout.writeUTF("Username & password is correct");
			}
			else
			{	
				System.out.println("Username & Password is wrong"); 
			}
			dout.flush();
		}
		is.close();	
		s.close();	
		ss.close();
	}
}
