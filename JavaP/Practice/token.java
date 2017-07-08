import java.io.*;
import java.util.*;
class token
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name,age,address");
		String s=obj.readLine();
		StringTokenizer obj1=new StringTokenizer(s,",");
		String s1=obj1.nextToken();
		String s2=obj1.nextToken();
		String s3=obj1.nextToken();
		s1=s1.trim();
		s2=s2.trim();
		s3=s3.trim();
		String name=s1;
		int age=Integer.parseInt(s2);
		String address=(s3);
		System.out.println((name)+"\t"+(age)+"\t"+(address));
	}
}