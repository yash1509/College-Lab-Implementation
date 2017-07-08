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
		rec=(String)dis.readUTF();
		System.out.println("Server: "+rec);
		s=br.readLine();		
		dout.writeUTF(s);
		dout.flush();
		rec=(String)dis.readUTF();
		System.out.println(rec);
		dout.close();
		s2.close();
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
