import java.net.*;
import java.io.*;
class ClientSide_PR16_EX2
{
	public static void main(String args[]) throws Exception
	{
		Socket s = new Socket("localhost",3333);
		
		DataInputStream is = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str="", str2="";
		while(!str.equals("stop"))
		{
			str = br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = is.readUTF();
			System.out.println("server Says :" +str2);
		}
		dout.close();
		s.close();
	}
}
