import java.io.*;
import java.lang.*;

public class fileExcep1 {
	public static void main(String[] args) {
		try {
			openFile("test1.bmp");
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
	public static void openFile(String name) throws FileNotFoundException {
			FileInputStream f = new FileInputStream(name);
	}
}