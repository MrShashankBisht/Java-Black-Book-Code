import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.KeyStroke;
/*
<APPLET
CODE=applet8.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class applet8 extends Applet implements FocusListener
{
public TextField text1;
public Button button1,button2;
public void init()
{
this.setFocusTraversalKeysEnabled(true);
text1 = new TextField(20);
add(text1);
button1 = new Button("Click Button1!");
button2 = new Button("Click Button2!");
add(button1);
add(button2);
button1.addFocusListener(this);
button2.addFocusListener(this);
}
public void focusGained(FocusEvent event)
{
if(event.getSource() == button1)
{
text1.setText("Button 1!");
}
if(event.getSource() == button2)
{
text1.setText("Button 2!");
}
}
public void focusLost(FocusEvent e) {}
}
