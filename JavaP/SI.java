import java.io.*;
class SI
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Please enter the principle, rate, time respectively");
		float p; float r; float t;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		p=Float.parseFloat(obj.readLine());
		r=Float.parseFloat(obj.readLine());
		t=Float.parseFloat(obj.readLine());
		float SI;
		SI=(p*r*t)/100;
		System.out.print("Simple interest=" +SI);
	}
}