import java.io.*;
class ChemicalElement
{
	final String a="Hydrogen",b="Oxygen",c="Zinc",d="H",e="O",f="Zn";
	void cname();
	{
		boolean nam=1;
		if(nam>0)
		System.outprintln("The Chemical elements and symbol names are"+a+" "+d+"\t"+b+" "+e+"\t"+c+" "+f+"\t"); 
	
	}

	int atomnum();
	{
		int c;
		static
		{
			static boolean arr[]=new boolean[40];
			for(int i=0;i<40;i++)
				arr[i]=1;
			System.out.println("Hydrgon atomic number=");
			i=1;
			if(arr[i]>0)
				c=i;

			System.out.println("Oxygen atomic number=");
			i=8;
			if(arr[i]>0)
				return i;
			System.out.println("Zinc atomic number=");
			i=30;
			if(arr[i]>0)
				return i;
		}	
			 
				
					
		
	}
	void typemet(String s)
	{
		string namem;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose type of metal");
		System.out.println("1.Alkali\n2.Transistion\n3.Metal");
		opt=Integer.parseInt(obj.readLine());
		switch(opt)
		{
			case 1: namem="Alkali";
				break;
			case 2:namem="Halogen";
			case 3:namem="Transition";
		}
	}
}
class main
{
	public static void main(String args[])
	{
		ChemicalElement obj=new ChemicalElement();
		obj.typemet();
		obj.autonum();
		obj.cname();
	}
}
	
		
		
		
	
	
	
	