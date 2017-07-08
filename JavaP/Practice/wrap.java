import java.io.*;
import java.lang.*;
class wrap
{
	public static void main(String args[])
	{
		int i=50;
		double r=56.2;
		Integer obj1=new Integer(i);
		Double obj2=new Double(r);
		
		System.out.println("Wrapped classes display: ");
		System.out.println(obj1);
		System.out.println(obj2);
		
		int n;
		n=obj1.intValue();
		double k;
		k=obj2.doubleValue();
	
	
		System.out.println("Unwrapped classes display: ");
		System.out.println(n);
		System.out.println(k);
	}
}