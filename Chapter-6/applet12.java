
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=applet12.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class applet12 extends Applet
{
public String s = "Hello from Java!";
public void init() {
addMouseListener(new MouseAdapter(){
public void mousePressed(MouseEvent me) {
s = "Hello to Java!";
repaint();
}});
}
public void paint(Graphics g) {
g.drawString(s, 60, 100);
}
}
