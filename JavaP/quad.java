import java.io.*;
class quad
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Please enter the co efficients");
		Double a; Double b; Double c;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		a=Double.parseDouble(obj.readLine());
		b=Double.parseDouble(obj.readLine());
		c=Double.parseDouble(obj.readLine());
		Double d;
		d=(b*b-4*a*c);
		Double r1; Double r2;
		Double x1;
		Double x2;
		if (d>0)		
		{		
			r1=-b/2*a;
			r2=(Math.sqrt(d))/2*a;
			x1=r1+r2;
			x2=r1-r2;
			System.out.println("Roots are" +x1);
			System.out.println(x2);	
		}
		else if (d==0)
			{
				r1=-b/2*a;
				System.out.print("Roots are same and they are equal to =" +r1);
			}
			else
			{	System.out.print("Roots are imaginary");
			}
		}
}			