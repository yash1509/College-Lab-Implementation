import java.rmi.*;
public interface Str extends Remote
{
	public String rev(String a) throws RemoteException;
	public int count(String a) throws RemoteException;
}
