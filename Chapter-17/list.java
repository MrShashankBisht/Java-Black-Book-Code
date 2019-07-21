import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
/*
<APPLET
CODE=list.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class list extends JApplet implements ListSelectionListener
{
JList jlist;
public void init()
{
Container contentPane = getContentPane();
String[] items = new String[12];
for(int loop_index = 0; loop_index <= 11; loop_index++) {
items[loop_index] = "Item " + loop_index;
}
jlist = new JList(items);
JScrollPane jscrollpane = new JScrollPane(jlist);
jlist.setVisibleRowCount(5);
jlist.addListSelectionListener(this);
contentPane.setLayout(new FlowLayout());
contentPane.add(jscrollpane);
}
public void valueChanged(ListSelectionEvent e)
{
String outString = "You chose item: ";
outString += jlist.getSelectedIndex();
showStatus(outString);
}
}
