import java.io.*;
import divide.divtest;
class division
{
	public static void main(String args[])throws IOException
	{
	BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
	int d=Integer.parseInt(obj.readLine());
	int c=Integer.parseInt(obj.readLine());
	divtest obj1=new divtest();
	obj1.divi(d,c);
	}
}