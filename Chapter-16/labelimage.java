import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE=labelimage.class
WIDTH=400
HEIGHT=200 >
</APPLET>
*/
public class labelimage extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
JLabel jlabel = new JLabel("Label", new ImageIcon("label.jpg"),
JLabel.CENTER);
jlabel.setVerticalTextPosition(JLabel.BOTTOM);
jlabel.setHorizontalTextPosition(JLabel.CENTER);
contentPane.add(jlabel);
}
}
