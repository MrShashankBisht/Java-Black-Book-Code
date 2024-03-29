import java.io.File;
class FileDemo
{
	public static void main(String args[])
	{
		File file1 = new File("file.txt");
		System.out.println("File: " + file1.getName() + (file1.isFile() ?
		" is a file" : " is a named pipe or directory"));
		System.out.println("Size: " + file1.length());
		System.out.println("Path: " + file1.getPath());
		System.out.println("Parent: " + file1.getParent());
		System.out.println("Absolute Path: " + file1.getAbsolutePath());
		System.out.println("File was last modified: " +
		file1.lastModified());
		System.out.println(file1.exists() ? "File exists" :
		"File does not exist");
		System.out.println(file1.canRead() ? "File can be read from" :
		"File cannot be read from");
		System.out.println(file1.canWrite() ? "File can be written to" :
		"File cannot be written to");
		System.out.println(file1.isDirectory() ? "File is a directory" :
		"File is not a directory");
		System.out.println(file1.isFile() ? "is a true file" :
		"is a special file");
		System.out.println(file1.isAbsolute() ? "is absolute" :
		"is not absolute");
	}
}
