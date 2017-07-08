class excepttest
{

	public static void main(String args[])
	{	
	try
	{
			int z=50/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("0 can not be entered due to :"+e);
	}
	finally
	{
		System.out.println("Try again");
	}
	int y=5;
	int y1=y*y;
	System.out.println(y1);
	System.out.println("this works");
	}
}

		