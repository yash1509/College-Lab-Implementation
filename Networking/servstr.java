import java.io.*;
import java.net.*;

public class servstr
{
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
			String sop="Menu :- 1)Reverse 2)Substring 3)Count no of char";
			dout.writeUTF(sop);
			dout.flush();
			do
			{
				rec=(String)dis.readUTF();
				if(fl==0)
				{
					ch=Integer.parseInt(rec);
					fl=1;	
				}
				else if(fl==1)
				{
					fl=2; 
					in1=rec;	
				}
				else if(fl==2)
				{
					fl=3;
					if(rec.equals("no"))
						n2=0;	
					else
						in2=rec;
				}
				else if(fl==3)
				{
					if(ch==1)
					{
						StringBuilder pp1 = new StringBuilder();
						pp1.append(in1);
						pp1=pp1.reverse(); 
						for (i=0;i<pp1.length();i++)
						{	op=String.valueOf(pp1.charAt(i));
							dout.writeUTF(op);		}	
						flag1=4; fl=4;			
					}
					else if(ch==2)
					{
						String message="Does S1 Contains S2 - ";
						String r1=String.valueOf(in1.contains(in2));
						dout.writeUTF(message+r1);
						fl=4;
					}
					else if(ch==3)
					{
						String message="Length - ";
						in3=String.valueOf(in1.length());
						dout.writeUTF(message+in3);
						fl=4;
					
					}
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