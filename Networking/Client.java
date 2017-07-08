import java.net.*;
import java.io.*;

public class Client
{
	public static void main(String args[])
	{	
		try
		{
			Socket s=new Socket("localhost",6667);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello server");
			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
