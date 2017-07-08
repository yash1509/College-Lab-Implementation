import java.io.*;
class AgeVerification extends Exception
{
	AgeVerification(String s)
	{	super(s);		}
} 

class vote
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Enter your age : - "); 
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		int age=Integer.parseInt(obj.readLine());
		try{
		if(age<18)
		{
			throw new AgeVerification("Invalid age");
		}
		else
		{
			System.out.println("Your eligible to vote");
		}}
		catch(AgeVerification e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("You are a minor");
		}
	}
}