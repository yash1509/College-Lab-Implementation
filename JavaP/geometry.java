abstract class shape
{
	abstract void numberOfSides();
	
}
class Trapezoid 
{
	void numberOfSides()
	{
		int nos;
		nos=4;
		System.out.println("Trapezoid sides : "+nos); 		
	}
}
class Triangle
{
	void numberOfSides()
	{
		int nos;
		nos=3;
		System.out.println("Triangle sides : "+nos); 
	}
}
class Hexagon
{
	void numberOfSides()
	{
		int nos;
		nos=6;
		System.out.println("Hexagon sides : "+nos); 
	}
}

class geometry
{
	public static void main(String args[])
	{
		Trapezoid ob1=new Trapezoid();	
		Triangle ob2=new Triangle();
		Hexagon ob3=new Hexagon();
		ob1.numberOfSides();
		ob2.numberOfSides();
		ob3.numberOfSides();
	}
}