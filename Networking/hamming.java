import java.io.*;
import java.util.*;
public class hamming
{
	public static void main(String args[])
	{
		int i=0,j=0,d=0;
		Scanner sc=new Scanner(System.in);
		int[] dat=new int[4];
		int[] cod=new int[7];
		System.out.println("Enter 4 bit dataword");
		for(i=0;i<4;i++)
		{
			dat[i]=sc.nextInt();	
		}
		int par[]=new int[3];
		par[0]=dat[0]^dat[1]^dat[3];
		par[1]=dat[0]^dat[2]^dat[3];
		par[2]=dat[1]^dat[2]^dat[3];
		cod[0]=par[0];
		cod[1]=par[1];
		cod[2]=dat[0];
		cod[3]=par[2];
		cod[4]=dat[1];
		cod[5]=dat[2];
		cod[6]=dat[3];
		System.out.println("Codeword is : ");
		for(i=0;i<7;i++)
		{
			System.out.print(cod[i]+" ");
		}

		System.out.println("Recieved codeword is :");
		int rec[]=new int[7];
		for(i=0;i<7;i++)
		{
			rec[i]=sc.nextInt();
		}
		int[] p=new int[3];	int[] ch=new int[4];
		int[] r=new int[4];
		p[0]=rec[0];
		p[1]=rec[1];
		r[0]=rec[2];
		p[2]=rec[3];
		r[1]=rec[4];
		r[2]=rec[5];
		r[3]=rec[6];
		ch[0]=p[0]^rec[0]^rec[1]^rec[3];
		ch[1]=p[1]^rec[0]^rec[2]^rec[3];
		ch[2]=p[2]^rec[1]^rec[2]^rec[3];
		d=(ch[0]*1)+(ch[1]*2)+(ch[2]*4);
		if(d==0)
		System.out.println("No error");
		else
		{
			System.out.println("Error is at "+d);
			if(r[d-1]==0)
				r[d-1]=1;
			else
				r[d-1]=0;
		}
		System.out.println("Corrected code word is :");
		for(i=0;i<11;i++)
		System.out.print(r[i]+" ");
		System.out.println();
	}
}