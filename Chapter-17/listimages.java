import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE=listimages.class
WIDTH=300
HEIGHT=300 >
</APPLET>
*/
public class listimages extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
newModel newmodel = new newModel();
newRenderer newrenderer = new newRenderer();
JList jlist = new JList(newmodel);
jlist.setCellRenderer(newrenderer);
jlist.setVisibleRowCount(6);
contentPane.add(new JScrollPane(jlist));
}
}
class newModel extends DefaultListModel
{
public newModel()
{
for(int loop_index = 0; loop_index <= 12; loop_index++) {
addElement(new Object[] {"Item " + loop_index,
new ImageIcon("bulg1.jpg")});
}
}
}

class newRenderer extends JLabel implements ListCellRenderer
{
public newRenderer()
{
setOpaque(true);
}
public Component getListCellRendererComponent(
JList jlist, Object obj, int index, boolean isSelected,
boolean focus)
{
newModel model = (newModel)jlist.getModel();
setText((String)((Object[])obj)[0]);
setIcon((Icon)((Object[])obj)[1]);
if(!isSelected) {
setBackground(jlist.getBackground());
setForeground(jlist.getForeground());
}
else {
setBackground(jlist.getSelectionBackground());
setForeground(jlist.getSelectionForeground());
}
return this;
}
}