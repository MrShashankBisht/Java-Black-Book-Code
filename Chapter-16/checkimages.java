import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE=checkimages.class
WIDTH=540
HEIGHT=200 >
</APPLET>
*/
public class checkimages extends JApplet implements ItemListener
{
JCheckBox check1;
JTextField text;
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
check1 = new JCheckBox("Check 1", new ImageIcon("rollover 4.jpg"));
check1.setSelectedIcon(new ImageIcon("rollover 5.jpg"));
check1.addItemListener(this);
contentPane.add(check1);
text = new JTextField(20);
contentPane.add(text);
}
public void itemStateChanged(ItemEvent e)
{
if (e.getItemSelectable() == check1) {
text.setText("You clicked check box 1.");
}
}
}
