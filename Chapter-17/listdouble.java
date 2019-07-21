import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE=listdouble.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class listdouble extends JApplet implements MouseListener
{
public void init()
{
Container contentPane = getContentPane();
String[] items = {"Item 1", "Item 2", "Item 3", "Item 4",
"Item 5", "Item 6", "Item 7", "Item 8",
"Item 9", "Item 10", "Item 11", "Item 12"};
JList list = new JList(items);
contentPane.setLayout(new FlowLayout());
contentPane.add(new JScrollPane(list));
list.addMouseListener(this);
}
public void mouseClicked(MouseEvent e)
{
JList jlist = (JList)e.getSource();
int index = jlist.locationToIndex(e.getPoint());
String outString = new String("Number of clicks for item " +
++index + ": " + e.getClickCount());
showStatus(outString);
}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
}

