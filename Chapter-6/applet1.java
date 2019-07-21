import java.applet.Applet;
import java.awt.*;
/*
<APPLET
CODE=applet1.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class applet1 extends Applet
{
public void init()
{
setBackground(Color.white);
}
public void start()
{
}
public void paint(Graphics g)
{
g.drawString("Hello from Java!", 60, 100);
}
public void stop()
{
}
public void destroy()
{
}
}

