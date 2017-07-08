import java.io.*;
import java.net.*;
import java.util.*;

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
		dout.writeUTF(s);
		dout.flush();
		rec=(String)dis.readUTF();
		String co=null;
			try
			{
				File file=new File("file.txt");
				FileReader fr=new FileReader(file);
			//char[] ch=new char[(long)file.length()];
			//fr.read(ch);
			//co=new String(ch)
				final Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) 
				{
	   				final String lineFromFile = scanner.nextLine();
	   				if(lineFromFile.contains(rec)) 
					{
						store=lineFromFile;
						store=store.replaceAll("\\d","");
						dout.writeUTF(store);
	       					break;
					}
				}
				dout.writeUTF(er);
				dout.close();
				s1.close();
			}
			catch(Exception e)
			{System.out.println(e);}
			
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
