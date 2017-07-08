import java.io.*;
class arraytest
{
	public static void main(String args[])throws IOException
	{	int i,n;
		int arr[]=new int[10];
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the lim of 1d array");
		n=Integer.parseInt(obj.readLine());
		for(i=0;i<n;i++)
		{arr[i]=Integer.parseInt(obj.readLine());}
		System.out.println("The array is: ");
		for(i=0;i<n;i++)
		{System.out.println(arr[i]);}
	}
}
		