import java.io.*;
class Rodent 
{
	int i=0;
	public String rod[]=new String[8];
	public Rodent(String s)
	{	
	this.rod[i++]=s;
	}
	void stringy()
	{
		String s="Yo this is the mother of all classes";
		System.out.println(s);
	}
	void callarr()
	{
		for (int j=0;j<4;j++)			
		System.out.print("    "+rod[j]+"    ");
	}
	
}

class Mouse extends Rodent
{
	public Mouse(String s9)
	{
		super(s9);
	}
	void stringy()
	{
		String s="I am a mouse!";
		System.out.println(s);
	}
	
}

class Gerbil extends Rodent
{
	public Gerbil(String s8)
	{
		super(s8);
	}
	void stringy()
	{
		String s="I am a Gerbil!";
		System.out.println(s);
	}

}

class Hamster extends Rodent
{
	public Hamster(String s7)
	{
		super(s7);
	}
	
	void stringy()
	{
		String s="I am a Hamster!";
		System.out.println(s);
	}
		
}

class animal
{
	public static void main(String args[])
	{	
		String s1="Hamster",s2="Gerbil",s3="Mouse";
		 Rodent ob=new Rodent("Rodent class");
		Hamster ob1=new Hamster(s1);
		Gerbil ob2=new Gerbil(s2);
		Mouse ob3=new Mouse(s3);
		ob3.stringy();
		ob2.stringy();
		ob1.stringy();
		ob.callarr();
		
		
	}
}
		