import java.io.*;
public class CharArrayReaderDemo1{
	public static void main(String args[]) throws IOException {
		String t = "The quick brown fox ran over the mount";
		int l = t.length();
		char w[] = new char[l];
		t.getChars(0, l, w, 0);
		CharArrayReader input1 = new CharArrayReader(w);
		CharArrayReader input2 = new CharArrayReader(w, 0, 6);
		int j;
		System.out.println("All the characters:");
		while((j = input1.read()) != -1) {
			System.out.print((char)j);
		}
		System.out.println();
		System.out.println("First 6 characters:");
		while((j = input2.read()) != -1) {
			System.out.print((char)j);
		}
		System.out.println();
	}
}

