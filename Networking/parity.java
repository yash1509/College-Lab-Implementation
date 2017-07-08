import java.io.*;
public class parity
{
	public static void main(String args[]) throws IOException
	{
		String a; int arr[]=new int[20]; int n=0,i=0,c=0,flag=0;
		System.out.println("Even Parity Bit Generator");
		System.out.println(" ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of string");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter Dataword");
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]==1)
				c++;
		}	
		if(c%2==0)
		{	arr[n]=1; flag++;	}
		else
			arr[n]=0;
		System.out.println("The codeword is : ");
		if(flag==1)
			System.out.println("Parity bit -1");
		else
			System.out.println("Parity bit -0");
		for(i=0;i<=n;i++)
			System.out.print(arr[i]);
	}
}
