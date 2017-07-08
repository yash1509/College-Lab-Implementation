import java.io.*;
class Rodent 
{
	void stringy()
	{
		String s="Base class";
		System.out.println(s);
	}
	void rod()
	{
		System.out.println("Rodent class");
	}
	
}

class Mouse extends Rodent
{
	void stringy()
	{
		String s="I am a mouse!";
		System.out.println(s);
	}
	
}

class Gerbil extends Rodent
{
	
	void stringy()
	{
		String s="I am a Gerbil!";
		System.out.println(s);
	}

}

class Hamster extends Rodent
{
	
	void stringy()
	{
		String s="I am a Hamster!";
		System.out.println(s);
	}
		
}

class anim
{
	public static void main(String args[])
	{	
		Rodent arr[]=new Rodent[3];
		arr[0]=new Mouse();
		arr[0].stringy();
		arr[1]=new Gerbil();
		arr[1].stringy();
		arr[2]=new Hamster();
		arr[2].stringy();
		arr[2].rod();
	}
}
		