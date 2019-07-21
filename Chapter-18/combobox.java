import java.awt.*;
import javax.swing.*;
/* <APPLET
CODE = combobox.class
WIDTH = 200
HEIGHT = 200 >
</APPLET>
*/
public class combobox extends JApplet
{
JComboBox jcombobox = new JComboBox();
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
}
}
