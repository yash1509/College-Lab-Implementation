import java.io.*;
import java.net.*;
import java.util.*;

class udpmultiserv extends Thread
{
	public static DatagramSocket serverSocket=null;
	public void run() 
	{
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		String s1="a";
		while(true)
		{
		try{
		  byte[] receiveData = new byte[64];
		  byte[] sendData = new byte[64];
                  DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                  serverSocket.receive(receivePacket);
                  String sentence = new String( receivePacket.getData());
                  System.out.println("RECEIVED: " + sentence);
		  s1=inFromUser.readLine();
                  InetAddress IPAddress = receivePacket.getAddress();
                  int port = receivePacket.getPort();
                  String capitalizedSentence = sentence.toUpperCase();
                  sendData = s1.getBytes();
                  DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                  serverSocket.send(sendPacket);
		}
		catch(Exception e)
			{System.out.println(e);}
               }
	}
   public static void main(String args[]) throws Exception
      {
	
	int i=0;
		Random rand = new Random();
			int  n = rand.nextInt(60000) + 1024;
			serverSocket = new DatagramSocket(9876);
			udpmultiserv ch=new udpmultiserv();
			ch.start();
			i=i+1;
		 
      }
}