import java.net.*;
import java.io.*;
public class ServerPR17_EX3
{
	public static void main(String s[])
	{
		DatagramSocket sk = new DatagramSocket(port);

		File destfile = new File("pr17server.txt");
		FileOutputStream fos = new FileOutputStream(destfile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(fos);

		byte[] data = new byte[1000];
		DatagramPacket pkt = new DatagramPacket(data, data.length);
		ByteBuffer b = ByteBuffer.wrap(data);
		CRC32 crc = new CRC32();

		while(true) 
		{
			pkt.setLength(data.length);
			sk.receive(pkt);
			b.rewind();
			bos.write(data);  
		}
		bos.close();
		fos.close();
		}
}