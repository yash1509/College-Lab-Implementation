import java.io.*;
import java.net.*;

public class chats
{
	public static void main(String args[])
	{
		try
		{
			String rec;
			BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
			ServerSocket ss=new ServerSocket(6789);
			System.out.println("Server starting");
			Socket s=ss.accept();
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			do
			{
				rec=(String)dis.readUTF();
				System.out.println(rec);
				String send=k.readLine();
				dout.writeUTF(send);
				dout.flush();
				//dout.close();
			}while(!(rec.equals("exit")));
			System.out.println("Server Closing");
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}