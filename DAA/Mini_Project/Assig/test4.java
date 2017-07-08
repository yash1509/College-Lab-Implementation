import java.io.*;
import java.net.*;
class comms
{
	void com()
	{
			try{
				URL url=new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=New+Delhi|Agra|Ahmedabad&destinations=Jaipur|Gwalior&mode=driving&language=fr-FR&key=AIzaSyAO0NRhl-oHZdWeg1TXWM5nM4oK2fH3N5c");
				URLConnection urlcon=url.openConnection();
				InputStream is=urlcon.getInputStream();
				int i; int read = 0; byte[] buffer = new byte[32768];
				File file = new File("C:/Jav/Assig/test.json");
				FileOutputStream fos = new FileOutputStream(file);
				while((read = is.read(buffer)) > 0)
				{
					fos.write(buffer, 0, read);
				}
				fos.close();
				is.close();
			}
			catch(Exception e)
			{System.out.println(e);}
	}

}

public class test4
{
	public static void main(String args[])
	{
		comms c=new comms();
		c.com();
	}
}