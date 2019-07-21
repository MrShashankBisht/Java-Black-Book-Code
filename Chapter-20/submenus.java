import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = submenus.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class submenus extends JApplet
{
public void init()
{
JMenuBar jmenubar = new JMenuBar();
JMenu jmenu = new JMenu("Sub Menus", true);
JMenu jsubmenu = new JMenu("Cascading Menu", true);
jmenu.add("Item 1");
jmenu.add("Item 2");
jmenu.add("Item 3");
jmenu.add("Item 4");
jsubmenu.add("Sub Item 1");
jsubmenu.add("Sub Item 2");
jsubmenu.add("Sub Item 3");
jsubmenu.add("Sub Item 4");
jmenu.add(jsubmenu);
jmenubar.add(jmenu);
setJMenuBar(jmenubar);
}
}
