import java.awt.*;
import java.applet.Applet;

/*
<APPLET
    CODE=applet.class
    WIDTH=200
    HEIGHT=200>
    <PARAM NAME=archive VALUE="applet.jar">
</APPLET>
*/

public class applet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello from Java!", 60, 100);
    }
}
