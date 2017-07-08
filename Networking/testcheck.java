import java.io.*;
import java.security.MessageDigest;
public class testcheck
{
	private static String getFileChecksum(MessageDigest digest, File file) throws IOException
	{
		FileInputStream fis = new FileInputStream(file);
	
		byte[] bA = new byte[1024];	
		int bCo = 0; 
	
		while ((bCo = fis.read(bA)) != -1) 
		{
			digest.update(bA, 0, bCo);
		};
		fis.close();
	
		byte[] bytes = digest.digest();

		StringBuilder sb = new StringBuilder();
		for(int i=0; i< bytes.length ;i++)
		{
			sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		try
		{
			File file = new File("C:/Jav/check.txt");
			MessageDigest md = MessageDigest.getInstance("MD5");
			String checksum = getFileChecksum(md, file);
			System.out.println("The MD5 checksum comes out to be : ");
			System.out.println(checksum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

