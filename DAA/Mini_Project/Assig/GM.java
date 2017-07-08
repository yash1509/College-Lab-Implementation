import java.io.*;
import java.net.*;
class comms
{
	void com()
	{
		try{
			URL url=new URL("http://www.javatpoint.com/java-tutorial");
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host Name: "+url.getHost());
			System.out.println("Port Number: "+url.getPort());
			System.out.println("File Name: "+url.getFile());	
			}	
		catch(Exception e)
		{System.out.println(e);}
	}

}

public class GM
{
	public static void main(String args[])
	{
		comms c=new comms();
		c.com();
	}
}