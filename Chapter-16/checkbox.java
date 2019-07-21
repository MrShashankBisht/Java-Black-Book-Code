import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE=checkbox.class
WIDTH=340
HEIGHT=200 >
</APPLET>*/
public class checkbox extends JApplet implements ItemListener
{
JCheckBox check1, check2, check3, check4;
JTextField text;
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
check1 = new JCheckBox("Check 1");
check2 = new JCheckBox("Check 2");
check3 = new JCheckBox("Check 3");
check4 = new JCheckBox("Check 4");
check1.addItemListener(this);
check2.addItemListener(this);
check3.addItemListener(this);
check4.addItemListener(this);
contentPane.add(check1);
contentPane.add(check2);
contentPane.add(check3);
contentPane.add(check4);
text = new JTextField(20);
contentPane.add(text);
}
public void itemStateChanged(ItemEvent e)
{
if (e.getItemSelectable() == check1) {
text.setText("You clicked check box 1.");

} else if (e.getItemSelectable() == check2) {
text.setText("You clicked check box 2.");

} else if (e.getItemSelectable() == check3) {
text.setText("You clicked check box 3.");

} else if (e.getItemSelectable() == check4) {
text.setText("You clicked check box 4.");

}
}
}
