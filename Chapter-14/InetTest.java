import java.net.*;
class InetTest{
	public static void main(String args[]) throws UnknownHostException {
		System.out.println("Printing IP address of Localhost");
		InetAddress Adr = InetAddress.getLocalHost();
		System.out.println(Adr);
		System.out.println("\nPrinting IP address of Computer santosh");
		Adr = InetAddress.getByName("santosh");
		System.out.println(Adr);
		System.out.println("\nPrinting IP addresses for host name www.google.com");
		InetAddress in[] = InetAddress.getAllByName("www.google.com");
		for(int i = 0; i < in.length; i++) 
			System.out.println(in[i]);
	}
}
