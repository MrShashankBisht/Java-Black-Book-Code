import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE = splitpane.class
WIDTH = 600
HEIGHT = 200 >
</APPLET>
*/
public class splitpane extends JApplet implements ActionListener
{
JTextField text1 = new JTextField("Text 1");
JTextField text2 = new JTextField("Text 2");
JSplitPane jsplitpane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
text1, text2);
public void init()
{
Container contentPane = getContentPane();
contentPane.add(jsplitpane, BorderLayout.CENTER);
}
public void actionPerformed(ActionEvent e)
{
}
}
