import java.io.*;
import java.net.*;
import java.util.Date;
class URLConnectionDemo{
	public static void main(String args[]) throws Exception {
		int character;
		URL url = new URL("http://java.sun.com/javase/6/jcp/beta/apidiffs/index-diffs.html");
		URLConnection urlconnection = url.openConnection();
		System.out.println("Content type: " + urlconnection.getContentType());
		System.out.println("Document date: " + new Date(urlconnection.getDate()));
		System.out.println("Last modified: " + new Date(urlconnection.getLastModified()));
		System.out.println("Document expires: " + urlconnection.getExpiration());
		int contentlength = urlconnection.getContentLength();
		System.out.println("Content length: " + contentlength);
		if (contentlength > 0){
			InputStream in = urlconnection.getInputStream();
			while ((character = in.read()) != -1) {
				System.out.print((char) character);
			}
			in.close();
		}
	}
}
