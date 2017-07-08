import java.rmi.*;
public class Strserv
{
	Strserv()
	{
		try
		{
			Str s= new Strrun();
			Naming.rebind("rmi://localhost:1099/Strs",s);
		}
		catch(Exception e){
			System.out.println("Exception is : "+e);
		}
	}
	public static void main(String args[])
	{
		new Strserv();
	}
}