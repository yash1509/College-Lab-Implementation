import java.io.*;
import java.net.*;

public class client 
{
	public static void main(String args[])
	{
		int i=0; int j=0; int port; 
		int ports[]=new int[66000];
			for(i=0;i<65536;i++)
			{
				try{
				new ServerSocket(i).close();
				System.out.println(i+": available");
				}
				catch(Exception e)
				{
					System.out.println(i+": unavailable");
				}
			}
	}

}
