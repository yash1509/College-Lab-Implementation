import java.io.*;
class objec
{
	int i,j;
	objec(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}
class check
{
	void swap(objec obj1)
	{	int temp;
		temp=obj1.i;
		obj1.i=obj1.j;
		obj1.j=temp;
	}
}

class object
{
	public static void main(String args[])
	{
		objec obj1=new objec(2,3);
		check obj2=new check();
		System.out.println(obj1.i+"\t"+obj1.j);
		obj2.swap(obj1);
		System.out.println(obj1.i+"\t"+obj1.j);
	}
}
		
	