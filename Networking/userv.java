import java.io.*;
import java.net.*;

public class userv
{
	public static void main(String args[])
	{
		try{
		System.out.println("Server Starting");
		DatagramSocket ds=new DatagramSocket(80);
		byte[] r=new byte[60];
		DatagramPacket p=new DatagramPacket(r,r.length);
		ds.receive(p);
		String s=new String(p.getData());
		System.out.println(s);
		}
		catch(Exception e)
		{	System.out.println(e);	}
	}
}