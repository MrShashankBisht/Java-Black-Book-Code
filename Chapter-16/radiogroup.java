import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE=radiogroup.class
WIDTH=340
HEIGHT=200 >
</APPLET> */
public class radiogroup extends JApplet implements ItemListener {
JRadioButton radio1, radio2, radio3, radio4;
ButtonGroup group;
JTextField text;
public void init() {
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
group = new ButtonGroup();
radio1 = new JRadioButton("Radio 1");
radio2 = new JRadioButton("Radio 2");
radio3 = new JRadioButton("Radio 3");
radio4 = new JRadioButton("Radio 4");
group.add(radio1);
group.add(radio2);
group.add(radio3);
group.add(radio4);
radio1.addItemListener(this);
radio2.addItemListener(this);
radio3.addItemListener(this);
radio4.addItemListener(this);
contentPane.add(radio1);
contentPane.add(radio2);
contentPane.add(radio3);
contentPane.add(radio4);
text = new JTextField(20);
contentPane.add(text);
}
public void itemStateChanged(ItemEvent e) {

if (e.getItemSelectable() == radio1) {
text.setText("You clicked radio button 1.");
} else if (e.getItemSelectable() == radio2) {
text.setText("You clicked radio button 2.");
} else if (e.getItemSelectable() == radio3) {
text.setText("You clicked radio button 3.");
} else if (e.getItemSelectable() == radio4) {
text.setText("You clicked radio button 4.");
}
}
}
