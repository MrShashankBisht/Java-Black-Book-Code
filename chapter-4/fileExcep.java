import java.io.*;
public class fileExcep {
	public static void main(String[] args) {
			openFile("test1.bmp");
	}
	public static void openFile(String name) {
		try {
			FileInputStream f = new FileInputStream(name);
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}