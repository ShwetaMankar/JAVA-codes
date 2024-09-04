import java.io.IOException;
import java.net.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
class PR15_EX2
{
	public static void main(String args[]) throws IOException, MalformedURLException 
	{
		URL ur = new URL("http://www.msbte.org.in");
		URLConnection uc = ur.openConnection();
		System.out.println("Date : " + new Date(uc.getDate()) );
		System.out.println("Content Length : " + uc.getContentLength());
		System.out.println("Content Type : " + uc.getContentType());
	}
}