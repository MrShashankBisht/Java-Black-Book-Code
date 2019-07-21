import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = splitpane3.class
WIDTH = 600
HEIGHT = 200 >
</APPLET>
*/
public class splitpane3 extends JApplet implements ActionListener
{
JButton jbutton1, jbutton2;
JTextField text1 = new JTextField("Text 1");
JTextField text2 = new JTextField("Text 2");
JSplitPane jsplitpane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
text1, text2);


public void init()
{
Container contentPane = getContentPane();
JPanel jpanel = new JPanel();
jbutton1 = new JButton("Make one-touch expandable");
jbutton1.addActionListener(this);
jpanel.add(jbutton1);
jbutton2 = new JButton("Make split horizontal");
jbutton2.addActionListener(this);
jpanel.add(jbutton2);
contentPane.add(jsplitpane, BorderLayout.CENTER);
contentPane.add(jpanel, BorderLayout.SOUTH);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == jbutton1) {
jsplitpane.setOneTouchExpandable(true);
}
if(e.getSource() == jbutton2) {
jsplitpane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
}
}
}
