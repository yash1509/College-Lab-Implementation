import java.util.*;
public class bits
{
	public static void main(String[] args)
	{
		System.out.print("Enter the message(BIN): ");
		Scanner sn=new Scanner(System.in);
		String str = sn.nextLine();	String res = new String();	String out=new String();
		int co = 0;
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)!='1' && str.charAt(i)!='0')
			{
				System.out.println("Not binary");
				return;
			}
			if(str.charAt(i)=='1')
			{
				co++;
				res = res + str.charAt(i);
			}
			else
			{
				res = res + str.charAt(i);
				co = 0;
			}
			if(co==5)
			{
				res = res + '0';
				co = 0;
			}
		}
		String ast=res;
		System.out.println("Bit stuffed: "+ast);
		co=0;
		for(int i=0;i<res.length();i++)
		{
			if(res.charAt(i) == '1')
			{
				co++;
				out = out + res.charAt(i);
			}
			else
			{
				out = out + res.charAt(i);
				co = 0;
			}
			if(co==5)
			{
				if((i+2)!=res.length())
				out = out + res.charAt(i+2);
				else
				out=out + '1';
				i=i+2;
				co = 1;
			}
		}
		System.out.println("Destuffed: "+out);
	}
}