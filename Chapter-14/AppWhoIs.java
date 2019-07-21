import java.net.*;
import java.io.*;
class AppWhoIs{
	public static void main (String args[]) throws Exception{
		int c;
		Socket sokt = new Socket ("internet.net", 5897);
		InputStream inputstr= sokt.getInputStream();
		OutputStream outputstr = sokt.getOutputStream();
		String st = (args.length == 0 ? "hotmail.com" : args[0]) +"\n";
		while ((c = inputstr.read()) != -1){
			System.out.print((char) c);
		}
		sokt.close();
	}
}