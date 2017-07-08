import java.rmi.*;
public class Calserv
{
	Calserv()
	{
		try
		{
			Cal c= new Calrun();
			Naming.rebind("rmi://localhost:1099/Cals",c);
		}
		catch(Exception e){
			System.out.println("Exception is : "+e);
		}
	}
	public static void main(String args[])
	{
		new Calserv();
	}
}