import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = menuimages.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class menuimages extends JApplet implements ActionListener
{
ImageIcon icon = new ImageIcon("bulg2.jpg");
public void init()
{
JMenuBar jmenubar = new JMenuBar();
JMenu jmenu1 = new JMenu("File");
JMenuItem jmenuitem1 = new JMenuItem("New...", icon),
jmenuitem2 = new JMenuItem("Open...", icon),
jmenuitem3 = new JMenuItem("Exit", icon);
jmenu1.add(jmenuitem1);
jmenu1.add(jmenuitem2);
jmenu1.addSeparator();
jmenu1.add(jmenuitem3);
jmenuitem1.setActionCommand("You selected New");
jmenuitem2.setActionCommand("You selected Open");
jmenuitem1.addActionListener(this);
jmenuitem2.addActionListener(this);
JMenu jmenu2 = new JMenu("Edit");
JMenuItem jmenuitem4 = new JMenuItem("Cut", icon),
jmenuitem5 = new JMenuItem("Copy", icon),
jmenuitem6 = new JMenuItem("Paste", icon);
jmenu2.add(jmenuitem4);
jmenu2.add(jmenuitem5);
jmenu2.add(jmenuitem6);
jmenuitem4.setActionCommand("You selected Cut");
jmenuitem5.setActionCommand("You selected Copy");
jmenuitem6.setActionCommand("You selected Paste");
jmenuitem4.addActionListener(this);
jmenuitem5.addActionListener(this);
jmenuitem6.addActionListener(this);
jmenubar.add(jmenu1);
jmenubar.add(jmenu2);
setJMenuBar(jmenubar);
}
public void actionPerformed(ActionEvent e)
{
JMenuItem jmenuitem = (JMenuItem)e.getSource();
showStatus(jmenuitem.getActionCommand());
}
}
