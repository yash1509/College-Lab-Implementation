import java.io.*;
class swi
{
	swi()throws IOException
	{	int l;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of l between 0 and 4");
		l=Integer.parseInt(obj.readLine());
		switch(l)
		{
			case 1:
				System.out.println("Result is: "+l);
				break;
			case 2:
				System.out.println("Result is: "+l);
				break;
			case 3:
				System.out.println("Result is: "+l);
				break;
			case 4:
				System.out.println("Result is: "+l);
				break;
			default: System.out.println("Wrong choice");
				break;
		}
	}
}

class switchclass
{
	public static void main(String args[])throws IOException
	{
		System.out.println("The program executes as such:");
		swi obj1=new swi();
	}
}		