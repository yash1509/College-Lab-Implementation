
class tes
{
	public static void main()throws IOException
	{	int n,m;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(obj.readLine());
		m=Integer.parseInt(obj.readLine());
		te obj2=new te(n,m);
	}
}

class te
{
	te(int r,int x)
	{	
		System.out.println("r and x accessed");
	};

}
