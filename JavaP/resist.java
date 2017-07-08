import java.io.*;
class resist
{
	public static void main(String args[])throws IOException
	{	
		float r1=0,r2=0,r=0,t1=0,t2=0;
		System.out.println("Enter the two value of resistance used for parallel circuit equivalent resistance calculation respectively :  ");
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		r1=Float.parseFloat(obj.readLine());
		r2=Float.parseFloat(obj.readLine());
		t1=r1*r2;
		t2=r1+r2;
		r=t1/t2;
		System.out.println("The equivalent resistance is : "+r);	
	}
}