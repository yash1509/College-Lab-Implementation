class thre extends Thread
{
	public void run()
	{
		for(int i=0;i<6;i++)	
		{System.out.println(i);
		  try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  }	
	}
}

class thre1 extends Thread
{
	public void run()
	{
		for(int i=10;i<15;i++)	
		{System.out.println(i);
		  try{Thread.sleep(100);}catch(InterruptedException e){System.out.println(e);}  }	
	}
}

class thre2 extends Thread
{
	public void run()
	{
		for(int i=100;i<106;i++)	
		{System.out.println(i);
		  try{Thread.sleep(300);}catch(InterruptedException e){System.out.println(e);}  }	
	}
}


class multhre
{
	public static void main(String args[])
	{
		thre t1=new thre();
		thre1 t2=new thre1();
		thre2 t3=new thre2();
		t1.start();
		t2.start();
		t3.start();
	}
}