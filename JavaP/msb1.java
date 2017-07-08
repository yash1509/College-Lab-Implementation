import java.io.*;
class msb1
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Please enter a number");
		int m;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));	
		m=Integer.parseInt(obj.readLine());
		System.out.println("The number entered is:" +m);
		System.out.println("The number in binary form is:" +Integer.toBinaryString(m));
		int temp=0; int arr[]=new int[32]; int i=0; int count=0; int sum=0;
		temp=m;
		while(m!=0)
		{	
			arr[i++]=m%2;
			m=m/2;
			count++;
			
		}
		for(i=count;i<32;i++)
			arr[i]=0;
		int arr2[]=new int[32]; int k=0;
		for(i=31;i>=0;i--)
		arr2[k++]=arr[i];
		if(arr2[0]==0)
			arr2[0]=1;
		
		
		
		int c=30; int j=2;
		for(i=1;i<32;i++)
		{
			sum=(int)(sum+(arr2[i]*(Math.pow(j,c--))));
			
			
		}
		if(temp>0)
		System.out.println("The number after msb change is: -" +sum);
		if(temp<0)
		System.out.println("The number after msb change is: " +temp);
	}
}		