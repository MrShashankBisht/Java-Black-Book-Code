import java.io.*;
class FileWriterDemo{
	public static void main(String args[]) throws Exception{
		char data[] = {'T','h','i','s',' ','i','s',' ','a',
			' ','s','t','r','i','n','g',' ','o','f',
			' ','t','e','x','t','.'};
		FileWriter filewriter1 = new FileWriter("file1.txt");
		for (int loop_index = 0; loop_index < data.length; loop_index++){
			filewriter1.write(data[loop_index]);
		}
		FileWriter filewriter2 = new FileWriter("file2.txt");
		filewriter2.write(data);
		FileWriter filewriter3 = new FileWriter("file3.txt");
		filewriter3.write(data, 5, 10);
		filewriter3.append("Hello there");
		filewriter1.close();
		filewriter2.close();
		filewriter3.close();
	}
}