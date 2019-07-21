import java.net.*;
class ClientApp {
	public static int servPort = 997;
	public static int clntPort = 998;
	public static int buff_size = 1024;
	public static  DatagramSocket ds;
	public static byte buff[] = new byte[buff_size];
	
	public static void client() throws Exception{
		while(true) {
			DatagramPacket p = new DatagramPacket(buff, buff.length);
			ds.receive (p);
			System.out.println (new String (p.getData(), 0, p.getLength()));
		}
	}
	public static void main (String args[]) throws Exception {
		ds = new DatagramSocket (clntPort);
		client();
	}
}