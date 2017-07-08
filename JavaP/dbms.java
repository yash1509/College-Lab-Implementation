import java.io.*;
class check extends Exception
{
	check(String s)
	{
		super(s);
	}
}		
class dbms
{
	public static void main(String args[])
	{	int i=0;
		System.out.println("Enter your name and marks of six subjects");
		try{
			for(i=1;i<7;i++)
			{	if(Integer.parseInt(args[i])<0|Integer.parseInt(args[i])>50)
					throw new check("Mark entered is invalid");
			}
				float sum=Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4])+Integer.parseInt(args[5])+Integer.parseInt(args[6]);
				float per=sum/6;
				System.out.println("Total marks =  "+sum);
				System.out.println("Percentage = "+per);
		   }
		catch(check e)
		{
			System.out.println(e);
		}
		
	}		
}