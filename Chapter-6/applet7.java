
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=applet7.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class applet7 extends Applet
{
public TextField text1;
public Button button1;
public void init()
{
text1 = new TextField(20);
add(text1);
button1 = new Button("Click Here!");
add(button1);
a obj = new a(this);
button1.addActionListener(obj);
}
}
class a implements ActionListener {
applet7 c;
a(applet7 appletobject)
{
c = appletobject;
}
public void actionPerformed(ActionEvent event)
{
String msg = new String ("Hello from Java!");
if(event.getSource() == c.button1){
c.text1.setText(msg);
}
}
}
