import java.io.*;
import java.net.*;
public class SocketDemo{
	public static void main(String[] args){
		try{
			Socket s = new Socket("http://java.sun.com", 80);
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(s.getOutputStream());
			out.print("GET /javase/6/jcp/beta/apidiffs/index-diffs.html");
			out.flush();
			String line;
			while ((line = in.readLine()) != null){
				System.out.println(line);
			}
		} 
		catch (Exception e){}
	}
}