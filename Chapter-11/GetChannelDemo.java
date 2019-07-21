import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class GetChannelDemo{
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception{
		FileChannel filechl = new  	FileOutputStream("file6.txt").getChannel();
		filechl.write(ByteBuffer.wrap("Some text ".getBytes()));
		filechl.close();
		filechl = new RandomAccessFile("file6.txt", "rw").getChannel();
		filechl.position(filechl.size());
		filechl.write(ByteBuffer.wrap("Some more text".getBytes()));
		filechl.close();
		filechl = new FileInputStream("file6.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		filechl.read(buff);
		buff.flip();
		while(buff.hasRemaining())
			System.out.print((char)buff.get());
	}
}
