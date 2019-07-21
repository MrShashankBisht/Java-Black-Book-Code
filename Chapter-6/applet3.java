import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=applet3.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class applet3 extends Applet implements FocusListener, MouseWheelListener
{
TextArea text1;
Button button1, button2, button3;
public void init()
{
text1 = new TextArea("",8,18);
add(text1);
button1 = new Button("Press Tab1!");
button2 = new Button("Press Tab2!");
button3 = new Button("Press Tab3!");
add(button1);
add(button2);
add(button3);
button1.addFocusListener(this);
button2.addFocusListener(this);
button3.addFocusListener(this);
button1.setFocusable(false);
button2.requestFocusInWindow();
text1.addMouseWheelListener(this);
}
public void focusGained(FocusEvent event)
{
String msg = new String ("Focus is on Button2!");
if(event.getSource() == button2){
text1.setText(msg);
transferFocusUpCycle();
}
if(event.getSource() == button3){
transferFocusBackward();
}
}
public void focusLost(FocusEvent e) {}
public void mouseWheelMoved(MouseWheelEvent e) {}
}

