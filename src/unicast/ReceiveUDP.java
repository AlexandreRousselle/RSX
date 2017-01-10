package unicast;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.io.IOException;
import java.net.DatagramPacket;

public class ReceiveUDP {

	public static void main(String [] args) throws IOException{
		int port = Integer.parseInt(args[0]);
		DatagramSocket ds = new DatagramSocket(port);
		byte buf[]= new byte[250];
		InetAddress ia = InetAddress.getByName("localhost");
		while(true){
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			System.out.println("Data received :" + new String(dp.getData()));
		}
	}
	
}
