class operator
{
	public static void main(String args[])
	{	
		System.out.println("The operators are:"); 
		operator1 obj1=new operator1(5,6);
	}
}

class operator1
{	int a,b,c,d;
	operator1(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println("a+b "+c);
		c=a-b;
		System.out.println("a-b "+c);
		c=a/b;
		System.out.println("a/b "+c);
		c=a*b;
		System.out.println("a*b "+c);
		c=a%b;
		System.out.println("a%b "+c);
		c=a<<1;
		System.out.println("a left shift 2 "+c);
		c=a>>1;
		System.out.println("a right shift 2 "+c);
		c=a&b;
		System.out.println("a&b "+c);
		c=a|b;
		System.out.println("a|b "+c);
		c=~a;
		System.out.println("~a "+c);
	}
}
