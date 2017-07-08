import java.io.*;
import java.net.*;
import org.json.*;

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
				char jsonStr=(char)i;
				}
				JSONObject jsonObj = new JSONObject(jsonStr);
       				String distance = jsonObj.getString("text");
				System.out.println(distance);
			}
			catch(Exception e)
			{System.out.println(e);}
	}
	
}

public class test3
{
	public static void main(String args[])
	{
		comms c=new comms();
		c.com();
	}
}