import java.io.*;
import java.net.*;
import java.math.*;
class udpservmath
{
   public static void main(String args[]) throws Exception
      {
	BufferedReader inFromUser =new BufferedReader(new InputStreamReader(System.in));
         DatagramSocket serverSocket = new DatagramSocket(9176);
            String s1="a"; int fl=0; int resu=0;
		byte[] sD = new byte[128];
	    String sop="Menu :- 1)Add 2)Sub 3)Multiply 4)Divide 5)Mod";
		String resop="Processing";
		String inp="Enter first operand";
		String inp1="Enter second operand";
		int ch=0,n1=0,n2=0;
            while(true)
               {
		  byte[] receiveData = new byte[2];
            	  byte[] sendData = new byte[32];
		  byte[] sendData1 = new byte[32];
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
			n1=Integer.parseInt(sentence.trim());
			sendData1=inp1.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData1, sendData1.length, IPAddress, port);
                  	serverSocket.send(sendPacket);
		  }
		  else if(fl==3)
		  {
			fl=4;
			n2=Integer.parseInt(sentence.trim());
			sendData1=resop.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData1, sendData1.length, IPAddress, port);
                  	serverSocket.send(sendPacket);
		  }
		  else if(fl==4)
		  {
					fl=5;
					if(ch==1)
						resu=n1+n2;
					else if(ch==2)
						resu=n1-n2; 
					else if(ch==3)
						resu=n1*n2; 
					else if(ch==4)
						resu=n1/n2; 
					else if(ch==5)
						resu=n1%n2; 
			String r1=String.valueOf("Result is : "+resu);
			sendData = r1.getBytes();
                  	DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                 	serverSocket.send(sendPacket);
					
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