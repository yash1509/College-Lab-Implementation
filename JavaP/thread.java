class threimpl implements Runnable
{
	
	public void run()
	{
		for(int i=1;i<6;i++)
		System.out.println(i);
	}
}
class thread
{
	public static void main(String args[])
	{
		threimpl ob=new threimpl();
		Thread t=new Thread(ob);
		t.start();
	}
}
		