
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=applet2.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class applet2 extends Applet implements ActionListener
{
TextField text1;
Button button1;
public void init()
{
text1 = new TextField(20);
add(text1);
button1 = new Button("Click Here!");
add(button1);
button1.addActionListener(this);
}
public void actionPerformed(ActionEvent event)
{
String msg = new String ("Hello from Java!");
if(event.getSource() == button1){
text1.setText(msg);
}
}
}
