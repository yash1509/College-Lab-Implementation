import java.io.*;
import java.net.*;
class comms
{
	void com()
	{
			try{
				URL url=new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=New+Delhi|Agra|Ahmedabad&destinations=Jaipur|Gwalior&mode=driving&language=fr-FR&key=AIzaSyAO0NRhl-oHZdWeg1TXWM5nM4oK2fH3N5c");
				URLConnection urlcon=url.openConnection();
				InputStream stream=urlcon.getInputStream();
				int i;
				while((i=stream.read())!=-1)
				{
				System.out.print((char)i);
				}
			}
			catch(Exception e)
			{System.out.println(e);}
	}

}

public class test2
{
	public static void main(String args[])
	{
		comms c=new comms();
		c.com();
	}
}