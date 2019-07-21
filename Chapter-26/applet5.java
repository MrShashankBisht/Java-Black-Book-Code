import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=applet5.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class applet5 extends Applet
{
public String s = "Hello from Java!";
public void init() {
addMouseListener(new ma(this));
}
public void paint(Graphics g)
{
g.drawString(s, 30, 100);
}
}

class ma extends MouseAdapter {
applet5 a;
ma(applet5 appletobject)
{
a = appletobject;
}
public void mouseClicked(MouseEvent me)
{
a.s = "Hello to Java!";
a.repaint();
}
public void mouseReleased(MouseEvent me)
{
MouseListener[] ml=a.getMouseListeners();
        for (int i=0;i<ml.length;i++) {
                    if (ml[i]!=a) {
                                a.removeMouseListener(ml[i]);
                                a.s="Mouse Listerner Removed";
				a.repaint();
                   }
	 }
}
}
