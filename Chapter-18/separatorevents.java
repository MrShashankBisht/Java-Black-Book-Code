import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = separatorevents.class
WIDTH = 300
HEIGHT = 200 >
</APPLET>
*/
public class separatorevents extends JApplet implements ComponentListener
{
JSeparator jseparator = new JSeparator(JSeparator.VERTICAL);
Dimension dimension = jseparator.getPreferredSize();
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());

contentPane.add(new JTextField("Hello from Swing!"));
contentPane.add(jseparator);
contentPane.add(new JTextField("Hello from Swing!"));
addComponentListener(this);
}
public void componentShown(ComponentEvent e)
{
jseparator.setPreferredSize(new Dimension(dimension.width,
getSize().height));
jseparator.revalidate();
}
public void componentResized(ComponentEvent e)
{
jseparator.setPreferredSize(new Dimension(dimension.width,
getSize().height));
jseparator.revalidate();
}
public void componentMoved(ComponentEvent e) {}
public void componentHidden(ComponentEvent e) {}
}
