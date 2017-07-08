import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class server
{
	public static void main(String args[])
	{
		try{
		String s="Enter a Reg No.:"; String rec="a"; String store="a";	String er="Not found in the file.";	
		ServerSocket ss=new ServerSocket(6789);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//s=br.readline();
		Socket s1=ss.accept();
		DataInputStream dis=new DataInputStream(s1.getInputStream());
		DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
		while(true)
		{	TimeUnit.MILLISECONDS.sleep(10);
			Date d=new Date();
			dout.writeUTF(d.toString());
		}
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
