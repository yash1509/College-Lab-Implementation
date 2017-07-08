import java.io.*;
import mypack.stack;
import mypack.queue;
class stqu
{
	public static void main(String args[])
	{
		sta o1=new sta();
		que o2=new que();
		int a=50,b=60,c=3,d=8;
		o1.push(a); o1.push(b); o1.push(c); o1.push(d);
		System.out.println("The stack is : ");
		o1.disp();
		System.out.println("After popping : ");
		int k=o1.pop(); int l=o1.pop();
		o1.disp();
		o2.enqueue(a);o2.enqueue(b);o2.enqueue(c);o2.enqueue(d);
		System.out.println("The queue is : ");
		o2.disp();
		int j=o2.dequeue();
		System.out.println("After dequeue : ");
		o2.disp();
	}
}
		
		
			