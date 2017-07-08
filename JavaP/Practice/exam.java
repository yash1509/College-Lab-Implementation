class exam1
{
	exam1()
	{
		int a=20;
		long b=5780901;
		float c=(float)31.21;
		double d=123.12312312;
		byte e=23;
		String s="Asheleon";
		char t='a';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(s);
		System.out.println(t);
	}
}
class exam
{
	public static void main(String args[])
	{
		System.out.println("The constructor called shows: ");
		exam1 myexam=new exam1();
	}
}
			