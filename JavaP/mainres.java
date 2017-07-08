class res extends Thread
{
	static int avail,want;
	res()
	{
	}
	res(int a,int b)
	{
		avail=a;
		want=b;
	}
	public void run()
	{
		avail=avail-want;
		if(avail>0)
		{
			
			System.out.println("You got the seat.");
		}
		else
		{
			System.out.println("Sorry no seat available.");
		}
		try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
	}
}

class mainres
{
	public static void main(String args[])
	{
		res t1=new res(3,1);
		res t2=new res(3,2);
		res t3=new res(3,3);
		t1.start();
		t2.start();
		t3.start();
		
	}
}