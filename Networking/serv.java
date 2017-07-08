import java.io.*;
import java.net.*;

public class serv
{
	public static void main(String args[])
	{
		try
		{
			int men=0,ch=2,n1=0,n2=0,resu=0,res1=0,i=0,j=0,flag1=0,fl=0; String rec;
			BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
			ServerSocket ss=new ServerSocket(6789);
			System.out.println("Server starting");
			Socket s=ss.accept();
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String sop="Menu :- 1)Add 2)Sub 3)Multiply 4)Divide 5)Mod 6)Factorial";
			String s1="Enter 1st operand";
			String s2="Enter 2nd operand";
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
					n1=Integer.parseInt(rec);	
				}
				else if(fl==2)
				{
					fl=3;
					if(rec.equals("no"))
						n2=0;	
					else
						n2=Integer.parseInt(rec);
				}
				else if(fl==3)
				{
					
					if(ch==1)
					{
						resu=n1+n2;
						flag1=4; fl=4;			
					}
					else if(ch==2)
					{
						resu=n1-n2; flag1=4; fl=4;
					}
					else if(ch==3)
					{
						resu=n1*n2; flag1=4; fl=4;
					}
					else if(ch==4)
					{
						resu=n1/n2; flag1=4; fl=4;
					}
					else if(ch==5)
					{
						resu=n1%n2; flag1=4; fl=4;
					}
					else if(ch==6)
					{	resu=1; res1=1;
						for(i=1;i<=n1;i++)
							resu*=i;
						//for(j=1;j<=n2;j++)
						//	res1*=i;
						flag1=2; fl=4;
					} 

				}
				if(flag1==4)
				{
					String message="The result is - ";
					String r1=String.valueOf(resu);
					dout.writeUTF(message+r1);
					flag1=6;		
				}
				else if(flag1==2)
				{
					String message="The results are - ";
					String r1=String.valueOf(resu);
					//String r2=String.valueOf(res1);
					dout.writeUTF(message+r1);		
					flag1=6;
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