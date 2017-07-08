import java.io.*;
import java.util.Arrays;
class dna
{
	public static void main(String args[])throws IOException
	{
		int c=0, i;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		String arr[]=new String[10];
		int a[]=new int[10];
		System.out.println("Note - Enter 25 Lenght of DNA sequence (Hint - Use any of the g,a,c,t)");
		for(int k=0;k<10;k++)
		{
			arr[k]=obj.readLine();
		}
		String key="tata";
		 for(int j=0; j<arr.length;j++)
		 {
			int na=j;
			int l=arr[j].indexOf(key);
  		  	if(l>0)
			{	
				c++;
				while(l!=-1)
				{	
					int n=l+1;
					if(l<arr[j].length())
					{
						l=arr[j].indexOf(key,n);
						if(l>0)
						{
						c++;
						}
					
					}
					
				}
				
				a[na]=c;
			}
			else
			{	c=0;
				a[na]=c; }
				
		}
		System.out.println("\n \n \n"+"After sorting"+"\n \n");
		for(i=0;i<10;i++)
		{
			if(a[i]==6)
				System.out.println(arr[i]);
		}
		for(i=0;i<10;i++)
		{
			if(a[i]==5)
				System.out.println(arr[i]);
		}
		for(i=0;i<10;i++)
		{
			if(a[i]==4)
				System.out.println(arr[i]);
		}
		for(i=0;i<10;i++)
		{
			if(a[i]==3)
				System.out.println(arr[i]);
		}
		for(i=0;i<10;i++)
		{
			if(a[i]==2)
				System.out.println(arr[i]);
		}
		for(i=0;i<10;i++)
		{
			if(a[i]==1)
				System.out.println(arr[i]);
		}
		for(i=0;i<10;i++)
		{
			if(a[i]==0)
				System.out.println(arr[i]);
		}	
	}
}

		