import java.net.*;
class URLDemo{
	public static void main (String args[]) throws MalformedURLException {
		URL httpurl = new URL("http://www.sun.com/products/index.jsp");
		System.out.println("Protocol: "+ httpurl.getProtocol ());
		System.out.println("Port: "+ httpurl.getPort ());
		System.out.println("Host: "+ httpurl.getHost ());
		System.out.println("File: "+ httpurl.getFile ());
		System.out.println("Ext: "+ httpurl.toExternalForm ());
	}
}
