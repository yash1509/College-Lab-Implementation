import java.util.*;
class chstuff
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of characters: ");
		int n=sc.nextInt(); String res=new String();
		String str[]=new String[n];	String out[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		for(int i= 0;i<n;i++)
		{
			if(str[i].equals("dle"))
			{
				str[i]="dle dle";
			}
		}
		System.out.println("Stuffed : ");
		System.out.print("dle stx ");
		for(int i=0;i<n;i++)
		{
			System.out.print(str[i]+" ");
		}
		System.out.println("dle etx ");
		out=str;
		System.out.println("Destuffed : ");
		for(int i=0;i<n;i++)
		{
			if(out[i].equals("dle dle"))
			{
				str[i]="dle";
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(str[i]+" ");
		}
		
	}
	
}
