import java.net.*;
class ServerApp{
	public static int servPort = 997;
	public static int clntPort = 998;
	public static int buff_size = 1024;
	public static  DatagramSocket ds;
	public static byte buff[] = new byte[buff_size];

	public static void Server() throws Exception {
		int pos =0;
		while (true) {
			int c = System.in.read();
			switch (c) 
			{
			case -1:
				System.out.println ("Server Quits");
				return;
			case '\r':
				break;
			case '\n':
				ds.send(new DatagramPacket (buff,pos,InetAddress. getLocalHost(),clntPort));
				pos = 0;
				break;
			default:
				buff[pos++] = (byte) c;
			}
		}
	}
	public static void main (String args[]) throws Exception {
		ds = new DatagramSocket (servPort);
		Server();
	}
}