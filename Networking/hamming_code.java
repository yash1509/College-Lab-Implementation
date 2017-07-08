import java.io.*;
import java.util.*;
class hamming_code
{
	static int calp(int a[])
	{
		int c=0;
		int l=a.length;
		for(int i=0;i<l;++i)
		if(a[i]==1)
		++c;
		if((c%2)==0)
			return 0;
		else
			return 1;
	}
	public static void main(String args[])
	{
		int n=4,k=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter 4 data bits ");
		int d[]=new int[4];
		for(int i=n-1;i>=0;--i)
		{
			d[i]=scr.nextInt();
		}
		while(Math.pow(2,k)<(n+k+1))	
			++k;
		int p[]=new int[k]; 
		int ham[]=new int[n+k+1];

		for(int i=0;i<7;++i)
			ham[i]=-1;

		int count=0;
		int c=2;
		while(count<4)
		{
			++c;
			if(c==4)
				continue;
			ham[c]=d[count];
			++count;
		}
		int p1[]={ham[1],ham[3],ham[5],ham[7]};
		int p2[]={ham[2],ham[3],ham[6],ham[7]};
		int p3[]={ham[4],ham[5],ham[6],ham[7]};
		int parity[]=new int[3];
		parity[0]=calp(p1);
		parity[1]=calp(p2);
		parity[2]=calp(p3);
		ham[1]=parity[0];
		ham[2]=parity[1];
		ham[4]=parity[2];
		System.out.print("\nThe Hamming code is \n");
		for(int i=1;i<n+k+1;i++)
			System.out.print(ham[i]+" ");

		System.out.println("\nEnter recieved code");
		for(int i=1;i<8;i++)
			ham[i]=scr.nextInt();
		int p4[]={ham[1],ham[3],ham[5],ham[7]};
		int p5[]={ham[2],ham[3],ham[6],ham[7]};
		int p6[]={ham[4],ham[5],ham[6],ham[7]};

		parity[0]=calp(p4);
		parity[1]=calp(p5);
		parity[2]=calp(p6);

		int position=(int)(parity[2]*Math.pow(2,2)+parity[1]*Math.pow(2,1)+parity[0]*Math.pow(2,0));
		System.out.println("Error at position "+position);
		if(ham[position]==1)
			ham[position]=0;
		else
			ham[position]=1;

		System.out.print("Recorrected code is ");
		for(int i=1;i<8;i++)
			System.out.print(ham[i]+" ");
	}
}
