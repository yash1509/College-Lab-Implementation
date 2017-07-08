class A
{
	protected int x=5;
}
class B extends A
{
	B()
	{
	int x1=7;
	System.out.println("B access x:"+x);
	}
}
class C extends B
{
	int y=4;
	int z=x+y;
	C()
	{System.out.println("C accesses x:"+x);
	System.out.println("C accesses z:"+z);}

}
class testingin
{
	public static void main(String args[])
	{
		C obj=new C();
	}
}	