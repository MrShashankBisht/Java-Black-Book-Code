import java.io.*;
import java.net.*;
public class reg 
{
	public static void main(String[] args) 
{
		try 
{
			Socket s = new Socket("www.yourserver.com", 80);
			BufferedReader in = new BufferedReader(new
			InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(s.getOutputStream());
			out.print("GET " +
			"/yourname/cgi/reg.cgi?name
			=Steve&email=me@here\n\n");
			out.flush();
			String line;
			while ((line = in.readLine()) != null)
{
				System.out.println(line);
			}
		} 
catch (Exception e){}
	}
}
