import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = menucheckbox.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class menucheckbox extends JApplet implements ActionListener
{
ImageIcon icon = new ImageIcon("bulg2.jpg");
JCheckBoxMenuItem
jcheckboxmenuitem1 = new JCheckBoxMenuItem("Item 1", icon),
jcheckboxmenuitem2 = new JCheckBoxMenuItem("Item 2", icon),
jcheckboxmenuitem3 = new JCheckBoxMenuItem("Item 3", icon),
jcheckboxmenuitem4 = new JCheckBoxMenuItem("Item 4", icon);
public void init()
{
Container contentPane = getContentPane();
JMenuBar jmenubar = new JMenuBar();
JMenu jmenu = new JMenu("Check Box Menu Items");
jcheckboxmenuitem1.addActionListener(this);
jcheckboxmenuitem2.addActionListener(this);
jcheckboxmenuitem3.addActionListener(this);
jcheckboxmenuitem4.addActionListener(this);
jmenu.add(jcheckboxmenuitem1);
jmenu.add(jcheckboxmenuitem2);
jmenu.add(jcheckboxmenuitem3);
jmenu.add(jcheckboxmenuitem4);
jmenubar.add(jmenu);
setJMenuBar(jmenubar);
}
public void actionPerformed(ActionEvent e)
{
showStatus("Item 1: " + jcheckboxmenuitem1.getState() +
" Item 2: " + jcheckboxmenuitem2.getState() +
" Item 3: " + jcheckboxmenuitem3.getState() +
" Item 4: " + jcheckboxmenuitem4.getState());
}
}
