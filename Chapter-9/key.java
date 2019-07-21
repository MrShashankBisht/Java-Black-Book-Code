import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/*
<APPLET
CODE=key.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class key extends Applet implements KeyListener {
String text = "";
public void init()
{
addKeyListener(this);
requestFocus();
}
public void paint(Graphics g)
{
g.drawString(text, 0, 100);
}
public void keyTyped(KeyEvent e)
{
text= "Key Character";
text = text + e.getKeyChar();
repaint();
}
public void keyPressed(KeyEvent e) {}
public void keyReleased(KeyEvent e) {
text = "Key Location";
text = text + e.getKeyLocation();
}
}
