import java.io.*;
import java.util.*;
class ran
{
	public static void main(String args[])
	{	
		float sum=0; float avg=0; float c=0;
		Random r=new Random();
		System.out.println("The six random values are: ");
		for(int i=1;i<7;i++)
		{
			int random=r.nextInt(20);
			
			sum+=random;
			c++;
			for(int j=1;j<=c;j++)
			System.out.print("*");
			System.out.print(" "+random+"\n");
		}
		System.out.println("\nThe sum is"+sum);
		avg=sum/c;
		System.out.println("The average is"+avg);
	}
}