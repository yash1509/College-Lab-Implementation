import java.io.*;
import java.net.*;
public class IP
{
	public static void main(String args[]) throws UnknownHostException 
	{
		InetAddress addr = InetAddress.getLocalHost();
		String ip= addr.getHostAddress();
		System.out.println("IP address of localhost: "+ip);
	}
}