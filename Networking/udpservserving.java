import java.io.*;
import java.net.*;

class udpservserving
{
   public static void main(String args[]) throws Exception
      {
	BufferedReader inFromUser =
         new BufferedReader(new InputStreamReader(System.in));
         DatagramSocket serverSocket = new DatagramSocket(9876);
            String s1="a";
            while(true)
               {
		  byte[] receiveData = new byte[32];
            byte[] sendData = new byte[32];
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
      }
}