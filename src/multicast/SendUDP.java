package multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SendUDP {

	public static void main(String [] args) throws IOException{
		String machine = args[0];
		int port = Integer.parseInt(args[1]);
		String message = args[2];
		MulticastSocket ds = new MulticastSocket();
		byte buf[]= new byte[250];
		InetAddress ia = InetAddress.getByName(machine);
		buf = message.getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, port);
		ds.send(dp);
	}
	
}
