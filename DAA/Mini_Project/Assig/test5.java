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
				rea();
			}
			catch(Exception e)
			{System.out.println(e);}
	}
	void rea()
	{
		BufferedReader br;
        	try {
            		br = new BufferedReader(new FileReader("C:/Jav/Assig/test.json"));
            		try {
				 String[] y = new String[2000];
                		String x; int i=0;
                		while ( (x = br.readLine()) != null ) 
				{
                    			System.out.print("");
					y[i++]=x;
              			} 
				int k=0;
				while(i>0)
				{
				System.out.print(y[k++]);
       			     	i--;
				parsing();
				}
			} catch (IOException e) 
				{
            	 		  e.printStackTrace();
           			}
        		} catch (FileNotFoundException e) 
				{
          			  System.out.println(e);
          			  e.printStackTrace();
    				}
	}

	void parsing()
	{
		
	}

}

public class test5
{
	public static void main(String args[])
	{
		comms c=new comms();
		c.com();
	}
}