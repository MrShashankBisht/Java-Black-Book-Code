import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE=checkselected.class
WIDTH=500
HEIGHT=90 >
</APPLET> */
public class checkselected extends JApplet implements ItemListener {
JCheckBox checks[];
JTextField text;
public void init() {
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
checks = new JCheckBox[5];
for(int loop_index = 1; loop_index <= checks.length - 1; loop_index++){
checks[loop_index] = new JCheckBox("Check " + loop_index);
checks[loop_index].addItemListener(this);
contentPane.add(checks[loop_index]);
}
text = new JTextField(40);
contentPane.add(text);
}
public void itemStateChanged(ItemEvent e)
{
String outString = new String("Currently selected:\n");

for(int loop_index = 1; loop_index <= checks.length - 1; loop_index++){
if(checks[loop_index].isSelected()) {
outString += " check box " + loop_index;
}
}
text.setText(outString);
}

}
