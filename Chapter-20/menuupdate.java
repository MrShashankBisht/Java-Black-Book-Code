import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = menuupdate.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class menuupdate extends JApplet implements ActionListener
{
JMenuBar jmenubar = new JMenuBar();
JMenu jmenu1 = new JMenu("File");
JMenu jmenu2 = new JMenu("Edit");
JMenuItem jmenuitem1 = new JMenuItem("New..."),
jmenuitem2 = new JMenuItem("Open..."),
jmenuitem3 = new JMenuItem("Exit"),
jmenuitem4 = new JMenuItem("Add item"),
jmenuitem5 = new JMenuItem("Remove item"),
jmenuitem6 = new JMenuItem("New item");
public void init()
{
jmenu1.add(jmenuitem1);
jmenu1.add(jmenuitem2);
jmenu1.addSeparator();
jmenu1.add(jmenuitem3);
jmenuitem1.setActionCommand("You selected New");
jmenuitem2.setActionCommand("You selected Open");
jmenuitem1.addActionListener(this);
jmenuitem2.addActionListener(this);
jmenu2.add(jmenuitem4);
jmenu2.add(jmenuitem5);
jmenuitem4.setActionCommand("You selected Cut");
jmenuitem5.setActionCommand("You selected Copy");
jmenuitem4.addActionListener(this);
jmenuitem5.addActionListener(this);
jmenubar.add(jmenu1);
jmenubar.add(jmenu2);
setJMenuBar(jmenubar);
}
public void actionPerformed(ActionEvent e)
{
JMenuItem jmenuitem = (JMenuItem)e.getSource();
if(jmenuitem == jmenuitem4) {
jmenu2.add(jmenuitem6);
}
if(jmenuitem == jmenuitem5) {
jmenu2.remove(jmenuitem6);
}
}
}
