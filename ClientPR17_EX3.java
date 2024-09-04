import java.net.*;
import java.io.*;
public class ClientPR17_EX3
{
	public static void main(String s[])
	{
		byte[] data = new byte[1000];
		ByteBuffer b = ByteBuffer.wrap(data);
		DatagramPacket pkt;
		File file = new File(sourceFile);
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		CRC32 crc = new CRC32();

		while(true)
		{
			b.clear();
			b.putLong(0); 
			bytesRead = bis.read(data);
			if(bytesRead==-1) { break; }
			crc.reset();
			crc.update(data, 8, data.length-8);
			long chksum = crc.getValue();
			b.rewind();
			b.putLong(chksum);
			pkt = new DatagramPacket(data, 1000, addr);
			sk.send(pkt);
		}

		bis.close();
		fis.close();
	}
}