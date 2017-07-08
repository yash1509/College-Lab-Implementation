import java.io.*;
class L
{
	protected static int a =5,b=2;
}
class M extends L
{
	
	int c=a+b;
	
}
class N
{
	L ob1=new L();
	int d=ob1.a+ob1.b;
}
class Nar
{
	public static void main(String args[])
	{
		M ob=new M();
		int d=ob.a+ob.a;
		System.out.println(d);
		N ob3=new N();
		System.out.println(ob3.d);
	}
}
			