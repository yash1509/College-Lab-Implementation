import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Strrun extends UnicastRemoteObject implements Str
{
	String n11="a",n12="a",n13="a"; String in1="a",in2="a",in3="a",in4,op="a",rp=" "; int i=0;
	protected Strrun() throws RemoteException
	{
		super();
	}
	public String rev(String a) throws RemoteException
	{
		StringBuilder pp1 = new StringBuilder();
		pp1.append(a);
		pp1=pp1.reverse(); 
		for (i=0;i<pp1.length();i++)
		{	op=String.valueOf(pp1.charAt(i));
			rp=rp.concat(op);
		}
		return rp;
	}
	public int count(String a) throws RemoteException
	{
		String message="Length - ";
		int in33=a.length();
		return in33;
	}
	
}
