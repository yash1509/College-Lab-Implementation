import java.util.*;
import java.lang.*;
interface inter
{
	
	void cal();
}
class B implements inter
{
	public void cal()
	{	int a=1,b=6;
		int c=a+b;
		System.out.println(c);
	}
}
class interface1
{
	public static void main(String args[])
	{
		inter obj=new B();
		obj.cal();
	}
}