import java.io.*;
import java.net.*;

public class chatts extends Thread
{
	public static Socket s=null;
	public static ServerSocket ss=null;
	public void run()
	{
		
		try
		{
			System.out.println("New Client just entered");
			String rec;
			BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			long id= Thread.currentThread().getId();
			do
			{
				
				rec=(String)dis.readUTF();
				System.out.println("User "+id+" IP CLient - "+ s.getRemoteSocketAddress()+" Message - "+rec);
				String send=k.readLine();
				dout.writeUTF(send);
				dout.flush();
				//dout.close();
			}while(!(rec.equals("exit")));
			System.out.println("User "+id+" is gone.");
			Thread t1=new Thread(this);
			//ss.stop();
			
		}
		catch(Exception e)
		{ System.out.println(e);}
	}
	public static void main(String args[])
	{
		
		try{ ss=new ServerSocket(6789); } catch(Exception e) {System.out.println(e);}
		System.out.println("Server starting"); int i=0;
		while(i<3)
		{	
			try
			{
				s=ss.accept();	
				chatts ch=new chatts();
				ch.start();
				i=i+1;
			}
			catch(Exception e)
			{System.out.println(e);}
		}
		
	}
}