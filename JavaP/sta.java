package mypack.stack;
public class sta
{
	int arr[]=new int[32];
	int top=-1;
	public void push(int item) 
	{
   	 	arr[++top]=item;
	}
	public int pop()
	{	
		return(arr[top--]);
	}
	public void isfull()
	{
		if (top==31)
		{
			System.out.println("Stack is full");
		}
	}
	public void isempty()
	{
		if(top==-1)
		{
			System.out.println("Stack empty");
		}
	}
	public void disp()
	{
		int i=0;
		for(i=0;i<=top;i++)
			System.out.print("\t"+arr[i]);
	}
}