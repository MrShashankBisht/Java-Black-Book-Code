import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class button extends Applet implements ActionListener {
/*
<APPLET
CODE=button.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
TextField text1;
Button button1;
public void init() {
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
