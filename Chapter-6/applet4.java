
import java.applet.Applet;
import java.awt.*;
/*
<APPLET
CODE=applet4.class
WIDTH=200
HEIGHT=200 >
<PARAM NAME = string VALUE = "Hello from Java!">
</APPLET>
*/

public class applet4 extends Applet
{
public void paint(Graphics g)
{
g.drawString(getParameter("string"), 60, 100);
}
}
