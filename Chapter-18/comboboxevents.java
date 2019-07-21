import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = comboboxevents.class
WIDTH = 300
HEIGHT = 200 >

</APPLET>
*/
public class comboboxevents extends JApplet implements ItemListener
{
JComboBox jcombobox = new JComboBox();
String outString = "";
public void init()
{
Container contentPane = getContentPane();
jcombobox.addItem("Item 1");
jcombobox.addItem("Item 2");
jcombobox.addItem("Item 3");
jcombobox.addItem("Item 4");
jcombobox.addItem("Item 5");
contentPane.setLayout(new FlowLayout());
contentPane.add(jcombobox);
jcombobox.addItemListener(this);
}
public void itemStateChanged(ItemEvent e) {
if(e.getStateChange() == ItemEvent.SELECTED)
outString += "Selected: " + (String)e.getItem();
else
outString += "Deselected: " + (String)e.getItem();
showStatus(outString);
}
}
