import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = menuaccelerator.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class menuaccelerator extends JApplet implements ActionListener
{
public void init()
{
Container contentPane = getContentPane();
JMenuBar jmenubar = new JMenuBar();
JMenu jmenu = new JMenu("File");
JMenuItem jmenuitem = new JMenuItem("New...");
jmenu.add(jmenuitem);
jmenu.add("Open ...");
jmenu.addSeparator();
jmenu.add("Exit");
jmenuitem.setMnemonic(KeyEvent.VK_N);
KeyStroke keystroke = KeyStroke.getKeyStroke(KeyEvent.VK_N,
Event.CTRL_MASK);
jmenuitem.setAccelerator(keystroke);
jmenuitem.addActionListener(this);
jmenubar.add(jmenu);
setJMenuBar(jmenubar);
}
public void actionPerformed(ActionEvent e)
{
showStatus("You selected the New item.");
}
}
