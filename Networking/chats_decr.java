import java.io.*;
import java.net.*;
import java.util.*;
import java.math.*;
import javax.crypto.*;
import java.security.*;
import javax.crypto.spec.*;
public class chats_decr
{
	public static void main(String args[])
	{
		try
		{
			String rec,strData,strKey="asheleon";
			BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
			ServerSocket ss=new ServerSocket(6789);
			System.out.println("Server starting");
			Socket s=ss.accept();
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			do
			{
				rec=(String)dis.readUTF();
				try {
					SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
					Cipher cipher=Cipher.getInstance("Blowfish");
					cipher.init(Cipher.DECRYPT_MODE, skeyspec);
					byte[] decrypted=cipher.doFinal(rec.getBytes());
					strData=new String(decrypted);
		
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception(e);
				}
				System.out.println(strData);
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