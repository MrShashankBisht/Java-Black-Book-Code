import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/* <APPLET
CODE=jborder.class
WIDTH=300
HEIGHT=200 >
</APPLET>*/
public class jborder extends JApplet {
jpanel j;
public void init() {
Container contentPane = getContentPane();
j = new jpanel();
j.setBorder(BorderFactory.createRaisedBevelBorder());
contentPane.add(j);
}
}

class jpanel extends JPanel
{
public void paintComponent (Graphics g)
{
g.drawString("Swing with Border!",
getBorder().getBorderInsets(this).left, 50);
}
}
