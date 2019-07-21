import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE=label.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class label extends JApplet
{
public label()
{
Container contentPane = getContentPane();
JLabel jlabel = new JLabel("Hello from Swing!");
contentPane.setLayout(new FlowLayout());
contentPane.add(jlabel);
}
}
