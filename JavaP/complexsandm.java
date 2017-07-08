import java.io.*;
class complexsandm
{
	public static void main(String args[])throws IOException
	{
		int a,b,c,d;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the real part of two complex numbers");
		a=Integer.parseInt(obj.readLine());
		c=Integer.parseInt(obj.readLine());
		System.out.println("Enter imaginary part of two complex numbers");
		b=Integer.parseInt(obj.readLine());
		d=Integer.parseInt(obj.readLine());
		int e=a+c; int f=b+d;
		System.out.println("Sum of the two complex numbers is :  ");
		System.out.println(e+"+"+"i("+f+")");
		int g=a*c+b*d*(-1),h=a*d+b*c;
		System.out.println("Product of the two complex numbers is :  ");
		System.out.println(g+"+"+"i("+h+")");
	}
}