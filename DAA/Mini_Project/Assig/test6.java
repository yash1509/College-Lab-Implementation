import java.io.*;
import java.net.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
				//rea();
				String jD= readFile("properties.json");
				System.out.println(jD);
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
				//parsing(y);
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

	String readFile(String filename) 
	{
		String result = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) 
			{
				sb.append(line);
				line = br.readLine();
			}
			result = sb.toString();
		    } catch(Exception e) 
			{e.printStackTrace();}
		return result;
	}


/*	void parsing(String y[])throws IOException, FileException
	{
	
       		 String jsonStr[] = y;

            try {
            JSONObject rootObject = new JSONObject(jsonStr); // Parse the JSON to a JSONObject
            JSONArray rows = rootObject.getJSONArray("rows"); // Get all JSONArray rows

            for(int i=0; i < rows.length(); i++) 
		{ // Loop over each each row
                JSONObject row = rows.getJSONObject(i); // Get row object
                JSONArray elements = row.getJSONArray("elements"); // Get all elements for each row as an array

                for(int j=0; j < elements.length(); j++) 
		{ // Iterate each element in the elements array
                    JSONObject element =  elements.getJSONObject(j); // Get the element object
                    JSONObject duration = element.getJSONObject("duration"); // Get duration sub object
                    JSONObject distance = element.getJSONObject("distance"); // Get distance sub object

                    System.out.println("Duration: " + duration.getInt("value")); // Print int value
                    System.out.println("Distance: " + distance.getInt("value")); // Print int value
                }
            }
        } 
	catch (JSONException e) 
	{
            e.printStackTrace();
        }

    catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {        
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
    }

	}
*/
}

public class test6
{
	public static void main(String args[])
	{
		comms c=new comms();
		c.com();
	}
}