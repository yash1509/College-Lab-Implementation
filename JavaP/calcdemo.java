import java.io.*;
class calc
{	
	void addition(int a,int b)
	{	
		int c=a+b;
		System.out.println("Addition is:" +c);
	}
	void addition(Float d,Float e)
	{
		Float f=d+e;
		System.out.println("Addition is:  " +f);
	}
	void addition(Double g,Double h)
	{
		Double i=g+h;
		System.out.println("Addition is:  " +i);
	}
	void addition(Long j,Long k)
	{
		Long l=j+k;
		System.out.println("Addition is:  " +l);
	}
	void subtraction(int m,int n)
	{
		int o=m-n;
		System.out.println("Subtraction is:  " +o);
	}
	void subtraction(Float p,Float q)
	{
		Float r=p-q;
		System.out.println("Subtraction is:  "+r);
	}
	void subtraction(Double s,Double t)
	{
		Double u=s-t;
		System.out.println("Subtraction is:  "+u);
	}
	void subtraction(long v,long w)
	{
		Long x=v-w;
		System.out.println("Subtraction is:  "+x);
	}
	void multiplication(int y,int z)
	{
		int aa=y*z;
		System.out.println("Multiplication is:  "+aa);
	}
	void multiplication(Long aaa,Long bbb)
	{
		Long ccc=aaa*bbb;
		System.out.println("Multiplication is:  "+ccc);
	}
	void multiplication(Double ab,Double bc)
	{
		Double cd=ab*bc;
		System.out.println("Multiplication is:  "+cd);
	}
	void multiplication(Float ef,Float gh)
	{
		Float ij=ef*gh;
		System.out.println("Multiplication is:  "+ij);
	}
	void division(int ij,int kl)
	{
		int mn=ij/kl;
		System.out.println("Division is:  "+mn);
	}
	void division(Float op,Float qr)
	{
		Float st=op/qr;
		System.out.println("Division is:  "+st);
	}
	void division(Long uv,Long wx)
	{
		Long yz=uv/wx;
		System.out.println("Division is:  "+yz);
	}
	void division(Double abc,Double def)
	{
		Double ghi=abc/def;
		System.out.println("Division is:  "+ghi);
	}
				
}	

class calcdemo 
{
	public static void main (String args[])throws IOException
	{	
		System.out.println("Enter your data type choice for operation"); 
		System.out.println("1) Integer");
		System.out.println("2) Float");
		System.out.println("3) Double");
		System.out.println("4) Long");
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		int n;
		n=Integer.parseInt(obj.readLine());
		System.out.println("Enter two numbers for calculation");
		calc obj1=new calc();
		calc obj2=new calc();
		calc obj3=new calc();
		calc obj4=new calc();
		switch(n)
		{
		case 1:
		if(n==1)
			{
				int q=Integer.parseInt(obj.readLine());
				int w=Integer.parseInt(obj.readLine());
				obj1.addition(q,w);
				obj2.subtraction(q,w);
				obj3.multiplication(q,w);
				obj4.division(q,w);
			}break;
		case 2:
		if(n==2)
			{
				Float e=Float.parseFloat(obj.readLine());
				Float r=Float.parseFloat(obj.readLine());
				obj1.addition(e,r);
				obj2.subtraction(e,r);
				obj3.multiplication(e,r);
				obj4.division(e,r);
			}break;
		case 3:
		if(n==1)
			{
				Double t=Double.parseDouble(obj.readLine());
				Double y=Double.parseDouble(obj.readLine());
				obj1.addition(t,y);
				obj2.subtraction(t,y);
				obj3.multiplication(t,y);
				obj4.division(t,y);
			}break;
		case 4:
		if(n==1)
			{
				Long u=Long.parseLong(obj.readLine());
				Long i=Long.parseLong(obj.readLine());
				obj1.addition(u,i);
				obj2.subtraction(u,i);
				obj3.multiplication(u,i);
				obj4.division(u,i);
			}break;
		}
		
	}
}
		