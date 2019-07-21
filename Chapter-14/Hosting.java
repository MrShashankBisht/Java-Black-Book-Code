import java.util.Scanner;
import java.net.*;
public class Hosting{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
	System.out.println("===================================================================");
	System.out.println("Welcome to this application that prompts you for a host name. When you enter one, it shows the IP address and asks for more.");
	System.out.println("===================================================================");
	String host;
	do{
		System.out.print("\nPlease enter a host name: ");
		host = sc.nextLine();
		try {
			InetAddress[] addresses	= InetAddress.getAllByName(host);
			for (InetAddress ip : addresses)
				System.out.println(ip.toString());
		}
		catch (UnknownHostException e){
			System.out.println("Can't find this host.");
		}			
	} while (doAgain());
	}
	private static boolean doAgain(){
		System.out.println();
		String s;
		while (true) {
			System.out.print("Look up another? (Y or N) ");
			s = sc.nextLine();
			if (s.equalsIgnoreCase("Y"))
				return true;
			else if (s.equalsIgnoreCase("N"))
				return false;
		}
	}
}