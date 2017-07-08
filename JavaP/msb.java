import java.io.*;
class msb
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Please enter a number");
		int m;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));	
		m=Integer.parseInt(obj.readLine());
		System.out.println("The number entered is:" +m);
		System.out.println("The number in binary form is:" +Integer.toBinaryString(m));
		int temp=0; int arr[]=new int[32]; int i=0; int count=0;
		
		while(m!=0)
		{	
			arr[i++]=m%2;
			m=m/2;
			count++;
		}
		
		int arr2[]=new int[32]; int k=0;
		if(arr[count]==0)
			arr[count]=1;
		for(i=count;i>0;i--)
			arr2[k++]=arr[i];
		for(i=0;i<count;i++)
			System.out.print(arr2[i]);	
		int sum=0;int c=count;
		for(i=0;i<count-1;i++)
		{	if(c!=0)
			sum=sum+arr2[i]*(2*c--);
			else
			sum=sum+arr2[i]*(2*c+1);
		}
		System.out.println("The number after msb change is:" +sum);
		
	}
}