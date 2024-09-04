import java.net.*;
import java.io.*;
public class ServerFile_PR17_EX2
{
	public static void main(String args[])throws IOException
	{
		byte b[]=new byte[3072];
		DatagramSocket dsoc=new DatagramSocket(2019);
		FileOutputStream f=new FileOutputStream("C:\\Users\\SHEWTA\\OneDrive\\Documents\\p2\\cpy.txt");
		 
		DatagramPacket dp=new DatagramPacket(b,b.length);
		dsoc.receive(dp);
		String data = new String(dp.getData(),0,dp.getLength());  
		f.write(data.getBytes(), 0, data.length());		 
	}
}