class thre extends Thread
{
	public void run()
	{
		for(int i=0;i<6;i++)	
		{System.out.println(i);
		  try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  }	
	}
}

class threa
{
	public static void main(String args[])
	{
		thre t1=new thre();
		thre t2=new thre();
		t1.start();
		t2.start();
	}
}