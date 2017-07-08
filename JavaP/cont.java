class cont1
{
	int r1,x1;
	cont1(int l,int m)
	{
		r1=l;
		x1=m;
		};
	void display()
	{System.out.println(r1+" "+x1);}
}

class cont
{
	
	
	public static void main()throws IOException
	{	int r,x;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		r=Integer.parseInt(obj.readLine());
		x=Integer.parseInt(obj.readLine());
		cont1 obj2=new cont(r,x);
		obj2.display();
	}
}