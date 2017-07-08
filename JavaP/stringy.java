import java.io.*;
import java.util.StringTokenizer;
class stry
{
	stry(String s)
	{
		int c=0,c1=0,c2=0;
		StringTokenizer st=new StringTokenizer(s," ");
		StringTokenizer st1=new StringTokenizer(s,"\n");
		StringTokenizer st2=new StringTokenizer(s,"\t");		
		while(st.hasMoreTokens())
		{	
			c=c+1;
			String val=st.nextToken();
			System.out.println(val);
		};
		c--;
		while(st1.hasMoreTokens())
		{	
			c1++;
			String val1=st1.nextToken();
		};
		c1--;
		while(st2.hasMoreTokens())
		{	
			c2++;
			String val2=st2.nextToken();
		};
		c2--;			
		System.out.println("Number of spaces: "+c);
		System.out.println("Number of line change: "+c1);
		System.out.println("Number of tabs: "+c2);
	};
}
class stringy
{
	public static void main(String args[])
	{	
		String s1= "Its an example of Tokenizer";
		System.out.println("Original String is : "+s1);
		stry obj=new stry(s1);
	
	}
	
}