import java.io.*;
class Checkargu extends Exception
{
	Checkargu(String s)
	{
		super(s);
	}
}

class checkargumain
{
	public static void main(String args[])
	{
		int arr[]=new int[4];
		int ch=0; int i=0;
	try{
		if(args.length<5)
		{
			throw new Checkargu("Need 5 argument");
		}
		else
		{
			int a=Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4]);
			System.out.println(a);
		}
	}
		catch(Checkargu e)
		{
			System.out.println(e);
		}
								 			
	}	
}