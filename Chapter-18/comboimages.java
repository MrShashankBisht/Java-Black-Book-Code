import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE = comboimages.class
WIDTH = 400
HEIGHT = 430 >
</APPLET>
*/
public class comboimages extends JApplet {
public void init() {
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
newModel newmodel = new newModel();
newRenderer newrenderer = new newRenderer();
JComboBox jcombobox = new JComboBox(newmodel);
jcombobox.setRenderer(newrenderer);
contentPane.add(new JScrollPane(jcombobox));
}
}
class newModel extends DefaultComboBoxModel {
public newModel() {
for(int loop_index = 0; loop_index <= 10; loop_index++) {
addElement(new Object[] {"Item " + loop_index,
new ImageIcon("zoll1.jpg")});
}
}
}
class newRenderer extends JLabel implements ListCellRenderer {
public newRenderer() {
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

