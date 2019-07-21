
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=applet10.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
class newButton extends Button
{
applet10 a;
newButton(applet10 aref, String s)
{
super(s);
a = aref;
enableEvents(AWTEvent.ACTION_EVENT_MASK);
}
protected void processActionEvent (ActionEvent e)
{
super.processActionEvent(e);
a.text1.setText("Hello from Java!");
}
}

public class applet10 extends Applet {
TextField text1;
Button button1;
public void init()
{
text1 = new TextField(20);
add(text1);
button1 = new newButton(this, "Click Here!");
add(button1);
}
}
