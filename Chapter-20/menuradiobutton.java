import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = menuradiobutton.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class menuradiobutton extends JApplet implements ItemListener
{
ImageIcon icon = new ImageIcon("bulg2.jpg");
JRadioButtonMenuItem
jradiobuttonmenuitem1 = new JRadioButtonMenuItem("Item 1", icon),
jradiobuttonmenuitem2 = new JRadioButtonMenuItem("Item 2", icon),
jradiobuttonmenuitem3 = new JRadioButtonMenuItem("Item 3", icon),
jradiobuttonmenuitem4 = new JRadioButtonMenuItem("Item 4", icon);
public void init()
{
Container contentPane = getContentPane();
JMenuBar jmenubar = new JMenuBar();
JMenu jmenu = new JMenu("Radio Button Menu Items");
jmenu.add(jradiobuttonmenuitem1);
jmenu.add(jradiobuttonmenuitem2);
jmenu.add(jradiobuttonmenuitem3);
jmenu.add(jradiobuttonmenuitem4);
ButtonGroup group = new ButtonGroup();
group.add(jradiobuttonmenuitem1);
group.add(jradiobuttonmenuitem2);
group.add(jradiobuttonmenuitem3);
group.add(jradiobuttonmenuitem4);
jradiobuttonmenuitem1.addItemListener(this);
jradiobuttonmenuitem2.addItemListener(this);
jradiobuttonmenuitem3.addItemListener(this);
jradiobuttonmenuitem4.addItemListener(this);
jmenubar.add(jmenu);
setJMenuBar(jmenubar);
}
public void itemStateChanged(ItemEvent e)
{
JMenuItem jmenuitem = (JMenuItem) e.getSource();
String itemtext = jmenuitem.getText();
if(e.getStateChange() == ItemEvent.SELECTED)
itemtext += " was selected";
else
itemtext += " was deselected";
showStatus(itemtext);
}
}
