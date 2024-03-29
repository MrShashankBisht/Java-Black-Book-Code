import java.net.*;
import java.util.*;
import java.io.*;
public class BartClient{
	public static void main(String[] args) {
		int port = 1234;
		System.out.println("Welcome to the Bart Client\n");
		Socket s = getSocket(port);
		try {
			System.out.println("Connected on port " + port);
			Scanner in = 	new Scanner(s.getInputStream());
			PrintWriter out;
			out = new PrintWriter(s.getOutputStream(), true);
			in.nextLine();
			in.nextLine();
			out.println("get");
			String quote = in.nextLine();
			out.println("bye");
			s.close();
			for (int i = 0; i < 5; i++)
				System.out.println(quote);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static Socket getSocket(int port) {
		Socket s;
		String host;
		InetAddress ip;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(
			"What server do you want to connect to?");
			host = sc.nextLine();
			try {
				ip = InetAddress.getByName(host);
				s = new Socket(ip, port);
				return s;
			}
			catch (UnknownHostException e){
				System.out.println("The host is unknown.");
			}
			catch (IOException e) {
				System.out.println("Network error.");
			}
		}
	}
}