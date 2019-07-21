import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = desktopframe.class
WIDTH = 350
HEIGHT = 280>
</APPLET>
*/
public class desktopframe extends JApplet
{
JDesktopPane jdesktoppane = new JDesktopPane();
public void init()
{
Container contentPane = getContentPane();
contentPane.add(jdesktoppane, BorderLayout.CENTER);
}
}
