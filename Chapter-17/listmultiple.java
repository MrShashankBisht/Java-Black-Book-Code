import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
/*
<APPLET
CODE=listmultiple.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class listmultiple extends JApplet implements ListSelectionListener
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
jlist.setSelectionMode(
ListSelectionModel.MULTIPLE_INTERVAL_SELECTION
);
jlist.addListSelectionListener(this);
contentPane.setLayout(new FlowLayout());
contentPane.add(jscrollpane);
}

public void valueChanged(ListSelectionEvent e)
{
int[] indexes = jlist.getSelectedIndices();
String outString = "You chose:";
for(int loop_index = 0; loop_index < indexes.length; loop_index++){
outString += " item " + indexes[loop_index];
}
showStatus(outString);
}
}
