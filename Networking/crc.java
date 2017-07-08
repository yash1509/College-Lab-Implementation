import java.io.*;
class crc
{
	public static void main(String args[]) throws IOException
	{
		int ms,ks,len,c=0; int[] mes,temp,key,rem,crc;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of data bits");
		ms=Integer.parseInt(br.readLine());
		mes=new int[ms];
		System.out.println("Enter data bits ");
		for(int i=0;i<ms;i++)
			mes[i]=Integer.parseInt(br.readLine());
		System.out.println("Enter number of bits in divisor ");
		ks=Integer.parseInt(br.readLine());
		key=new int[ks];	
		System.out.println("Enter Divisor bits");
		for(int i=0;i<ks;i++)
			key[i]=Integer.parseInt(br.readLine());
		len=ms+ks-1;
		temp=new int[len]; rem=new int[len]; crc=new int[len];
		
		for(int i=0;i<mes.length;i++)
			temp[i]=mes[i];
		for(int j=0;j<rem.length;j++)
			rem[j]=temp[j];

		while(true)
		{
			for(int i=0;i<key.length;i++)
				rem[c+i]=(rem[c+i]^key[i]);
			while(rem[c]==0 && c!=rem.length-1)
				c++;
			if((rem.length-c)<key.length)
				break;
		}

		System.out.println("Remainder = ");
		for(int i=0;i<rem.length;i++)
			System.out.print(rem[i]);
		System.out.println(" ");
		System.out.println();
		for(int i=0;i<temp.length;i++)
			crc[i]=temp[i]^rem[i];
		System.out.println("CRC :");
		for(int i=0;i<crc.length;i++)
		System.out.print(crc[i]);
	
	}
}
