import java.util.*;
public class PrinterDemo3{
	public static void main(String[] argv){
		int i = 65;
		String str =String.format("%1$td %1$tb %1$ty", new Date());
		System.out.println(str);
	}
}
