import java.io.*;
class BufferedReaderDemo{
	public static void main(String args[]) throws Exception{
		FileReader filereader = new FileReader("file4.txt");
		BufferedReader bufferedreader = new BufferedReader(filereader);
		String instring;
		while((instring = bufferedreader.readLine()) != null) {
			System.out.println(instring);
		}
		filereader.close();
	}
}
