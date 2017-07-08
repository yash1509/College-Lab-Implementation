import java.io.*;
class arth
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Please enter two numbers");
		int a,b,c,d,e,f,g,h;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		a=Integer.parseInt(obj.readLine());
		b=Integer.parseInt(obj.readLine());
		
		System.out.println("The addition is :");
		c=a+b;
		System.out.println(c);
		
		System.out.println("The subtraction is :");
		d=a-b;
		System.out.println(d);
		
		System.out.println("The division results :");
		e=a/b;
		System.out.println(e);
		
		System.out.println("The mod of is :");
		f=a%b;
		System.out.println(f);
		
		System.out.println("The left shift operator on first number is :");
		g=a<<2;
		System.out.println(g);
		
		System.out.println("The right shift fill zero operator on the number results in :");
		h=a>>>b;
		System.out.println(h);
	}
}