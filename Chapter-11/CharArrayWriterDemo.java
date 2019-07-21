import java.io.*;
class CharArrayWriterDemo{
	public static void main(String args[]) throws IOException{
		CharArrayWriter f = new CharArrayWriter();
		String W = "I/O stream classes have become a thicket in Java";
		char buf[] = new char[W.length()];
		W.getChars(0, W.length(), buf, 0);
		f.write(buf);
		System.out.println("\nBuffer of default size:");
		System.out.println(f.toString());
		System.out.println("\n\nWhat goes into the array-->");
		char A[] = f.toCharArray();
		for (int j=0; j<A.length; j++){
			System.out.print(A[j]);
		}
		System.out.println("\n\nFinally going to FileWriter()-->");
		FileWriter f2 = new FileWriter("cofbean.txt");
		f.writeTo(f2);
		f2.close();
		System.out.println("\n........ after a quick reset");
		f.reset();
		for (int j=0; j<3; j++)
			f.write('O');
		System.out.println(f.toString());
	}
}