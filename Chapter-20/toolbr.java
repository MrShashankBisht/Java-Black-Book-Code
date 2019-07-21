import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = toolbr.class
WIDTH = 500
HEIGHT = 280 >
</APPLET>
*/
public class toolbr extends JApplet implements ActionListener,
ItemListener 
{
JButton jbutton1 = new JButton("Button 1", new
ImageIcon("bulg2.jpg"));
JButton jbutton2 = new JButton("Button 2", new
ImageIcon("bulg2.jpg"));
JComboBox jcombobox = new JComboBox();
public void init() 
{
Container contentPane = getContentPane();
JToolBar jtoolbar = new JToolBar();
jbutton1.addActionListener(this);
jbutton2.addActionListener(this);
jcombobox.addItem("Item 1");
jcombobox.addItem("Item 2");
jcombobox.addItem("Item 3");
jcombobox.addItem("Item 4");
jcombobox.addItemListener(this);
jtoolbar.add(jbutton1);
jtoolbar.addSeparator();
jtoolbar.add(jbutton2);
jtoolbar.addSeparator();
jtoolbar.add(jcombobox);
contentPane.add(jtoolbar, BorderLayout.NORTH);
}
public void actionPerformed(ActionEvent e) 
{
if(e.getSource() == jbutton1) 
{
showStatus("You clicked button 1");
} 
else if (e.getSource() == jbutton2) 
{
showStatus("You clicked button 2");
}
}
public void itemStateChanged(ItemEvent e) 
{
String outString = "";
if(e.getStateChange() == ItemEvent.SELECTED)
outString += "Selected: " + (String)e.getItem();
else
outString += "Deselected: " + (String)e.getItem();
showStatus(outString);
}
}
