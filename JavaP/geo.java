import java.io.*;
class point
{
	void sides()
	{
		System.out.println("No side");
	}
}
class rect extends point
{
	void sides()
	{
		System.out.println("Rectangle - 4 side");
	}
}
class tri extends point
{
	void sides()
	{
		System.out.println("Triangle - 3 side");
	}
}
class sq extends point
{
	void sides()
	{
		System.out.println("Square - 4 side");
	}
}
class cir extends point
{
	void sides()
	{
		System.out.println("Circle - 0 side");
	}
}
class eli extends point
{
	void sides()
	{
		System.out.println("Ellipse - 0 side");
	}
}
class geo
{
	public static void main(String args[])
	{
		point obj=new point();
		rect o1=new rect();
		cir o2=new cir();
		eli o3=new eli();
		tri o4=new tri();
		sq o5= new sq();
		obj=o1;
		obj.sides();
		obj=o2;
		obj.sides();
		obj=o3;
		obj.sides();
		obj=o4;
		obj.sides();
		obj=o5;
		obj.sides();
		
	}
}