
import java.applet.Applet;
import java.awt.*;
import java.io.*;
/* <APPLET
CODE=writer.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class writer extends Applet {
public void init() {
byte data[] = "This is a string of text.".getBytes();
try {
FileOutputStream fileoutputstream = new
FileOutputStream("file.txt");
fileoutputstream.write(data);
fileoutputstream.close();
} catch (Exception e) {
System.out.println("Error: " + e);
}
}
}

