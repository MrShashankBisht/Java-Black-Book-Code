import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = tabbedpaneorientation.class
WIDTH = 500
HEIGHT = 200 >
</APPLET>
*/
public class tabbedpaneorientation extends JApplet implements
ActionListener
{
JTabbedPane jtabbedpane = new JTabbedPane(SwingConstants.BOTTOM);
JButton button1, button2, button3, button4;
public void init()
{
Container contentPane = getContentPane();
JPanel buttonPanel = new JPanel();
JPanel jpanel1 = new JPanel();
JPanel jpanel2 = new JPanel();
JPanel jpanel3 = new JPanel();
jtabbedpane.setTabPlacement(JTabbedPane.TOP);
jtabbedpane.addTab("Panel 1",
new ImageIcon("tabb-1.jpg"),
jpanel1, "This is panel 1");
jtabbedpane.addTab("Panel 2",
new ImageIcon("tabb-1.jpg"),
jpanel2, "This is panel 2");
jtabbedpane.addTab("Panel 3",
new ImageIcon("tabb-1.jpg"),
jpanel3, "This is panel 3");
button1 = new JButton("Top");
button2 = new JButton("Left");
button3 = new JButton("Right");
button4 = new JButton("Bottom");
buttonPanel.add(button1);
buttonPanel.add(button2);
buttonPanel.add(button3);
buttonPanel.add(button4);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
contentPane.setLayout(new BorderLayout());
contentPane.add(jtabbedpane, BorderLayout.CENTER);
contentPane.add(buttonPanel, BorderLayout.SOUTH);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == button1) {
jtabbedpane.setTabPlacement(JTabbedPane.TOP);
}
else if(e.getSource() == button2) {
jtabbedpane.setTabPlacement(JTabbedPane.LEFT);
}
else if(e.getSource() == button3) {
jtabbedpane.setTabPlacement(JTabbedPane.RIGHT);
}
else if(e.getSource() == button4) {
jtabbedpane.setTabPlacement(JTabbedPane.BOTTOM);
}
jtabbedpane.validate();
}
}
