import java.io.*;
class rect
{
	public static void main(String args[])throws IOException
	{	
		float len, wid;
		rectdemo obj10=new rectdemo();
		rectdemo obj2=new rectdemo();
		rectdemo obj3=new rectdemo();
		rectdemo obj4=new rectdemo();
		rectdemo obj5=new rectdemo();
		rectdemo obj6=new rectdemo();
		rectdemo obj30=new rectdemo();
		rectdemo obj40=new rectdemo();
		len=obj10.getlen();
		wid=obj2.getwid();
		obj3.setlen(len);
		obj4.setwid(wid);
		obj5.peri(len,wid);
		obj6.ar(len,wid);	
	}
}

class rectdemo 
{
	float l=0,w=0,len,wid;
	void setlen(float len)
	{
		l=len;
		if(l<0||l>20)
		{System.out.println("The entered lenght is out of bound");
			System.exit(0);}
	}
	void setwid(float wid2)
	{
		w=wid2;
		if(w<0||w>20)
		{System.out.println("The entered width is out of bound");
			System.exit(0);}
	}
	float getlen()throws IOException
	{
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the lenght of rectangle");
		len=Float.parseFloat(obj.readLine());
		return len;
		
	}
	float getwid()throws IOException
	{
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));	
		System.out.println("Enter the width of rectangle");
		wid=Float.parseFloat(obj.readLine());
		return wid;
	}
	

	void peri(float l,float w)
	{
		float per;
		per=2*(l+w);
		System.out.println("The perimeter of the rectangle is"+per);
	}	
	
	void ar(float l,float w)
	{
		float ar;
		ar=l*w;
		System.out.println("The area of the rectangle is"+ar);
	}	
}

	
	