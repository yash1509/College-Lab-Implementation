import java.io.*;
import java.net.*;
import java.math.*;
class udpservstr
{
   public static void main(String args[]) throws Exception
      {
	String n11="a",n12="a",n13="a"; String in1="a",in2="a",in3="a",in4,op="a";
	BufferedReader inFromUser =new BufferedReader(new InputStreamReader(System.in));
         DatagramSocket serverSocket = new DatagramSocket(9876);
            String s1="a"; int fl=0; int resu=0,i=0;
		byte[] sD = new byte[128];
	    String sop="Menu :- 1)Rev 2)Subs 3)Count";
		String resop="Processing";
		String inp="Enter first string";
		String inp1="Enter second string";
		int ch=0,n1=0,n2=0;
            while(true)
               {
		  byte[] receiveData = new byte[64];
            	  byte[] sendData = new byte[64];
		  byte[] sendData1 = new byte[64];
                  DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                  serverSocket.receive(receivePacket);
                  String sentence = new String( receivePacket.getData());
                  System.out.println("RECEIVED: " + sentence);
		  s1=inFromUser.readLine();
                  InetAddress IPAddress = receivePacket.getAddress();
                  int port = receivePacket.getPort();
		  if(fl==0)
		  {
			fl=1;
			sD = sop.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sD, sD.length, IPAddress, port);
                	serverSocket.send(sendPacket);	
		  }
		  else if(fl==1)
		  {
			fl=2;
			ch=Integer.parseInt(sentence.trim());
			sendData1=inp.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData1, sendData1.length, IPAddress, port);
                  	serverSocket.send(sendPacket);
		  }
		  else if(fl==2)
		  {
			fl=3;
			n11=sentence.trim();
			sendData1=inp1.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData1, sendData1.length, IPAddress, port);
                  	serverSocket.send(sendPacket);
		  }
		  else if(fl==3)
		  {
			fl=4;
			n12=sentence.trim();
			sendData1=resop.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData1, sendData1.length, IPAddress, port);
                  	serverSocket.send(sendPacket);
		  }
		  else if(fl==4)
		  {
					fl=5;
					if(ch==1)
					{
						StringBuilder pp1 = new StringBuilder();
						pp1.append(n11);
						pp1=pp1.reverse(); 
						for (i=0;i<pp1.length();i++)
						{	op=String.valueOf(pp1.charAt(i));
							sendData1=op.getBytes();
							DatagramPacket sendPacket = new DatagramPacket(sendData1, sendData1.length, IPAddress, port);
                  					serverSocket.send(sendPacket);
						}
					}
					else if(ch==2)
					{
						String message="Does S1 Contains S2 - ";
						String r1=String.valueOf(n11.contains(n12));
						String r2=message+r1;
						sendData1=r2.getBytes();
						DatagramPacket sendPacket = new DatagramPacket(sendData1, sendData1.length, IPAddress, port);
                  				serverSocket.send(sendPacket);
					
					}
					else if(ch==3)
					{
						String message="Length - ";
						in3=String.valueOf(n11.length());
						String r2=message+in3;
						sendData1=r2.getBytes();
						DatagramPacket sendPacket = new DatagramPacket(sendData1, sendData1.length, IPAddress, port);
                  				serverSocket.send(sendPacket);
					}
						
		  }
		  else
		  {
                  	sendData = s1.getBytes();
                  	DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                  	serverSocket.send(sendPacket);
		  }
               }
      }
}