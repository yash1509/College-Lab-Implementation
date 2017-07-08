import java.io.*;

class ReadData
{
	public static void main(String args[ ])
	{

		try
		{

			//create the object of the input Stream reader class 

InputStreamReader ir=new InputStreamReader(System.in);
/*create the object of ther Buffered Reader class*/ 
			
			BufferedReader br=new BufferedReader(ir);

			String s;


			System.out.println("Enter the lines of text : Press END to end input ");

			do 
			{

				s=br.readLine();
	
				System.out.println("Your Entered :"+s);

			}while(s.compareTo("END")!=0);

		}
		catch(Exception e)
		{
			System.out.println("Exeption :"+e);
		}
	}
}		
