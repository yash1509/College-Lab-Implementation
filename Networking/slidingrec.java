import java.net.*; 
import java.io.*; 
class slidingrec
{ 
	public static void main(String a[])throws Exception 
	{
		int i=0,j=0,c=0,k=-1,numb,winsiz=10; 
		String temp[]=new String[10]; String opt;
		Socket s=new Socket(InetAddress.getLocalHost(),98);
		DataInputStream in=new DataInputStream(s.getInputStream()); 
		PrintStream p=new PrintStream(s.getOutputStream());  
		System.out.println(); 
		do 
		{ 
			numb=Integer.parseInt(in.readLine()); 
			if(numb<=winsiz-1) 
			{ 
				for(i=1;i<=numb;i++) 
				{
					k=++k%10; 
					temp[k]=in.readLine(); 
					System.out.println("Frame "+k+" : "+temp[k]); 
				} 
				winsiz=winsiz-numb; 
				System.out.println("\nAck sent\n"); 
				p.println(k+1); 
				winsiz=winsiz+numb; 
			} 
			else 
				break; 
			opt=in.readLine(); 
		} 
		while(opt.equals("Y")); 
	} 
}