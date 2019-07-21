import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=canvas.class
WIDTH=400
HEIGHT=200 >
</APPLET>
*/
public class canvas extends java.applet.Applet implements MouseListener {
graphicsCanvas gc;
Button button1;
public void init()
{
gc = new graphicsCanvas();
gc.setSize(100, 100);
add(gc);
addMouseListener(this);
}

public void mousePressed(MouseEvent e){}
public void mouseClicked(MouseEvent e)
{
for(int loop_index = 0; loop_index < 150; loop_index++){
gc.setLocation(loop_index, 0);
}
}
public void mouseReleased(MouseEvent e){}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
}
class graphicsCanvas extends java.awt.Canvas
{
public void paint (Graphics g)
{
g.drawOval(10, 50, 40, 40);
g.drawLine(10, 50, 50, 90);
g.drawLine(50, 50, 10, 90);
}
}
