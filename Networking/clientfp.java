import java.io.*;
import java.net.*;
class clientfp
{
	public static void main(String svi[])throws IOException
	{
		try
		{
			Socket sock=new Socket("localhost",1105);
			byte[] bytearray=new byte[1024];
			InputStream is=sock.getInputStream();
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter the file name for the data be saved in: ");
			String fil=dis.readLine();
			FileOutputStream fos=new FileOutputStream(fil);
			BufferedOutputStream bos=new  BufferedOutputStream(fos);
			int bytesread=is.read(bytearray,0,bytearray.length);
			bos.write(bytearray,0,bytesread);
			System.out.println("File Received");
			bos.close();
			sock.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}