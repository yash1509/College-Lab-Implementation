import java.io.*;
import java.net.*;
class comms
{
	void com()
	{
			try{
				URL url=new URL("http://www.javatpoint.com/java-tutorial");
				URLConnection urlcon=url.openConnection();
				InputStream stream=urlcon.getInputStream();
				int i;
				while((i=stream.read())!=-1)
				{
				System.out.print((char)i);
				}
			}
			catch(Exception e)
			{System.out.println(e);}
	}

}

public class test1
{
	public static void main(String args[])
	{
		comms c=new comms();
		c.com();
	}
}