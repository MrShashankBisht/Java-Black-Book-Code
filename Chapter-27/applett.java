import java.awt.*;
import java.applet.Applet;
/*
<APPLET
CODE=applett.class
WIDTH=200
HEIGHT=200>
<PARAM NAME=archive VALUE="applet.jar">
</APPLET>
*/
public class applett extends Applet {
public void paint(Graphics g) {
g.drawString("Hello from Java!", 60, 100);
}
}
