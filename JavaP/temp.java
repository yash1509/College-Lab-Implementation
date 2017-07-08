import java.io.*;
class temp
{
	public static void main(String args[])
	{	
		float len=0, wid=0;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the lenght of rectangle");
		len=Float.parseFloat(obj.readLine());
		System.out.println("Enter the width of rectangle");
		wid=Float.parseFloat(obj.readLine());
		rectdemo obj1=new rectdemo();
		rectdemo obj2=new rectdemo();
		rectdemo obj3=new rectdemo();
		rectdemo obj4=new rectdemo();
		rectdemo obj5=new rectdemo();
		obj1.setlen(len);
		obj2.setwid(wid);
		obj5.getwid();
		obj3.peri(len,wid);
		obj4.ar(len,wid);		
	}
}

class rectdemo 
{
	float l=0,w=0;
	void setlen(float len2)
	{
		l=len2;
	}
	void setwid(float wid2)
	{
		w=wid2;
	}
	float getlen()
	{
		return l;
	}
	float getwid()
	{
		return w;
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
