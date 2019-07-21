import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=password.class
WIDTH=300
HEIGHT=300 >
</APPLET>
*/
public class password extends Applet implements ActionListener
{
public TextField text1;
public TextField text2;
public void init() {
text1 = new TextField(20);
add(text1);
text2 = new TextField(20);
add(text2);
text1.setEchoChar('*');
text1.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource() == text1){
text2.setText(text1.getText());
}
}
}