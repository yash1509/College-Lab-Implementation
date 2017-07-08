import java.io.*;
import java.net.*;

public class servcom
{
	
	public static String opg(String s1)
	{
		String co=null;
		File file=new File(s1); 
		FileReader reader=null;
		try
		{
			reader=new FileReader(file);
			char[] ch= new char[(int)file.length()];
			reader.read(ch);
			co = new String(ch);
			reader.close();
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
    		}
		
		return co;

	}
	public static void main(String args[])
	{
		try
		{
			int men=0,ch=2,n1=0,n2=0,resu=0,res1=0,i=0,j=0,flag1=0,fl=0; String rec; int count = 0;
			String in1="a",in2="a",in3="a",in4,op="a";
			BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
			ServerSocket ss=new ServerSocket(6789);
			System.out.println("Server starting");
			Socket s=ss.accept();
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String sop="Your will, my command Master!";
			in4="Read which file?";
			dout.writeUTF(sop);
			dout.flush();
			do
			{
				rec=(String)dis.readUTF();
				if(rec.equals("read"))
				{
					fl=1;
					dout.writeUTF(in4);
				}
				else if(fl==1)
				{
					in1=rec;
					in3=opg(in1);
					dout.writeUTF(in3);
					fl=2;	
				}
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