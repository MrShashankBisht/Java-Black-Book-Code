import java.util.*;
public class PrinterDemo4{
	public static void main(String[] argv){
		double avg     = 6.0e23;
		StringBuffer buf = new StringBuffer();
		Formatter frmter = new Formatter(buf, Locale.US);
		frmter.format("avg's number: %e %n", avg);
		frmter.format("base of the natural log: %e %n", Math.E);
		System.out.println(buf.toString());
	}
}

