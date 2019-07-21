import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = popup.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class popup extends JApplet implements MouseListener
{
JLabel jlabel = new JLabel("Right click me!", JLabel.CENTER);
JPopupMenu jpopupmenu = new JPopupMenu();
public void init()
{
Container contentPane = getContentPane();
jpopupmenu.add(new JMenuItem("Cut", new ImageIcon("bulg2.jpg")));
jpopupmenu.add(new JMenuItem("Copy", new ImageIcon("bulg2.jpg")));
jpopupmenu.add(new JMenuItem("Paste", new ImageIcon("bulg2.jpg")));
jlabel.addMouseListener(this);
contentPane.add(jlabel);
}
public void mousePressed (MouseEvent e)
{
if((e.getModifiers() & InputEvent.BUTTON3_MASK) ==
InputEvent.BUTTON3_MASK)
jpopupmenu.show(jlabel, e.getX(), e.getY());
}
public void mouseClicked(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
}
