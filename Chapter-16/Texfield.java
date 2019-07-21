import java.awt.*;
import javax.swing.*;
/* <APPLET
CODE=Texfield.class
WIDTH=300
HEIGHT=200 >
</APPLET>*/
public class Texfield extends JApplet {
JTextField text = new JTextField(20);
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(text);
text.setText("Hello from Swing!");
}
}
