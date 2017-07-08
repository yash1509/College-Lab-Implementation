import java.rmi.*;
public class Strcli
{
	public static void main(String args[])
	{
		try
		{
			String cou="Asheleon";
			Str c=(Str) Naming.lookup("//127.0.0.1:1099/Strs");
			System.out.println("Reverse: "+c.rev("Ashe"));
			System.out.println("Count of "+cou+" : "+c.count("Asheleon"));
		}
		catch(Exception e)
		{ System.out.println(e);}
	}
}