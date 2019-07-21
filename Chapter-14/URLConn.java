import java.net.*;
import java.io.*;
import java.util.Date;
class URLConn{
	public static void main (String args[]) throws Exception{
		int c;
		URL httpurl = new URL("http://java.sun.com/javase/6/jcp/beta/apidiffs/index-diffs.html");
		URLConnection httpurlCon = httpurl.openConnection();
		long d = httpurlCon.getDate();
		if (d==0)
			System.out.println ("No date information.");
		else
			System.out.println("Date: " + new Date(d));
			System.out.println ("Content-Type: " + httpurlCon.getContentType());
			d = httpurlCon.getExpiration();
		if(d == 0)
			System.out.println ("No expiration information.");
		else
			System.out.println ("Expires: " + new Date(d));
		d = httpurlCon.getLastModified();	
		if (d == 0)
			System.out.println ("No last modified information.");
		else
			System.out.println ("Last-Modified: " + new Date(d));
		int len = httpurlCon.getContentLength();
		if (len == -1)
			System.out.println ("Content length unavailable.");
		else
			System.out.println ("Content-Length: " + len);
		if (len != 0){
			System.out.println ("=== Content ===");
			InputStream input = httpurlCon.getInputStream();
			int I = len;
			while (((c = input.read()) != -1) && (--I > 0)){
				System.out.print((char) c);
			}
			input.close();
		} 
		else {
			System.out.println ("No content available.");
		}
	}
} 
