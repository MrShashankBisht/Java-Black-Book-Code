import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.motif.MotifLookAndFeel;
import javax.swing.plaf.windows.WindowsLookAndFeel;
/*
<APPLET
CODE=plaf.class
WIDTH=210
HEIGHT=200 >
</APPLET>
*/
public class plaf extends JApplet
{
JRadioButton b1 = new JRadioButton("Metal"),
b2 = new JRadioButton("Motif"),
b3 = new JRadioButton("Windows");
public void init()
{
Container contentPane = getContentPane();
contentPane.add(new jpanel(), BorderLayout.CENTER);
}
class jpanel extends JPanel implements ActionListener
{
public jpanel()
{
add(new JButton("JButton"));
add(new JTextField("JTextField"));
add(new JCheckBox("JCheckBox"));
add(new JRadioButton("JRadioButton"));
add(new JLabel("JLabel"));
add(new JList(new String[] {
"JList Item 1", "JList Item 2", "JList Item 3"}));
add(new JScrollBar(SwingConstants.HORIZONTAL));
ButtonGroup group = new ButtonGroup();
group.add(b1);
group.add(b2);
group.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
add(b1);
add(b2);
add(b3);
}
public void actionPerformed(ActionEvent e)
{
JRadioButton src = (JRadioButton)e.getSource();
try {
if((JRadioButton)e.getSource() == b1)
UIManager.setLookAndFeel(
"javax.swing.plaf.metal.MetalLookAndFeel");
else if((JRadioButton)e.getSource() == b2)
UIManager.setLookAndFeel(
"com.sun.java.swing.plaf.motif.MotifLookAndFeel");
else if((JRadioButton)e.getSource() == b3)
UIManager.setLookAndFeel(
"com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
);
}
catch(Exception ex) {}
SwingUtilities.updateComponentTreeUI(getContentPane());
}
}
}
