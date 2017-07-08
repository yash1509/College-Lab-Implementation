import java.io.*;
import java.net.*;

public class chattc
{
	public static void main(String args[])
	{
		try
		{
			String send,r;
			BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
			Socket s1=new Socket("localhost",6789);
			DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
			DataInputStream dis=new DataInputStream(s1.getInputStream());
			do
			{	send=k.readLine();
				dout.writeUTF(send);
				dout.flush();
				r=(String)dis.readUTF();
				System.out.println("Server"+" - "+r);
				//dout.close();
			}while(!(send.equals("exit")));
			s1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}