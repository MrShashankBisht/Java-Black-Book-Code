import java.io.PrintWriter;
public class PrintWriterDemo {
  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out, true);
    out.println("Hello, world");
  }
} 