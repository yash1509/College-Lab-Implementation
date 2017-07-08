import java.io.*;
import java.net.*;

class serverfp
{
	public static void main(String args[])throws IOException
	{
	try
	{
		ServerSocket servsock=new ServerSocket(1105);
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the name of file to be transferred : ");
		String fil=dis.readLine();
		System.out.println(fil+" :is being transferred");
		File myfile=new File(fil);
		while(true)
		{
			Socket sock=servsock.accept();
			byte[] mybytearray=new byte[(int)myfile.length()];
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(myfile));
			bis.read(mybytearray,0,mybytearray.length);
			OutputStream os=sock.getOutputStream();
			os.write(mybytearray,0,mybytearray.length);
			os.flush();
			sock.close();
		}
	}
	catch(Exception e)
	{
	System.out.print(e);
	}
	}

}