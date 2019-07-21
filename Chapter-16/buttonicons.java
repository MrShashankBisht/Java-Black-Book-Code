import java.awt.*;
import javax.swing.*;
/* <APPLET
CODE=buttonicons.class
WIDTH=300
HEIGHT=200 >
</APPLET>*/
public class buttonicons extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
Icon normal = new ImageIcon("rollover 1.jpg");
Icon rollover = new ImageIcon("rollover 2.jpg");
Icon pressed = new ImageIcon("rollover 3.jpg");

JButton jbutton = new JButton();
jbutton.setRolloverEnabled(true);
jbutton.setIcon(normal);
jbutton.setRolloverIcon(rollover);

jbutton.setPressedIcon(pressed);
contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton);
}
}
