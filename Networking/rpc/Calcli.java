import java.rmi.*;
public class Calcli
{
	public static void main(String args[])
	{
		try
		{
			Cal c=(Cal) Naming.lookup("//127.0.0.1:1099/Cals");
			System.out.println("Addition: "+c.add(2,3));
			System.out.println("Subtraction: "+c.sub(5,3));
			System.out.println("Multiplication: "+c.mul(2,3));
			System.out.println("Division: "+c.div(8,2));
		}
		catch(Exception e)
		{ System.out.println(e);}
	}
}