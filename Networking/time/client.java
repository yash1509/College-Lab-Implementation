import java.io.*;
import java.net.*;

public class client 
{
	public static void main(String args[])
	{
		try{
		String rec="a"; String send="a"; String s="a";		
		Socket s2=new Socket("127.0.0.1",6789);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataInputStream dis=new DataInputStream(s2.getInputStream());
		DataOutputStream dout=new DataOutputStream(s2.getOutputStream());
		int i=0;
		while(true)
		{		
			rec=(String)dis.readUTF();
			System.out.println("Server: "+rec);
			i++;
			if(i>1000)
				System.exit(0);
		}
		
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
