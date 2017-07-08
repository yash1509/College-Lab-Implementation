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
				URL url=new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=New+Delhi|Agra|Ahmedabad|Jaipur&destinations=New+Delhi|Agra|Ahmedabad|Jaipur&mode=driving&language=fr-FR&key=AIzaSyAO0NRhl-oHZdWeg1TXWM5nM4oK2fH3N5c");
				URLConnection urlcon=url.openConnection();
                            try (InputStream is = urlcon.getInputStream()) {
                                int i; int read = 0; byte[] buffer = new byte[32768];
                                File file = new File("C:/Jav/Assig/test.json");
                                    try (FileOutputStream fos = new FileOutputStream(file)) {
                                        while((read = is.read(buffer)) > 0)
                                        {
                                            fos.write(buffer, 0, read);
                                        }   }
                            }
				//rea();
                                String jD= readFile("C:/Jav/Assig/test.json");
                                System.out.println(jD);
                                //String JD=jD.replaceAll("\"","\\\\\"");
                                //System.out.println(JD);
                                jD=jD.replaceAll("\\s","");
                                //System.out.println(JD);
                                parsing(jD);
			}
			catch(Exception e)
			{System.out.println(e);}
	}
/*	void rea()
	{
		BufferedReader br;
        	try {
            		br = new BufferedReader(new FileReader("C:/Jav/Assig/test.json"));
            		try {
				 Char[] y = new char[2000];
                		String x; int i=0;
                		while ( (x = br.readLine()) != null ) 
				{
                    			System.out.print("");
					y[i++]=x;
              			} 
				int k=0;
				
                                parsing();
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
*/
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

        void maker(int a[][])
        {
            MinST t = new MinST();
            t.primMST(a);
                
        }        
        
	void parsing(String x)
	{
               String jsonStr = "{\"status\": \"OK\",\"origin_addresses\": [ \"Vancouver, BC, Canada\", \"Seattle, État de Washington, États-Unis\" ],\"destination_addresses\": [ \"San Francisco, Californie, États-Unis\", \"Victoria, BC, Canada\" ],\"rows\": [ {\"elements\": [ {\"status\": \"OK\",\"duration\": {\"value\": 340110,\"text\": \"3 jours 22 heures\"},\"distance\": {\"value\": 1734542,\"text\": \"1 735 km\"}}, {\"status\": \"OK\",\"duration\": {\"value\": 24487,\"text\": \"6 heures 48 minutes\"},\"distance\": {\"value\": 129324,\"text\": \"129 km\"}} ]}, {\"elements\": [ {\"status\": \"OK\",\"duration\": {\"value\": 288834,\"text\": \"3 jours 8 heures\"},\"distance\": {\"value\": 1489604,\"text\": \"1 490 km\"}}, {\"status\": \"OK\",\"duration\": {\"value\": 14388,\"text\": \"4 heures 0 minutes\"},\"distance\": {\"value\": 135822,\"text\": \"136 km\"}} ]} ]}";
               int arr[][]=new int[10][10];
            try {
            JSONObject rootObject = new JSONObject(x.trim()); // Parse the JSON to a JSONObject
            JSONArray rows = rootObject.getJSONArray("rows"); // Get all JSONArray rows

            for(int i=0; i < rows.length(); i++) { // Loop over each each row
                JSONObject row = rows.getJSONObject(i); // Get row object
                JSONArray elements = row.getJSONArray("elements"); // Get all elements for each row as an array

                for(int j=0; j < elements.length(); j++) { // Iterate each element in the elements array
                    JSONObject element =  elements.getJSONObject(j); // Get the element object
                    JSONObject distance = element.getJSONObject("distance"); // Get distance sub object

                    System.out.println("Distance: " + distance.getInt("value")/1000);
                    arr[i][j]=distance.getInt("value")/1000;
                }
            }
            for(int i=0; i < 4; i++)
            {
                for(int j=0; j < 4; j++)
                    System.out.print("\t"+arr[i][j]);
            System.out.println();
            }
                maker(arr);
        } catch (JSONException e) {
            // JSON Parsing error
            e.printStackTrace();
        }

	}
        
                
}

 

public class finaltest
{
	public static void main(String args[])
	{
		comms c=new comms();
		c.com();
	}
}

class MinST
{
    
    private	static final int V=4;

   int minKey(int key[], Boolean mstSet[])
    {
        int min = Integer.MAX_VALUE, min_index=-1;

        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min)
            {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    void printMST(int parent[], int n, int graph[][])
    {
        System.out.println("Edge   Weight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                               graph[i][parent[i]]);
    }

   void primMST(int graph[][])
    {
        int parent[] = new int[V];

        int key[] = new int [V];

        Boolean mstSet[] = new Boolean[V];

       for (int i = 0; i < V; i++)
        {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;    
        parent[0] = -1; 
        for (int count = 0; count < V-1; count++)
        {
            int u = minKey(key, mstSet);
              mstSet[u] = true;
            for (int v = 0; v < V; v++)

                if (graph[u][v]!=0 && mstSet[v] == false &&
                    graph[u][v] <  key[v])
                {
                    parent[v]  = u;
                    key[v] = graph[u][v];
                }
        }

        printMST(parent, V, graph);
    }
}