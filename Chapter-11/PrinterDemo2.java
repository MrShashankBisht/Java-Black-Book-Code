public class PrinterDemo2{
	public static void main(String[] argv){
	int i = 65;
	String str = String.format("char: %c integral: %<d octal: %<o hex: %<x %n", i);
	System.out.println(str);
	}
}