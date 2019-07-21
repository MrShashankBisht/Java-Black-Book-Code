import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=textarea.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class textarea extends Applet implements ActionListener
{
TextArea textarea1;
Button button1;
public void init()
{
textarea1 = new TextArea("", 10, 20, TextArea.SCROLLBARS_BOTH);
add(textarea1);
button1 = new Button("Click Me!");
add(button1);
button1.addActionListener(this);
}
public void actionPerformed (ActionEvent e)
{
String msg = "Hello from Java!";
if(e.getSource() == button1){
textarea1.insert(msg, 0);
}
}
}
