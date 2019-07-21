import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE = comboboxedit.class
WIDTH = 200
HEIGHT = 200 >
</APPLET>
*/
public class comboboxedit extends JApplet implements ActionListener {
private JComboBox jcombobox = new JComboBox();
public void init() {
Container contentPane = getContentPane();
jcombobox.addItem("Item 1");
jcombobox.addItem("Item 2");
jcombobox.addItem("Item 3");
jcombobox.addItem("Item 4");
jcombobox.addItem("Item 5");
jcombobox.setEditable(true);
contentPane.setLayout(new FlowLayout());
contentPane.add(jcombobox);
jcombobox.getEditor().addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
String outString = (String)jcombobox.getSelectedItem()
+ " was changed to " + (String)jcombobox.getEditor().getItem();
showStatus(outString);
}
}
