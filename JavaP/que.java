package mypack.queue;
public class que
{
	int arr[]=new int[32];
	int front=-1,rear=-1;
	public void enqueue(int item) 
	{
   	 	if(front==-1&&rear==-1)
		{
			front=rear=0;
		}
		arr[rear++]=item;
	}
	public int dequeue()
	{	
		return(arr[front++]);
	}
	public void isfull()
	{
		if (rear==31)
		{
			System.out.println("Queue is full");
		}
	}
	public void isempty()
	{
		if(front==-1|front==rear)
		{
			System.out.println("Queue empty");
		}
	}
	public void disp()
	{
		int i;
		for(i=front;i<rear;i++)
		{
			System.out.print("\t"+arr[i]);
		}
	}	
}