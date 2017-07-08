import java.io.*;
import java.net.*;

class ucli
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket();
		byte[] b="yash".getBytes();
		InetAddress IP = InetAddress.getLocalHost();
		DatagramPacket p = new DatagramPacket(b,b.length, IP, 80);
		ds.send(p);	
	}
}