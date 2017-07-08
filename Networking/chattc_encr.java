import java.io.*;
import java.net.*;
import java.util.*;
import java.math.*;
import javax.crypto.*;
import java.security.*;
import javax.crypto.spec.*;

public class chattc_encr
{
	
	public static void main(String args[])
	{
		try
		{
			String send,r,strKey="asheleon",strData;
			BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
			Socket s1=new Socket("localhost",6789);
			DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
			DataInputStream dis=new DataInputStream(s1.getInputStream());
			do
			{	send=k.readLine();
				try {
				SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
				Cipher cipher=Cipher.getInstance("Blowfish");
				cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
				byte[] encrypted=cipher.doFinal(send.getBytes());
				strData=new String(encrypted);
			} 
			catch (Exception e) {
				e.printStackTrace();
				throw new Exception(e);
			}
				dout.writeUTF(strData);
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