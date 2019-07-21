import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


/*
<APPLET
CODE=mouse.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class mouse extends Applet implements MouseListener,
MouseMotionListener
{
TextField text1;
public void init(){
text1 = new TextField(30);
add(text1);
addMouseListener(this);
addMouseMotionListener(this);
}
public void mousePressed(MouseEvent e)
{
if((e.getModifiers() & InputEvent.BUTTON1_MASK) ==
InputEvent.BUTTON1_MASK){
text1.setText("Left mouse button down at " + e.getX() + "," +
e.getY());
}
else{
text1.setText("Right mouse button down at " + e.getX() + "," +
e.getY());
}
}
public void mouseClicked(MouseEvent e)
{
text1.setText("You clicked the mouse at " + e.getX() + "," +
e.getY());
}
public void mouseReleased(MouseEvent e)
{
text1.setText("The mouse button went up.");
}
public void mouseEntered(MouseEvent e)
{
text1.setText("The mouse entered.");
}
public void mouseExited(MouseEvent e)
{
text1.setText("The mouse exited.");
}
public void mouseDragged(MouseEvent e)
{
text1.setText("The mouse was dragged.");
}
public void mouseMoved(MouseEvent e)
{
text1.setText("The mouse was moved.");
}
}
