import java.net.*;
import java.io.*;
public class slidingcli
{
	public static void main(String a[])throws Exception
	{
		String temp[]=new String[10];
		String opt; int i=0,j=0,track=0,k,l,winsiz=10;
		ServerSocket ser=new ServerSocket(98);
		Socket s=ser.accept();
		DataInputStream in=new DataInputStream(System.in);
		DataInputStream in1=new DataInputStream(s.getInputStream());
		do
		{
			PrintStream p=new PrintStream(s.getOutputStream());
			System.out.print("Enter no of frames : ");
			k=Integer.parseInt(in.readLine());
			p.println(k);
			if(k<=winsiz-1) 
			{
				System.out.println("Enter Data to be sent:\n"); 
				for(i=1;i<=k;i++) 
				{ 
					temp[track]=in.readLine(); 
					p.println(temp[track]); 
					track=++track%10; 
				} 
				winsiz=winsiz-k; 
				l=Integer.parseInt(in1.readLine()); 
				System.out.print("Ack received for "+l+" frames"); 
				System.out.println(); 
				winsiz=winsiz+k; 
			} 
			else 
			{ 
				System.out.println("No. of frames exceeds window size"); 
				break; 
			} 
			System.out.print("\nMore frames? Y|n "); 
			opt=in.readLine(); 
			p.println(opt); 
		}while(opt.equals("Y")); 
		s.close(); 
	}
}