import java.io.*;
class iter
{
	iter(int l)
	{	int i=0;
		System.out.println("Pass is :");
		for(i=0;i<=l;i++)
			System.out.print("\t"+i);
	}
}

class iterative
{
	public static void main(String args[])throws IOException
	{	int l;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Constructor shows: ");
		iter mine=new iter(l=Integer.parseInt(obj.readLine());
	}
}