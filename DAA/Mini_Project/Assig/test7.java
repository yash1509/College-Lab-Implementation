import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class test7
{
	public static void main(String args[]) 
	{
		JSONParser parser = new	JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C:/Jav/Assig/test.txt"));
			JSONObject jsonObject = (JSONObject) obj;
			String distance = (String) jsonObject.get("distance");
			System.out.println("Name: " + distance);
			} 
		catch (IOException | ParseException e) {
		}
  	 }
}